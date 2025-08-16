public class ExecuteSignalInt implements InformationSignal<Integer> {
    private List allValues;
    private int numOfItems;

    public ExecuteSignalInt(int size) {
        allValues = new List<Integer>();
    }

    @Override
    public Integer getLastValue() {
        return (Integer) allValues.get(allValues.getNumOfObjects() - 1);
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
