package com.tech.wsoft;

import com.tech.wsoft.model.RadioMessage;
import com.tech.wsoft.radios.RadioCityRadio;
import com.tech.wsoft.radios.RadioSatellitReceiver;
import com.tech.wsoft.radios.RedFmRadio;
import com.tech.wsoft.stations.RadioCityRadioStation;
import com.tech.wsoft.stations.RedFmRadioStation;

public class App {

    public static void main(String[] args) {

        /**
         * Create Satellite Receivers
         */
        RadioCityRadio radioCity = new RadioCityRadio();
        RedFmRadio redFm = new RedFmRadio();
        /**
         * Create broadcast stations
         */
        RadioCityRadioStation radioCityRadioStation = new RadioCityRadioStation(radioCity);
        RedFmRadioStation redFmRadioStation = new RedFmRadioStation(redFm);
        radioCityRadioStation.startTransmission();
        redFmRadioStation.startTransmission();

        Observer<RadioMessage> nidhiRadio = new RadioSubscriber(redFm,"Nidhi Yadav");
        Observer<RadioMessage> bhuppiRadio = new RadioSubscriber(radioCity,"Bhupendra Yadav");

        redFm.addObserver(nidhiRadio);
        radioCity.addObserver(bhuppiRadio);


    }
}
