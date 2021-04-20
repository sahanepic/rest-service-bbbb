package com.sahanbcs.ussd.models.Enomerators;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.sahanbcs.sms.model.Enomorators.Encoding;

public enum REncording {

    PlainASCII("440") ;

    private String text;

    REncording(String text) {
        this.text =text;
    }

    public String getText(){return this.text;}

    @Override
    public String toString() {
        return text;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static REncording fromText(String text){
        for(REncording r : REncording.values()){
            if(r.getText().equals(text)){
                return r;
            }
        }
        throw new IllegalArgumentException();
    }

}
