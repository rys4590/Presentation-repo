public interface InformationSignal <T> {
    public T getLastValue();
    public void update();
    public Object[] asArray();
}
