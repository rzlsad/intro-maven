package com.design.imp.strategy;

import static com.design.api.strategy.Fly.StandardFlies.FLYLONG;
import static com.design.api.strategy.Quack.StandardQuacks.QUACKLOUD;

public class DuckType1 extends AbstractDuck {
    
    public DuckType1(){
        super(FLYLONG.getFly(),QUACKLOUD.getQuack());
    }
    
    public void display(){
        System.out.println("Duck type 1 has loud quack and long distance fly");
    }
 
}