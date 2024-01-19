package com.ismael.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "Ismael", groupId = "myGroup")
    public void consumeMsg(String msg){
      log.info(String.format("consuming message from ismael topic : %s", msg));
    }
}
