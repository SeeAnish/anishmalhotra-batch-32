package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Address add;
    @Autowired
    private Account acc;

//    Person(Account acc, Address add)
//    {
//        this.acc = acc;
//        this.add = add;
//    }

}
