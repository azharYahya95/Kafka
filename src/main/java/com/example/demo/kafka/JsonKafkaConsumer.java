package com.example.demo.kafka;

import com.example.demo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consumer(User user){
        LOGGER.info("Json message received -> {}",user.toString());
    }
}
