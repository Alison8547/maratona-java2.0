package javacore.jdbc.test;

import javacore.jdbc.dominio.Producer;
import javacore.jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        log.info(producers);
    }
}
