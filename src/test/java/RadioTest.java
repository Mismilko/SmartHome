import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    //ПРОВЕРКА ЗНАЧЕНИЙ СТАНЦИЙ

    @Test
    public void setCorrectStationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    // тестирование нижних граничных значений -1,0,1
    @Test
    public void setWithoutLowerLimitTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setStation0Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStation1Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    //тестирование верхних граничных значений 8,9,10
    @Test
    public void setStation8Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setStation9Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStation10Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }


    //ТЕСТИРОВАНИЕ NEXT И PREV Station
    //next
    @Test
    public void setNextStationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setOn0StationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setOn1StationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setOn9StationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    //prev
    @Test
    public void setPrevStationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPrevStationFrom9Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPrevStationFrom0Test() {
        Radio radio = new Radio ();

        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setPrevStationFrom1Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(1);

        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    //ПРОВЕРКА ЗНАЧЕНИЙ ЗВУКА

    @Test
    public void setCorrectVolumTest() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(55);
        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    // тестирование нижних граничных значений -1,0,1
    @Test
    public void setVolumeWithoutLowerLimitTest() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setVolume0Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(66);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setVolume1Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    //тестирование верхних граничных значений 99,100,101
    @Test
    public void setVolume99Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setVolume100Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setVolume101Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    //ТЕСТИРОВАНИЕ NEXT И PREV Volume
    //увеличение звука
    @Test
    public void setIncreaseVolumeFrom66Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(66);
        radio.increaseVolume();
        int expected = 67;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setIncreaseVolumeFrom99Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setIncreaseVolumeFrom0Test() {
        Radio radio = new Radio ();

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    //уменьшение звука
    @Test
    public void setDecreaseVolumeFrom43Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(43);
        radio.decreaseVolume();
        int expected = 42;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setDecreaseVolumeFrom1Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setDecreaseVolumeFrom100Test() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }


}