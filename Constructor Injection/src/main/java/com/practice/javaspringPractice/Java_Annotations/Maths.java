package com.practice.javaspringPractice.Java_Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Maths implements  HomeWork{
    @Override
    public String doHomework() {
        return "Solve The 150 Problems Of Maths for this week ";
    }


}
