package com.sahanbcs.ussd.models.Enomerators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.sahanbcs.sms.model.Enomorators.Encoding;

public enum UssdOperation {
    moinit("mo-init"),
    mocont("mo-cont"),
    mtinit("mt-init"),
    mtcont("mt-cont"),
    mtfin("mt-fin");

    private String text;

    UssdOperation(String text) {
        this.text =text;
    }

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static UssdOperation fromText(String text){
        for(UssdOperation r : UssdOperation.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }

}
