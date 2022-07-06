package com.design.api.adapter;

import com.design.api.strategy.Duck;
import com.design.imp.adapter.DogToDuck;

public interface Dog{
    
    void hav();
    void walk();
    void swim();
    void display();
    public static Duck dogToDuck(Dog dog){
        return new DogToDuck(dog);
    }
    // comment
}