package com.design.imp.adapter;

import com.design.api.adapter.Dog;


public class DogType1 implements Dog{
    
    
    public void walk(){
        System.out.println("Dog is walking!");
    }
    
    public void hav(){
        System.out.println("Dog is barking!");
    }
    
    public void swim(){
        System.out.println("Dog is swimming!");
    }
    
    public void display(){
        System.out.println("Dog type 1 can walk bark and swim!");
    }

}