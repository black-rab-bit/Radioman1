package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int stationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            newStationNumber = 0;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;
        }
        stationNumber = newStationNumber;
    }

//    public void setToCurrentStation(int stationNumber) {
//        if ((stationNumber <= 9) && (stationNumber >= 0)) {
//            this.stationNumber = stationNumber;
//        }
//    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //изменение выбранного номера радиостанции

//    public Radio(int stationNumber) {
//        this.stationNumber = 10;
//    }
}

