package com.design.api;

import java.util.ServiceLoader;
import com.design.api.strategy.DuckView;
import com.design.api.strategy.Duck;
import com.design.api.adapter.Dog;
import com.design.imp.observer.*;

import java.util.stream.*;
import java.util.*;


import com.design.imp.observer.*;

public class Main{
    
    
    public static void main(String... args){
        
        ServiceLoader<DuckView> ducks = ServiceLoader.load(DuckView.class);
        for(Duck duck : ducks){
            duck.performFly();
            duck.performQuack();
            duck.swim();
            duck.display();
        }
        
        ServiceLoader<Dog> dogs = ServiceLoader.load(Dog.class);
        for(Dog dog : dogs){
            Duck duck = Dog.dogToDuck(dog);
            duck.performFly();
            duck.performQuack();
            duck.swim();
            duck.display();
        }
        
        CommunityNews publisher = CommunityNews.getInstance();
        List<GroupA> subscribers = Stream.generate(()->new GroupA(publisher))
                        .limit(10)
                        .peek(System.out::println)
                        .peek(GroupA::subscribe)
                        .peek(System.out::println)
                        .collect(Collectors.toList());
        publisher.post("New feed!");
        subscribers.forEach(System.out::println);
        
        
    }//main
    
    
}//class