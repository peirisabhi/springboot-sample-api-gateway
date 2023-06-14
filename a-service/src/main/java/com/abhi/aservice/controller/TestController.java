package com.abhi.aservice.controller;

import com.abhi.aservice.client.BServiceClient;
import com.abhi.aservice.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/a")
public class TestController {

    @Autowired
    BServiceClient bServiceClient;

    @GetMapping()
    public String t1(){
        return "A service working";
    }


    @GetMapping("/test-a")
    public String t2(){
        return "A service working";
    }

    @GetMapping("/test-a/{id}")
    public ResponseDto t3(@PathVariable String id){
        return bServiceClient.fetchOrderStatus(id);
    }
}
