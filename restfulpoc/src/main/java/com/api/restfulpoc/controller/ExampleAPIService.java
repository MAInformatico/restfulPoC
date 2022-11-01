package com.api.restfulpoc.controller;

import com.api.restfulpoc.model.Example;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleAPIService {    
    
    Example show;

    @GetMapping("{title}")
    public Example getExampleDetails(String title){
        return show;
        //new Example("Suits","Netflix","Lawyers"); //Just an example
    }

    @PostMapping
    public String createExampleDetails(@RequestBody Example example){
        this.show = example;
        return "Show created successfully";
    }
    @PutMapping
    public String updateExampleDetails(@RequestBody Example example){
        this.show = example;
        return "Show updated successfully";
    }
    @DeleteMapping("{tittle}")
    public String deleteExampleDetails(String title){
        this.show = null;
        return "Show deleted successfully";
    }
}
