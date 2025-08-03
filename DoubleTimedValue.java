public class DoubleTimedValue {
    public double value;
    public double time;


    public DoubleTimedValue(double value, double time){
        this.value = value;
        this.time = time;
    }
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
