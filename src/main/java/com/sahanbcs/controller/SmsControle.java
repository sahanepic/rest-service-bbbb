package com.sahanbcs.controller;



import com.sahanbcs.Util.Printer;
import com.sahanbcs.model.sample.SampleReq;
import com.sahanbcs.model.sample.SampleRes;
import com.sahanbcs.model.send.RequestSendSMS;
import com.sahanbcs.model.send.ResponceSendSMS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsControle {


    @GetMapping("/")
    public String hello(){
        return "<h1>Hello Sahan</h1>";
    }


    @PostMapping("/sms")
    public SampleRes smsreqres(@RequestBody SampleReq req){
        Printer.println("Hello " + req.getName());
        return  new SampleRes("400" + req.getAge());
    }


    @PostMapping("/smssend")
    public ResponceSendSMS smsSend(@RequestBody RequestSendSMS req){
       Printer.println("Message " + req.getMessage() );
        return  new ResponceSendSMS();
    }

}
