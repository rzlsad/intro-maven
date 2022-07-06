package com.design.api.strategy;

import com.design.imp.strategy.fly.*;

public interface Fly{
    
    public static enum StandardFlies {
        FLYLONG(new FlyLong()),FLYSHORT(new FlyShort()),FLYNONE(new FlyNone());
        
        private final Fly fly;
        private StandardFlies (Fly fly){
            this.fly=fly;
        }
        
        public Fly getFly(){
            return fly;
        }
        
    }
    
    void fly();
    
}