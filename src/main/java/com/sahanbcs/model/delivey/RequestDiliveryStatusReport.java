package com.sahanbcs.model.delivey;

import com.sahanbcs.model.Enomorators.RDiliveryStatus;

public class RequestDiliveryStatusReport {

    private String destinationAddress;
    private String timeStamp;
    private String requestId;
    private RDiliveryStatus deliveryStatus;


    public RequestDiliveryStatusReport() {

    }

    public RequestDiliveryStatusReport(String destinationAddress, String timeStamp, String requestId, RDiliveryStatus deliveryStatus) {
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

//    public String getDeliveryStatus() {
//        return deliveryStatus;
//    }
//
//    public void setDeliveryStatus(String deliveryStatus) {
//        this.deliveryStatus = deliveryStatus;
//    }

    public RDiliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(RDiliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "RequestDiliveryStatusReport{" +
                "destinationAddress='" + destinationAddress + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", requestId='" + requestId + '\'' +
                ", deliveryStatus=" + deliveryStatus +
                '}';
    }
}
