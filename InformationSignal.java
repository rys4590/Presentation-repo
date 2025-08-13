public interface InformationSignal <T> {
    public T getLastValue();
    public void update(T toAdd);
    public Object[] asArray();
}
