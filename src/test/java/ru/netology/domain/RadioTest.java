package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radioObject = new Radio();
    Radio radioObject1 = new Radio(20);

//    @Test
//    public void increaseVolume() {
//        radioObject.setCurrentVolume(4);
//        radioObject.increaseVolume();
//        int expected = 5;
//        int actual = radioObject.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void turnDownVolume() {
//        radioObject.setCurrentVolume(1);
//        radioObject.turnDownVolume();
//        int expected = 0;
//        int actual = radioObject.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }

    @Test
    public void maxVolume() {
        radioObject.setCurrentVolume(99);
        radioObject.increaseVolume();
        int expected = 100;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume2() {
        radioObject.setCurrentVolume(14);
        radioObject.increaseVolume();
        int expected = 15;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume3() {
        radioObject.setCurrentVolume(101);
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        radioObject.setCurrentVolume(80);
        radioObject.turnDownVolume();
        int expected = 79;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minVolume2() {
        radioObject.setCurrentVolume(-1);
        radioObject.turnDownVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minVolume3() {
        radioObject.setCurrentVolume(-1);
        radioObject.turnDownVolume();
        int expected = 0;
        int actual = radioObject.getCurrentVolume();

        assertEquals(expected, actual);
    }
//
//    @Test
//    void shouldLowNumber() {
//        Radio radioObject1 = new Radio(20);
//        radioObject1.setStationNumber(-1);
//        int expected = 9;
//        int actual = radioObject1.getStationNumber();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldHighNumber() {
//        radioObject.setStationNumber(10);
//        int expected = 0;
//        int actual = radioObject.getStationNumber();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldEqualNumber() {
//        radioObject.setStationNumber(9);
//        int expected = 9;
//        int actual = radioObject.getStationNumber();
//
//        assertEquals(expected, actual);
//    }

    @Test
    public void getStationNumber() {
        radioObject.setCurrentStation(10);
        int expected = 10;
        int actual = radioObject.getStationNumber();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation() {
        radioObject.setCurrentStation(9);
        radioObject.nextStationNumber();
        int expected = 0;
        int actual = radioObject.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        radioObject.setCurrentStation(0);
        radioObject.prevStationNumber();
        int expected = 9;
        int actual = radioObject.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation2() {
        radioObject.setCurrentStation(4);
        radioObject.nextStationNumber();
        int expected = 5;
        int actual = radioObject.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation2() {
        radioObject.setCurrentStation(8);
        radioObject.prevStationNumber();
        int expected = 7;
        int actual = radioObject.getCurrentStation();

        assertEquals(expected, actual);

    }

    //    тесты конструктора со значением, выбранным пользователем

    @Test
    public void getStationNumberConst() {
        radioObject1.setCurrentStation(20);
        int expected = 0;
        int actual = radioObject1.getCurrentStation();

        assertEquals(expected, actual);

    }


    @Test
    public void shouldNextStationConst() {
        radioObject1.setCurrentStation(19);
        radioObject1.nextStationNumber();
        int expected = 0;
        int actual = radioObject1.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationConst() {
        radioObject1.setCurrentStation(0);
        radioObject1.prevStationNumber();
        int expected = 19;
        int actual = radioObject1.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStationConst2() {
        radioObject1.setCurrentStation(18);
        radioObject1.nextStationNumber();
        int expected = 19;
        int actual = radioObject1.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStationConst2() {
        radioObject1.setCurrentStation(18);
        radioObject1.prevStationNumber();
        int expected = 17;
        int actual = radioObject1.getCurrentStation();

        assertEquals(expected, actual);

    }
}