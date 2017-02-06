package com.alex.api.controller;


import com.alex.api.entity.data.jpa.Request;
import com.alex.api.repository.data.jpa.RequestRepository;
import com.alex.api.repository.data.elasticsearch.ArticleSearchRepository;
import com.alex.api.util.XStreamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @PostMapping("/callhangup")
    public Request xmlRequest(@RequestBody String xml ) {
        Request request=(Request) XStreamUtil.xmlToJavaBean(xml,Request.class);
        return requestRepository.save(request);

    }


    @GetMapping("/getrequest")
    public Request getRequest(@RequestParam String accountSid){
        Request request=requestRepository.findOneByAccountSid(accountSid);
        return request;
    }

}
