package com.example.springcountviews.controller;

import com.example.springcountviews.model.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {
    @ModelAttribute("counter")
    public Counter setUpCounter() {
        return new Counter();
    }
    @GetMapping("/count")
    public String get (@ModelAttribute ("counter") Counter c) {
        c.increment();
        return "count";
    }
}
