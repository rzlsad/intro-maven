package com.design.api.strategy;

public interface DuckView extends Duck{
    
    void setFly(Fly fly);
    void setQuack(Quack quack);
}