package javacore.jdbc.repository;

import javacore.jdbc.conn.ConnectionFactory;
import javacore.jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')", producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);

        }

    }

    public static void delete(int id) {
        String sql = String.format("DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');", id);

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' in the database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }

    }

    public static void update(Producer producer) {
        String sql = String.format("UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');", producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Update producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", producer.getId(), e);
        }

    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", producer.getId(), e);
        }

    }

    private static PreparedStatement preparedStatementUpdate(Connection comm, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = comm.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;

    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name");
        String sql = String.format("SELECT * FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                getProducer(producers, rs);

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'", metaData.getTableName(i));
                log.info("Column name '{}'", metaData.getColumnName(i));
                log.info("Column size '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

    }

    public static void showDriverMetaData() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Suports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Suports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Suports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Suports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Suports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Last row ? '{}'", rs.last());
            log.info("row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("First row ? '{}'", rs.first());
            log.info("row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Absolute row ? '{}'", rs.absolute(2));
            log.info("row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Relative row ? '{}'", rs.relative(-1));
            log.info("row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last row ? '{}'", rs.isLast());
            log.info("row number '{}'", rs.getRow());

            log.info("is first row ? '{}'", rs.isFirst());
            log.info("row number '{}'", rs.getRow());

            log.info("Last row ? '{}'", rs.last());
            log.info("--------------");
            rs.next();

            log.info("is afterLast row ? '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static List<Producer> findByNameAndUpdateUpperCase(String name) {
        log.info("Finding producer by name");
        String sql = String.format("SELECT * FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
//                rs.cancelRowUpdates();
                rs.updateRow();
                getProducer(producers, rs);

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding producer by name");
        String sql = String.format("SELECT * FROM anime_store.producer where name like '%%%s%%';", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            getProducer(producers, rs);

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding producer by name");
        String sql = String.format("SELECT * FROM anime_store.producer where name like '%%%s%%';", name);
        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding producer by name");
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                getProducer(producers, rs);

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding producer by name");
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                getProducer(producers, rs);

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection comm, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = comm.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;

    }

    private static CallableStatement callableStatementFindByName(Connection comm, String name) throws SQLException {
        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";
        CallableStatement cs = comm.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;

    }


    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static void getProducer(List<Producer> producers, ResultSet rs) throws SQLException {
        Producer producer = Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
        producers.add(producer);
    }
}
