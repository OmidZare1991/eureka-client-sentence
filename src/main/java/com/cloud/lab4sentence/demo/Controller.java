package com.cloud.lab4sentence.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @Autowired
    private RestTemplate client;

    @GetMapping("/sentence")
    public @ResponseBody String getSentence() {

        String sentence = "There was a problem assembling the sentence!";
        try {
            sentence = String.format("%s %s.", getWord("LAB-5-SUBJECT"), getWord("LAB-4-VERB"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return sentence;
    }

    public String getWord(String service) {
        return client.getForObject("http://" + service, String.class);
    }
}
