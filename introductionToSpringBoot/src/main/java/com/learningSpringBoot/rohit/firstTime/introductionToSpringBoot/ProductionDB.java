package com.learningSpringBoot.rohit.firstTime.introductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue="production")
public class ProductionDB implements DB{

    public String getData() {
        return "Production Data";
    }
}
