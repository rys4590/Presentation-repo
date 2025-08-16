public class ExecuteSignalBool implements InformationSignal<Boolean> {
    private List allValues;
    private int numOfItems;

    public ExecuteSignalBool(int size) {
        allValues = new List<Boolean>();
    }

    @Override
    public Boolean getLastValue() {
        return (Boolean) allValues.get(allValues.getNumOfObjects() - 1);
    }


    @Override
    public void update(Boolean toAdd) {
        allValues.add(toAdd);
    }


    @Override
    public Boolean[] asArray() {
        return (Boolean[]) allValues.getList();
    }
}
