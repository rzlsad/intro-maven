package com.design.imp.strategy.fly;


import com.design.api.strategy.Fly;


public final class FlyNone implements Fly {
    
    public void fly(){
        System.out.println("I can't fly!");
    }
    
}