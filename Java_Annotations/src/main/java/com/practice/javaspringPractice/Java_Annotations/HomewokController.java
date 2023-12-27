package com.practice.javaspringPractice.Java_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomewokController {

    private HomeWork homeWork;
    // For Multiple Qualifiers
//    private HomeWork homeWork2;
    @Autowired
//    public  HomewokController(@Qualifier("DSA") HomeWork homework ,
//                              @Qualifier("maths") HomeWork homeWork2){
//        homeWork = homework;
//        this.homeWork2 = homeWork2;
//    }

    // Used @Primary Annotation  On Maths  Class But Qulifier have Higher Priority than primary
    
    public  HomewokController(HomeWork homework){
        homeWork = homework;

    }
    @GetMapping("/Maths")
    public String doMathsHomework(){
        return  homeWork.doHomework();
    }

    // It will Give Conflics So we have to use either @Primary Annotations
    // On Class DSA or we have to @Qualifier Annotations For Constructor
    @GetMapping("/DSA")
    public String doDSAHomework(){
        return  homeWork.doHomework();
    }
}
