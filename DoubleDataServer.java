import java.time.LocalTime;

public class DoubleDataServer {


    private final String name;
    private DoubleTimedValue doubleTimedValue;


    public DoubleDataServer(String name) {
        this.name = name;
    }


    public void update() {
        doubleTimedValue = new DoubleTimedValue(Math.random(), LocalTime.now().getSecond());
    }


    public DoubleTimedValue getDoubleTimedValue() {
        return doubleTimedValue;
    }
}

