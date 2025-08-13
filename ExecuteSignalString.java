public class ExecuteSignalString implements InformationSignal<String> {
    private String[] informationValues;
    private String[] allValues;
    private int numOfItems;

    public ExecuteSignalString(int size){
        allValues = new String[100];
        informationValues = new String[size];
    }

    @Override
    public String getLastValue() {
        return  informationValues[informationValues.length-1];
    }


    @Override
    public void update(String toAdd) {
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
    public String[] asArray() {
        return allValues;
    }
}
