package com.design.api.observer;

public interface News{
    
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void feed();
}