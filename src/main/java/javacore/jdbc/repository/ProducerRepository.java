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
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);

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
}
