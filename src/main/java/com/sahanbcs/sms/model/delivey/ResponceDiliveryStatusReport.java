package com.sahanbcs.sms.model.delivey;

public class ResponceDiliveryStatusReport {
    private String statusCode;
    private String statusDetail;

    public ResponceDiliveryStatusReport(String statusCode, String statusDetail) {
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
    }

    public ResponceDiliveryStatusReport() {

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
