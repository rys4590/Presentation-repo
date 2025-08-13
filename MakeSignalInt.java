import java.util.Objects;

public class MakeSignalInt implements InformationSignal<Integer> {
    private Integer[] values;
    private Integer[] allValues;

    public MakeSignalInt(int size) {
        allValues = new Integer[100];
        values = new Integer[size];
    }

    @Override
    public Integer getLastValue() {
        return values[values.length - 1];
    }


    @Override
    public void update(Integer toAdd) {
        int count = 0;
        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i] != null)
                count++;
        }
        if (allValues.length > count)
            allValues[allValues.length - 1] = toAdd;
        else {
            Object[] temp = new Object[allValues.length + 1];
            for (int i = 0; i < allValues.length; i++) {
                temp[i] = allValues[i];
            }
            temp[temp.length - 1] = toAdd;
        }
    }


    @Override
    public Object[] asArray() {
        return allValues;
    }
}
