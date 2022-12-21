package com.cloud.lab4sentence.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-5-SUBJECT")
public interface SubjectClient {
    @GetMapping(value = "/")
    public Word getWord();
}
