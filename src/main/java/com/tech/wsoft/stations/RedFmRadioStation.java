package com.tech.wsoft.stations;

import com.tech.wsoft.radios.RadioSatellitReceiver;
import com.tech.wsoft.model.RadioMessage;

public class RedFmRadioStation implements RadioTransmitor, Runnable {

    private RadioSatellitReceiver receiver;
    private Thread thread;
    private boolean isRunning;
    private String[] messages = {"Hello how are you "};

    public RedFmRadioStation(RadioSatellitReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void startTransmission() {
        if (this.receiver != null && !isRunning) {
            thread = new Thread(this);
            isRunning = true;
            thread.start();
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void run() {
        while (isRunning) {
            this.receiver.postMessage(new RadioMessage(messages[0], this));
            try {
                thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
