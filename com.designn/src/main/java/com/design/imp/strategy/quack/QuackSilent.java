package com.design.imp.strategy.quack;


import com.design.api.strategy.Quack;


public class QuackSilent implements Quack {
    
    public void quack (){
        System.out.println("I cannot quack!");
    }
    
}