package com.sahanbcs.controller;



import com.sahanbcs.Util.Printer;
import com.sahanbcs.sms.model.delivey.RequestDiliveryStatusReport;
import com.sahanbcs.sms.model.delivey.ResponceDiliveryStatusReport;
import com.sahanbcs.sms.model.recive.RequestReciveSMS;
import com.sahanbcs.sms.model.recive.ResponceReciveSMS;
import com.sahanbcs.sms.model.sample.SampleReq;
import com.sahanbcs.sms.model.sample.SampleRes;
import com.sahanbcs.sms.model.send.AddressEntry;
import com.sahanbcs.sms.model.send.RequestSendSMS;
import com.sahanbcs.sms.model.send.ResponceSendSMS;
import com.sahanbcs.ussd.models.resive.RequestReciveUssd;
import com.sahanbcs.ussd.models.resive.ResponceReciveUssd;
import com.sahanbcs.ussd.models.send.RequestSendUssd;
import com.sahanbcs.ussd.models.send.ResponceSendUssd;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SmsControle {


    @GetMapping("/")
    public String hello(){
        return "<h1>Hello Sahan</h1>";
    }


    @PostMapping("/sms")
    public ResponseEntity<SampleRes> smsreqres(@Valid @RequestBody SampleReq req){
        Printer.println("Hello " + req.getName());
        return  ResponseEntity.ok(new SampleRes("400   " + req.getAge())) ;
    }


    @PostMapping("/smssend")
    public ResponseEntity<ResponceSendSMS> smsSend(@Valid @RequestBody RequestSendSMS req){
       Printer.println("Message " + req.getMessage() );
       Printer.println("Request : " + req.toString());
        List<AddressEntry> liadd = new ArrayList<AddressEntry>();
        liadd.add(new AddressEntry("tel:94775454545","20120515093023","dfsfs1213","S1000","Request was successfully processed","dialog"));
        liadd.add(new AddressEntry("tel:94775454545","20120515093023","dfsfs1213","S1000","Request was successfully processed","dialog"));
        return ResponseEntity.ok( new ResponceSendSMS("1.0","101803141358421632","S1000","Request was successfully processed",liadd));
    }

    @PostMapping("/smsrecive")
    public ResponseEntity<ResponceReciveSMS>  smsRecive(@Valid @RequestBody RequestReciveSMS  req){
        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  ResponseEntity.ok(new ResponceReciveSMS("E1308","Error during the charging operation") );
    }

    @PostMapping("/smsdiliverystatusreport")
    public ResponceDiliveryStatusReport smsDiliveryStatusReport(@Valid @RequestBody RequestDiliveryStatusReport   req){
//        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  new ResponceDiliveryStatusReport("E1308","Error during the charging operation") ;
    }


    @PostMapping("/ussdsend")
    public ResponseEntity<ResponceSendUssd>  ussdSend(@Valid @RequestBody RequestSendUssd req){
//        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  ResponseEntity.ok(new ResponceSendUssd("1.0","101803141358421632","S1000","Request was successfully processed","Request was successfully processed"));
    }

    @PostMapping("/ussdrecive")
    public ResponseEntity<ResponceReciveUssd> ussdRecive(@Valid @RequestBody RequestReciveUssd req){
        Printer.println("Message " + req.getMessage() );
        Printer.println("Request : " + req.toString());
        return  ResponseEntity.ok(new ResponceReciveUssd("E1308","Error during the charging operation") );
    }

}
