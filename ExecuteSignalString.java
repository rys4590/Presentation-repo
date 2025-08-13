public class ExecuteSignalString implements InformationSignal<String> {
    private String[] values;
    private String[] allValues;

    public ExecuteSignalString(int size){
        allValues = new String[100];
        values= new String[size];
    }

    @Override
    public String getLastValue() {
        return  values[values.length-1];
    }


    @Override
    public void update(String toAdd) {
        int count = 0;
        for (int i = 0; i < allValues.length; i++) {
            if(allValues[i]!=null)
                count++;
        }
        if(allValues.length>count)
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
