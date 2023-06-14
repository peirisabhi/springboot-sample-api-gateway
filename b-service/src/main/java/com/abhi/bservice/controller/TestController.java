package com.abhi.bservice.controller;

import com.abhi.bservice.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 13/06/2023
 * Time: 22:47
 */

@RestController()
@RequestMapping("/b")
public class TestController {


    @GetMapping()
    public String t1(){
        return "B service working";
    }

    @GetMapping("/test-b")
    public String t2(){
        return "B service controller working";
    }


    @GetMapping("/test-b/{id}")
    public ResponseDto t3(@PathVariable String id){
        return new ResponseDto(id, "test 3");
    }



}
