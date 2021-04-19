package com.sahanbcs.model.send;


import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DiliveryStatus {
    DELIVERYREPORTNOTREQUIRED,
    DELIVERYREPORTREQUIRED
}
