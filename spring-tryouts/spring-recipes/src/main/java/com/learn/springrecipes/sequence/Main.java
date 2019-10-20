package com.learn.springrecipes.sequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springrecipes.sequence.config.SequenceGeneratorConfigurationConfig;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(SequenceGeneratorConfigurationConfig.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfigurationConfig.class);

        SequenceGenerator generator = context.getBean(SequenceGenerator.class);

        for (int i = 0; i < 5; i++) {
            log.info("Sequence {}", generator.getSequence());
        }

    }

}
