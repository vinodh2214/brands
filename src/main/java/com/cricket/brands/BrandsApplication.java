package com.cricket.brands;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BrandsApplication {

	public static void main(String[] args) {
        SpringApplication.run(BrandsApplication.class, args);
    }
}

@RestController
@RequestMapping("/bats")
class CricketBatController {
    
    @GetMapping("/brands")
    public List<String> getCricketBatBrands() {
        return Arrays.asList("Gray-Nicolls", "SS Ton", "Kookaburra");
    }
}