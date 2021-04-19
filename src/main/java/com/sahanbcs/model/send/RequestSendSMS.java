package com.sahanbcs.model.send;

public class RequestSendSMS {

    private String applicationId;
    private String password;
    private String version;
    private String destinationAddresses;
    private String message;
    private String sourceAddress;
    private DiliveryStatus diliveryStatus;
    private Encoding encoding;
    private double chargingAmount;


    public RequestSendSMS( ) {

    }

    public RequestSendSMS(String applicationId, String password, String version, String destinationAddresses, String message, String sourceAddress, DiliveryStatus diliveryStatus, Encoding encoding, double chargingAmount) {
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

    public String getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(String destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
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

    public DiliveryStatus getDiliveryStatus() {
        return diliveryStatus;
    }

    public void setDiliveryStatus(DiliveryStatus diliveryStatus) {
        this.diliveryStatus = diliveryStatus;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }
}
