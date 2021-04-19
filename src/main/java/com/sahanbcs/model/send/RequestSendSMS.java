package com.sahanbcs.model.send;

import java.util.List;

public class RequestSendSMS {

    private String applicationId;
    private String password;
    private String version;
    private List<String>  destinationAddresses;
    private String message;
    private String sourceAddress;
    private String diliveryStatus;
    private String encoding;
    private double chargingAmount;


    public RequestSendSMS( ) {

    }

    public RequestSendSMS(String applicationId, String password, String version, List<String> destinationAddresses, String message, String sourceAddress, String diliveryStatus, String encoding, double chargingAmount) {
        this.applicationId = applicationId;
        this.password = password;
        this.version = version;
        this.destinationAddresses = destinationAddresses;
        this.message = message;
        this.sourceAddress = sourceAddress;
        this.diliveryStatus = diliveryStatus;
        this.encoding = encoding;
        this.chargingAmount = chargingAmount;
    }


    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDiliveryStatus() {
        return diliveryStatus;
    }

    public void setDiliveryStatus(String diliveryStatus) {
        this.diliveryStatus = diliveryStatus;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }
}
