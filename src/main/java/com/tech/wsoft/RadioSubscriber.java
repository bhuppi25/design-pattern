package com.tech.wsoft;

import com.tech.wsoft.model.RadioMessage;

public class RadioSubscriber implements Observer<RadioMessage> {

    private Subject<RadioMessage> subject;
    /**
     * Just for testing purpose
     */
    private String radioHolderName;

    public RadioSubscriber(Subject<RadioMessage> subject, String radioHolderName) {
        this.subject = subject;
        this.radioHolderName = radioHolderName;
    }

    @Override
    public void update(RadioMessage radioMessage) {
        System.out.println(" On "+radioHolderName+", Message received " + radioMessage + "  from "
                + radioMessage.getTransmitor().getName());
    }
}
