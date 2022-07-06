package com.design.imp.adapter;

import com.design.api.strategy.Duck;
import com.design.api.adapter.Dog;


public class DogToDuck implements Duck{
    
    private final Dog dog;
    
    public DogToDuck(Dog dog){
        this.dog=dog;
    }
    
    public void performFly(){
        dog.walk();
    }
    
    public void performQuack(){
        dog.hav();
    }
    
    public void swim(){
        dog.swim();
    }
    
    public void display(){
        dog.display();
    }

}