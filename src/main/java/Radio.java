public class Radio extends Component {

    private String station;

    public Radio(String make, String model, String station){
        super(make, model);
        this.station = station;
    }

    public String tune(){
        return this.station;
    }

    public void setStation(String newStation){
        this.station = newStation;
    }
}
