package com.practice.javaspringPractice.Java_Annotations;

import org.springframework.stereotype.Component;

@Component
public class DSA implements HomeWork{
    @Override
    public String doHomework() {
        return "Solve 5 Standard DSA Problem";
    }
}
