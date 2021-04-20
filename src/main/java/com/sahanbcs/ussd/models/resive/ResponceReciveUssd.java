package com.sahanbcs.ussd.models.resive;

public class ResponceReciveUssd {

    private String statusCode;
    private String statusDetail;


    public ResponceReciveUssd( ) {

    }

    public ResponceReciveUssd(String statusCode, String statusDetail) {
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
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
