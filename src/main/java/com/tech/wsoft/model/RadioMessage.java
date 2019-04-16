package com.tech.wsoft.model;

import com.tech.wsoft.stations.RadioTransmitor;

public class RadioMessage {

    private String message;
    private RadioTransmitor transmitor;

    public RadioMessage(String message, RadioTransmitor transmitor) {
        this.message = message;
        this.transmitor = transmitor;
    }

    @Override
    public String toString() {
        return "RadioMessage{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public RadioTransmitor getTransmitor() {
        return transmitor;
    }
}
