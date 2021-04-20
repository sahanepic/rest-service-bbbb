package com.sahanbcs.ussd.models.send;

public class ResponceSendUssd {

    private String version;
    private String requestId;
    private String timeStamp;
    private String statusCode;
    private String statusDetail;


    public ResponceSendUssd() {

    }

    public ResponceSendUssd(String version, String requestId, String timeStamp, String statusCode, String statusDetail) {
        this.version = version;
        this.requestId = requestId;
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }
}
