package com.sahanbcs.ussd.models.send;

import com.sahanbcs.ussd.models.Enomerators.REncording;
import com.sahanbcs.ussd.models.Enomerators.UssdOperation;

import javax.validation.constraints.NotBlank;

public class RequestSendUssd {

    @NotBlank
    private String applicationId;
    @NotBlank
    private String  password;
    private String version;
    @NotBlank
    private String sessionId;

    private UssdOperation ussdOperation;

    @NotBlank
    private String destinationAddress;
    private REncording encoding;
    private double chargingAmount;


    public RequestSendUssd( ) {

    }

    public RequestSendUssd(String applicationId, String password, String version, String sessionId, UssdOperation ussdOperation, String destinationAddress, REncording encoding, double chargingAmount) {
        this.applicationId = applicationId;
        this.password = password;
        this.version = version;
        this.sessionId = sessionId;
        this.ussdOperation = ussdOperation;
        this.destinationAddress = destinationAddress;
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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public UssdOperation getUssdOperation() {
        return ussdOperation;
    }

    public void setUssdOperation(UssdOperation ussdOperation) {
        this.ussdOperation = ussdOperation;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public REncording getEncoding() {
        return encoding;
    }

    public void setEncoding(REncording encoding) {
        this.encoding = encoding;
    }

    public double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }

    @Override
    public String toString() {
        return "RequestSendUssd{" +
                "applicationId='" + applicationId + '\'' +
                ", password='" + password + '\'' +
                ", version='" + version + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", ussdOperation=" + ussdOperation +
                ", destinationAddress='" + destinationAddress + '\'' +
                ", encoding=" + encoding +
                ", chargingAmount=" + chargingAmount +
                '}';
    }
}
