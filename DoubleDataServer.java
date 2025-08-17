import java.time.LocalTime;

public class DoubleDataServer {


    private final String name;
    private DoubleTimedValue doubleTimedValue;


    public DoubleDataServer(String name) {
        this.name = name;
    }


    public void update() {
        doubleTimedValue.setValue(Math.random());
        doubleTimedValue.setTime(LocalTime.now().getSecond());
    }


    public DoubleTimedValue getDoubleTimedValue() {
        return doubleTimedValue;
    }
}

