package com.example.kanza_yahya.testarham;

import java.io.Serializable;

/**
 * Created by KaNza_Yahya on 21/06/2018.
 */

public class Person implements Serializable {
    private static final long serialversionUID= 1L;
    private  String name;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
