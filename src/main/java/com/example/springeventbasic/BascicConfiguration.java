package com.example.springeventbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class BascicConfiguration {

    @Bean(name = "taskPoll")
    public TaskExecutor taskPoll() {
        ThreadPoolTaskExecutor tpe  = new ThreadPoolTaskExecutor();
        tpe.setCorePoolSize(2);
        tpe.setQueueCapacity(2);
        return tpe;
    }
}
