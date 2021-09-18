package javacore.crud.repository;


import javacore.crud.conn.ConnectionFactory;
import javacore.crud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                getProducer(producers, rs);

            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection comm, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = comm.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;

    }

    private static void getProducer(List<Producer> producers, ResultSet rs) throws SQLException {
        Producer producer = Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
        producers.add(producer);
    }
}
