package ru.netology.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minSation = 0;
    private int maxStation;
    private int numberStation = 20;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int numberStation) {

        this.numberStation = numberStation;
        maxStation = numberStation - 1;
    }

    public Radio() {

    }

    // установка станции
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minSation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //переключение станции на следующую
    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minSation;
        }
    }

    // переключение станции на предыдущую
    public void prev() {
        if (currentStation != minSation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
    //установка звука

    public int getCurrentVolume() {

        return currentVolume = currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // увеличение громкости
    public int increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentStation = 100;
        }
        return currentVolume;
    }
//уменьшение громкости

    public int decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentStation = 0;
        }
        return currentVolume;
    }


}