package com.sahanbcs.model.delivey;

public class RequestDiliveryStatusReport {

    private String destinationAddress;
    private String timeStamp;
    private String requestId;
    private String deliveryStatus;


    public RequestDiliveryStatusReport() {

    }

    public RequestDiliveryStatusReport(String destinationAddress, String timeStamp, String requestId, String deliveryStatus) {
        this.destinationAddress = destinationAddress;
        this.timeStamp = timeStamp;
        this.requestId = requestId;
        this.deliveryStatus = deliveryStatus;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
