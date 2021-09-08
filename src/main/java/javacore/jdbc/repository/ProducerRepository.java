package javacore.jdbc.repository;

import javacore.jdbc.conn.ConnectionFactory;
import javacore.jdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = String.format("INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s')", producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             final Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
