package com.sahanbcs.controller;



import com.sahanbcs.Util.Printer;
import com.sahanbcs.model.delivey.RequestDiliveryStatusReport;
import com.sahanbcs.model.delivey.ResponceDiliveryStatusReport;
import com.sahanbcs.model.recive.RequestReciveSMS;
import com.sahanbcs.model.recive.ResponceReciveSMS;
import com.sahanbcs.model.sample.SampleReq;
import com.sahanbcs.model.sample.SampleRes;
import com.sahanbcs.model.send.AddressEntry;
import com.sahanbcs.model.send.RequestSendSMS;
import com.sahanbcs.model.send.ResponceSendSMS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SmsControle {


    @GetMapping("/")
    public String hello(){
        return "<h1>Hello Sahan</h1>";
    }


    @PostMapping("/sms")
    public SampleRes smsreqres(@RequestBody SampleReq req){
        Printer.println("Hello " + req.getName());
        return  new SampleRes("400   " + req.getAge());
    }


    @PostMapping("/smssend")
    public ResponceSendSMS smsSend(@RequestBody RequestSendSMS req){
       Printer.println("Message " + req.getMessage() );
       Printer.println("Request : " + req.toString());
        List<AddressEntry> liadd = new ArrayList<AddressEntry>();
        liadd.add(new AddressEntry("tel:94775454545","20120515093023","dfsfs1213","S1000","Request was successfully processed","dialog"));
        return  new ResponceSendSMS("1.0","101803141358421632","S1000","Request was successfully processed",liadd);
    }

    @PostMapping("/smsrecive")
    public ResponceReciveSMS  smsRecive(@RequestBody RequestReciveSMS  req){
        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  new ResponceReciveSMS("E1308","Error during the charging operation") ;
    }

    @PostMapping("/smsdiliverystatusreport")
    public ResponceDiliveryStatusReport smsDiliveryStatusReport(@RequestBody RequestDiliveryStatusReport   req){
//        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  new ResponceDiliveryStatusReport("E1308","Error during the charging operation") ;
    }

}
