package com.example.springeventbasic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class BasicEventListener implements ApplicationListener<BasicEvent> {

    @Override
    @Async("taskPoll")
    public void onApplicationEvent(BasicEvent event) {
        Block.block(5);
    }
}
