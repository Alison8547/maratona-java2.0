package javacore.jdbc.test;


import javacore.jdbc.dominio.Producer;
import javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("mad house").build();
        //   ProducerService.save(producer);
        // ProducerService.delete(4);
        //  ProducerService.update(producerToUpdate);

        // List<Producer> producers = ProducerService.findAll();
        //   List<Producer> producers = ProducerService.findByName("mad");
        //  log.info("Producers found '{}'", producers);
        //  ProducerService.showProducerMetaData();
        // ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateUpperCase("Deen");
//       List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Bones");
//       log.info("Producers found '{}'", producers);
        //    ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("NHK");
        log.info("Producers found '{}'", producers);


    }
}
