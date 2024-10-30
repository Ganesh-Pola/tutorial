package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.*;
import java.time.format.*;

@RestController

public class MyController {

    @GetMapping("/")

    public String datefinder() {

        LocalDate now = LocalDate.now();
        LocalDate hun = now.plusDays(100);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str = format.format(hun);
        return str;

    }
}