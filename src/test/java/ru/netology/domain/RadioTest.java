package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    //тесты изменения уровня громкости
    Radio radioObject = new Radio();

    @Test
    public void increaseVolume() {
        radioObject.setCurrentVolume(4);
        radioObject.increaseVolume();
        int expected = 5;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume() {
        radioObject.setCurrentVolume(1);
        radioObject.turnDownVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        radioObject.setCurrentVolume(10);
        radioObject.increaseVolume();
        int expected = 10;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void maxVolume2() {
        radioObject.setCurrentVolume(14);
//        radioObject.increaseVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        radioObject.setCurrentVolume(0);
        radioObject.turnDownVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }@Test

    public void minVolume2() {
        radioObject.setCurrentVolume(-1);
        radioObject.turnDownVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //Тесты изменения номера станции
    @Test
    void shouldLowNumber() {
        radioObject.setStationNumber(-1);
        int expected = 9;
        int actual = radioObject.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldHighNumber() {
        radioObject.setStationNumber(10);
        int expected = 0;
        int actual = radioObject.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    void shouldEqualNumber() {
        radioObject.setStationNumber(9);
        int expected = 9;
        int actual = radioObject.getStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void getStationNumber() {
//        Radio st = new Radio();
        radioObject.setStationNumber(7);
        int expected = 7;
        int actual = radioObject.getStationNumber();

        assertEquals(expected, actual);
    }
//    @Test
//    public void setToCurrentStation(){
//        radioObject.setToCurrentStation(8);
//        int expected = 8;
//        int actual = radioObject.setToCurrentStation();
//    }
}