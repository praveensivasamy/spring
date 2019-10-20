package com.learn.springrecipes.sequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springrecipes.dao.SequenceDAO;


public class MainDAOCaller {

    private static final Logger log = LoggerFactory.getLogger(MainDAOCaller.class);
    
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext("com.learn.spring*");
        
        SequenceDAO dao = context.getBean(SequenceDAO.class);
        
        log.info("{}",dao.getSequence("S1"));
        log.info("{}",dao.getNextValue("S2"));
        
        
    }
}
