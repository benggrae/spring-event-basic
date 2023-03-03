package com.example.springeventbasic;


import lombok.Builder;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class BasicEvent extends ApplicationEvent {

    private String name;

    @Builder
    public BasicEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
