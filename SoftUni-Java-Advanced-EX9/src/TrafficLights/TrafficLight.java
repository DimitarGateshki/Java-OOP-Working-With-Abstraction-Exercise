package TrafficLights;

public class TrafficLight {
    private Colour light;

    public TrafficLight(Colour light) {
        this.light = light;
    }

    public Colour getLight() {
        return light;
    }

    public void update(){
        switch (this.light){
            case RED :
                this.light=Colour.GREEN;
                break;
            case GREEN:
                this.light=Colour.YELLOW;
                break;
            case YELLOW:
                this.light=Colour.RED;
                break;
        }


    }
}
