package com.abhi.aservice.client;

import com.abhi.aservice.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 14/06/2023
 * Time: 20:01
 */
@Component
public class BServiceClient {
    @Autowired
    private RestTemplate template;

    public ResponseDto fetchOrderStatus(String id) {
        System.out.println("Client called " + id);
        return template.getForObject("http://b-service/b/test-b/"+id, ResponseDto.class);
    }
}
