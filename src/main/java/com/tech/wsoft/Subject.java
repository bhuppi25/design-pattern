package com.tech.wsoft;

public interface Subject<T> {

    void addObserver(Observer<T> observer);

    void removeObserver(Observer<T> observer);

    void notifyObservers();

    T getUpdate();
}
