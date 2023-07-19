public class Radio {
    private int currentStation;
    private int currentVolume;

    // установка станции
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    //переключение станции на следующую
    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    // переключение станции на предыдущую
    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
    //установка звука

    public int getCurrentVolume() {
        return currentVolume = currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // увеличение громкости
    public int increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentStation = 100;
        }
        return currentVolume;
    }
//уменьшение громкости

    public int decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }else {
            currentStation = 0;
        }
        return currentVolume;
    }




}