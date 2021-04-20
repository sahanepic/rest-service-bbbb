package com.sahanbcs.ussd.models.resive;

import com.sahanbcs.ussd.models.Enomerators.REncording;
import com.sahanbcs.ussd.models.Enomerators.UssdOperation;

import javax.validation.constraints.NotBlank;

public class RequestReciveUssd {

    @NotBlank
    private String version;
    @NotBlank
    private String applicationId;
    @NotBlank
    private String sessionId;

    private UssdOperation ussdOperation;
    @NotBlank
    private String sourceAddress;
    private String vlrAddress;
    @NotBlank
    private String message;

    private REncording encoding;
    @NotBlank
    private String requestId;


    public RequestReciveUssd() {

    }


    public RequestReciveUssd(String version, String applicationId, String sessionId, UssdOperation ussdOperation, String sourceAddress, String vlrAddress, String message, REncording encoding, String requestId) {
        this.version = version;
        this.applicationId = applicationId;
        this.sessionId = sessionId;
        this.ussdOperation = ussdOperation;
        this.sourceAddress = sourceAddress;
        this.vlrAddress = vlrAddress;
        this.message = message;
        this.encoding = encoding;
        this.requestId = requestId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getVlrAddress() {
        return vlrAddress;
    }

    public void setVlrAddress(String vlrAddress) {
        this.vlrAddress = vlrAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public REncording getEncoding() {
        return encoding;
    }

    public void setEncoding(REncording encoding) {
        this.encoding = encoding;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

