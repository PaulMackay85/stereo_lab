public class RecordDeck extends Component {

    private int speed;

    public RecordDeck(String make, String model, int speed){
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

}
