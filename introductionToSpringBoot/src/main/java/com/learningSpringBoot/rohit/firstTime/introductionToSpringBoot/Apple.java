package com.learningSpringBoot.rohit.firstTime.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    void eat() {
        System.out.println("You can eat the apple");
    }


    @PostConstruct //By this spring boot will consider to call this method whenever the bean of this class will be created
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating apple before user");
    }

    @PreDestroy //When application closed then this method will be called
    void callThisBeforeDestroy() {
        System.out.println("Destroying the apple bean");
    }
}
