package com.tech.wsoft.radios;

import com.tech.wsoft.model.RadioMessage;

public interface RadioSatellitReceiver {

    void postMessage(RadioMessage message);
}
