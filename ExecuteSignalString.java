public class ExecuteSignalString implements InformationSignal<String> {
    private List allValues;
    private int numOfItems;

    public ExecuteSignalString(int size) {
        allValues = new List<String>();
    }

    @Override
    public String getLastValue() {
        return (String) allValues.get(allValues.getNumOfObjects() - 1);
    }


    @Override
    public void update(String toAdd) {
        allValues.add(toAdd);
    }


    @Override
    public String[] asArray() {
        return (String[]) allValues.getList();
    }
}
