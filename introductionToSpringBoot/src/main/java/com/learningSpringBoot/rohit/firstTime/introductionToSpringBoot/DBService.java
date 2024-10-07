package com.learningSpringBoot.rohit.firstTime.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    //Field injection
//    @Autowired
    private DB db;

    //Contructor injection
    public DBService(DB db) {
        this.db = db;
    }

    String getData() {
        return db.getData();
    }
}
