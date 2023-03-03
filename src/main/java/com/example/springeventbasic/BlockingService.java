package com.example.springeventbasic;


import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BlockingService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void execute() {
        log.info("서비스 시작");
        Block.block(4);
        log.info("서비스 종료");
    }

    public void nonBlockExecute() {
        log.info("서비스 시작");
        applicationEventPublisher.publishEvent(BasicEvent.builder()
                .source(this)
                .name("hi")
                .build());
        log.info("서비스 종료");
    }

}
