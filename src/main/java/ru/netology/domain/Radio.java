package ru.netology.domain;

public class Radio {

    //изменение уровня громкости
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
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

//    public void increaseVolume() {
//
//        setCurrentVolume(currentVolume + 1);
//    }


    //изменение выбранного номера радиостанции
    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
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

    public void setToCurrentStation(int stationNumber) {
        if ((stationNumber <= 9) && (stationNumber >= 0)) {
            this.stationNumber = stationNumber;
        }
    }
}
