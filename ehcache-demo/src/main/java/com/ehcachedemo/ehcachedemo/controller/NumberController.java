package com.ehcachedemo.ehcachedemo.controller;

import com.ehcachedemo.ehcachedemo.service.NumberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/number")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
      log.info("Call to NumberService with number: {}", number);
      return String.format("{\"square\": %s}", numberService.square(number));
    }
}
