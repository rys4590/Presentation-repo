public class ExecuteSignalBool implements InformationSignal<Boolean>{
    private Boolean[] values;
    private Boolean[] allValues;
    private int numOfItems;
    public ExecuteSignalBool(int size){
        allValues = new Boolean[100];
        values= new Boolean[size];
    }

    @Override
    public Boolean getLastValue() {
        return  values[values.length-1];
    }


    @Override
    public void update(Boolean toAdd) {
        if(allValues.length>numOfItems)
            allValues[allValues.length-1] = toAdd;
        else{
            Object[] temp = new Object[allValues.length+1];
            for (int i = 0; i < allValues.length; i++) {
                temp[i]=allValues[i];
            }
            temp[temp.length-1] = toAdd;
        }
    }


    @Override
    public Boolean[] asArray() {
        return allValues;
    }
}
