package javacore.jdbc.test;


import javacore.jdbc.dominio.Producer;
import javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MAD HOUSE").build();
        //   ProducerService.save(producer);
        // ProducerService.delete(4);
        ProducerService.update(producerToUpdate);

    }
}
