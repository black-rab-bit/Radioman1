package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    //тесты изменения уровня громкости
    Radio vol = new Radio();

    @Test
    public void increaseVolume() {
        vol.setCurrentVolume(4);
        vol.increaseVolume();
        int expected = 5;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void turnDownVolume() {
        vol.setCurrentVolume(1);
        vol.turnDownVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        vol.setCurrentVolume(10);
        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        vol.setCurrentVolume(0);
        vol.turnDownVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        assertEquals(expected, actual);
    }

    //Тесты изменения номера станции
    Radio radioObject = new Radio();

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
        Radio st = new Radio();
        st.setStationNumber(7);
        int expected = 7;
        int actual = st.getStationNumber();

        assertEquals(expected, actual);


    }
}