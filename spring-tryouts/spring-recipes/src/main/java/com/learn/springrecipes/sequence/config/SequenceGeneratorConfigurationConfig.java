package com.learn.springrecipes.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.springrecipes.sequence.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfigurationConfig {


    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator generator = new SequenceGenerator();
        generator.setInitial(10000);
        generator.setPrefix("A");
        generator.setSuffix("B");
        return generator;

    }

}
