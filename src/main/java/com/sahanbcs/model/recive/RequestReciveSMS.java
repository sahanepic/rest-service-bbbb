package com.sahanbcs.model.recive;

public class RequestReciveSMS {

    private String version;
    private String applicationId;
    private String sourceAddress;
    private String message;
    private String requestId;
    private String encoding;

    public RequestReciveSMS() {
    }

    public RequestReciveSMS(String version, String applicationId, String sourceAddress, String message, String requestId, String encoding) {
        this.version = version;
        this.applicationId = applicationId;
        this.sourceAddress = sourceAddress;
        this.message = message;
        this.requestId = requestId;
        this.encoding = encoding;
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

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
}
