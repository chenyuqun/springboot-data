package com.alex.api.controller;


import com.alex.api.entity.Request;
import com.alex.api.repository.RequestRepository;
import com.alex.api.util.XStreamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;

    @RequestMapping(name="/callhangup")
    public Request xmlRequest(@RequestBody String xml ) {
        Request request=(Request) XStreamUtil.xmlToJavaBean(xml,Request.class);
        return requestRepository.save(request);

    }


    @GetMapping(name="/getrequest")
    public Request getRequest(@RequestParam String accountSid){
        Request request=requestRepository.findOneByAccountSid(accountSid);
        return request;
    }

}
