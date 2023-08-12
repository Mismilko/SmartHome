package ru.netology.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    ru.netology.service.Radio radio = new ru.netology.service.Radio(20);

    //ПРОВЕРКА ЗНАЧЕНИЙ СТАНЦИЙ

    @Test
    public void setCorrectStationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(16);
        int expected = 16;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    // тестирование нижних граничных значений -1,0,1
    @Test
    public void setWithoutLowerLimitTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation0Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation1Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //тестирование верхних граничных значений 18,19,20
    @Test
    public void setStation18Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(18);
        int expected = 18;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation19Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(19);
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation20Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(20);
        int expected = 20;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    //ТЕСТИРОВАНИЕ NEXT И PREV Station
    //next
    @Test
    public void setNextStationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setOn0StationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(19);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setOn1StationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setOn19StationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(18);
        radio.next();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //prev
    @Test
    public void setPrevStationTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationFrom19Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(19);
        radio.prev();
        int expected = 18;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationFrom0Test() {
        ru.netology.service.Radio radio = new ru.netology.service.Radio(20);

        radio.prev();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationFrom1Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentStation(1);

        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //ПРОВЕРКА ЗНАЧЕНИЙ ЗВУКА

    @Test
    public void setCorrectVolumTest() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(55);
        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // тестирование нижних граничных значений -1,0,1
    @Test
    public void setVolumeWithoutLowerLimitTest() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume0Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(66);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume1Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //тестирование верхних граничных значений 99,100,101
    @Test
    public void setVolume99Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume100Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume101Test() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //ТЕСТИРОВАНИЕ NEXT И PREV Volume
    //увеличение звука
    @Test
    public void setIncreaseVolumeFrom66Test() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(66);
        radio.increaseVolume();
        int expected = 67;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeFrom99Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeFrom100Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeFrom0Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшение звука
    @Test
    public void setDecreaseVolumeFrom43Test() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(43);
        radio.decreaseVolume();
        int expected = 42;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeFrom1Test() {
        //ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeFrom100Test() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreaseVolumeFrom0Test() {
        // ru.netology.service.Radio radio = new ru.netology.service.Radio(20);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}