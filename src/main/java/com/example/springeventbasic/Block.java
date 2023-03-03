package com.example.springeventbasic;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Block {

    public static void block(int time) {
        time = time * 1000;
        try {
            Thread.sleep(time);
            log.info("작업 완료!");
        } catch (InterruptedException e) {
            log.error("broken Thread {}", e);
        }
    }
}
