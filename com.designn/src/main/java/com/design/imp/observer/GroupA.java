package com.design.imp.observer;

import com.design.api.observer.Subscriber;
import com.design.api.observer.News;

public class GroupA implements Subscriber{
    private final int id;
    private News publisher;
    private static int counter;
    private String news;
    
    public GroupA(News publisher){
        this.publisher = publisher;
        news = "no news!";
        id=counter++;
    }
    
    public void subscribe(){
        publisher.subscribe(this);
    }
    
    public void unsubscribe(){
        publisher.unsubscribe(this);
    }
    
    public String getNews(){
        return news;
    }
    
    public void update(String msg){
        news = msg;
    }
        public String toString(){
        return "GroupA"+id+"["+news+"]";
    }
    
    
}