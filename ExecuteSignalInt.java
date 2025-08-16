public class ExecuteSignalInt implements InformationSignal<Integer> {
    private Integer[] values;
    private List allValues;
    private int numOfItems;

    public ExecuteSignalInt(int size) {
        allValues = new List<Integer>();
        values = new Integer[size];
    }

    @Override
    public Integer getLastValue() {
        return values[values.length - 1];
    }


    @Override
    public void update(Integer toAdd) {
        allValues.add(toAdd);
    }


    @Override
    public Integer[] asArray() {
        return (Integer[]) allValues.getList();
    }
}
