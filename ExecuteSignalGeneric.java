public class ExecuteSignalGeneric <T> implements InformationSignal <T>  {
    private List allValues;
    private int numOfItems;

    public ExecuteSignalGeneric(int size) {
        allValues = new List<T>();
    }

    @Override
    public T getLastValue() {
        return (T) allValues.get(allValues.getNumOfObjects() - 1);
    }


    @Override
    public void update(T toAdd) {
        allValues.add(toAdd);
    }


    @Override
    public T[] asArray() {
        return (T[]) allValues.getList();
    }
}
