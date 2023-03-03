package com.example.springeventbasic;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BasicController {

    private final BlockingService blockingService;

    @GetMapping("block")
    public String block() {
        blockingService.execute();
        return "good";
    }

    @GetMapping("nonblock")
    public String nonblock() {
        blockingService.nonBlockExecute();
        return "good";
    }
}
