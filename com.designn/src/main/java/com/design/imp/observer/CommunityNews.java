package com.design.imp.observer;



import com.design.api.observer.News;
import com.design.api.observer.Subscriber;
import java.util.*;



public class CommunityNews implements News{
    
    private final Set<Subscriber> subscribers;
    private static CommunityNews publisher;
    private String news;
    
    
    
    private CommunityNews(){
        subscribers = new HashSet<>();
        news = "default news";
    }
    
    public static CommunityNews getInstance(){
        return publisher!=null ? publisher : (publisher = new CommunityNews());
    }
    
    public void post(String news){
        this.news = news;
        feed();
    }
    public String getNews(){
        return news;
    }
    
    public void subscribe(Subscriber s){
        s.update(news);
        subscribers.add(s);
    }
    
    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }
    
    public void feed(){
        subscribers.forEach(s->s.update(news));
    }
    
    
}