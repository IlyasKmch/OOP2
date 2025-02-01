package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(6);

        int expected = 6;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThenMax() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(16);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThenMin() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(-6);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaMinus1() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaZero() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(0);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bva1() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(1);

        int expected = 1;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bva8() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(8);

        int expected = 8;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bva9() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(9);

        int expected = 9;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bva10() {
        Radio radio = new Radio();

        radio.setCurrentRadiostation(10);

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrom1To2() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrom8To9() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrom0To9() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrom8To7() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrom2To1() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFrom1To0() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThenMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThenMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-15);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolumeMinus1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolumeZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolume99() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolume100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bvaVolume101() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseFrom0To1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseFrom1To2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseFrom99To100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseFrom100To0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduction() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.reductionVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionFrom100to99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reductionVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionFrom99to98() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.reductionVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionFrom2to1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.reductionVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionFrom1to0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void reductionFrom0to0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
