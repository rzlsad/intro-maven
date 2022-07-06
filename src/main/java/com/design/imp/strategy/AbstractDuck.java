package com.design.imp.strategy;

import com.design.api.strategy.DuckView;
import com.design.api.strategy.Fly;
import com.design.api.strategy.Quack;

public abstract class AbstractDuck implements DuckView {
    
    private Fly fly;
    private Quack quack;
    
    public AbstractDuck(Fly fly, Quack quack){
        this.fly=fly;
        this.quack=quack;
    }
    
    public void performFly(){
        fly.fly();
    }
    
    public void performQuack(){
        quack.quack();
    }
    
    public void setFly(Fly fly){
        this.fly=fly;
    }
    
    public void setQuack(Quack quack){
        this.quack=quack;
    }
    
    public void swim(){
        System.out.println("Duck is a swimmer!");
    }
    
    
}