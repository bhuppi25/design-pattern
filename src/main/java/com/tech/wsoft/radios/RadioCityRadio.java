package com.tech.wsoft.radios;

import com.tech.wsoft.Observer;
import com.tech.wsoft.Subject;
import com.tech.wsoft.model.RadioMessage;

import java.util.ArrayList;
import java.util.List;

public class RadioCityRadio implements Subject<RadioMessage>,RadioSatellitReceiver {

    private List<Observer<RadioMessage>> observers;
    private RadioMessage currentMessage;

    public RadioCityRadio() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer<RadioMessage> observer) {
        if (observer == null) throw new NullPointerException("Observer can't be null");
        if (observers.contains(observer))
            throw new IllegalArgumentException("Observer already registered");
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<RadioMessage> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<RadioMessage> observer : this.observers) {
            observer.update(currentMessage);
        }
    }

    @Override
    public RadioMessage getUpdate() {
        return currentMessage;
    }

    @Override
    public void postMessage(RadioMessage message) {
        this.currentMessage = message;
        notifyObservers();
    }
}
