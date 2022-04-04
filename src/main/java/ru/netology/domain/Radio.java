package ru.netology.domain;

public class Radio {

    private int stationNumber = 10;
    private int currentVolume;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getCurrentStation (){
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if ((currentStation <= (stationNumber - 1)) && (currentStation > 0)) {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStationNumber() {
        if (currentStation == (stationNumber - 1)) {
            currentStation = 0;
            return;
        }
        setCurrentStation(++currentStation);
    }
    public void prevStationNumber(){
        if (currentStation == 0) {
            currentStation = stationNumber - 1;
            return;
        }
        setCurrentStation(--currentStation);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
