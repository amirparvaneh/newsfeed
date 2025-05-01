package com.newsanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewsAnalyzer {
    public static void main(String[] args) {
        SpringApplication.run(NewsAnalyzer.class, args);
    }
}