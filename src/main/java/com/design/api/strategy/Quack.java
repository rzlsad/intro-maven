package com.design.api.strategy;

import com.design.imp.strategy.quack.*;

public interface Quack{
    
   public static enum StandardQuacks {
        
        QUACKLOUD(new QuackLoud()),QUACKSILENT(new QuackSilent());
        
        private Quack quack;
        private StandardQuacks(Quack quack){
            this.quack=quack;
        }
        public Quack getQuack(){
            return quack;
        }
        
    }
    
    void quack();
    
}