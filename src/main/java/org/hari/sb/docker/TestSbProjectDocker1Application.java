package org.hari.sb.docker;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSbProjectDocker1Application {
    private static Logger logger = LoggerFactory.getLogger(TestSbProjectDocker1Application.class);

    public static void main(String[] args) {
        logger.info("Application is running");
        SpringApplication.run(TestSbProjectDocker1Application.class, args);
    }

    @PostConstruct
    public void init(){
        logger.info("Application started....");
    }

}
