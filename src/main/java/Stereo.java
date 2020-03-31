public class Stereo {

    private RecordDeck recordDeck;
    private Radio radio;
    private CDPlayer cdPlayer;
    private int volume;

    public Stereo(RecordDeck recordDeck, Radio radio, CDPlayer cdPlayer){
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.volume = 0;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public RecordDeck getRecordDeck() {
        return this.recordDeck;
    }

    public CDPlayer getCdPlayer() {
        return this.cdPlayer;
    }

    public void raiseVolume() {
        this.volume += 10;
    }

    public void lowerVolume() {
        this.volume -= 10;
    }

    public int getVolume() {
        return this.volume;
    }

    public void changeRadioStation(String newStation) {
        this.radio.setStation(newStation);
    }


}
