public class List <T> {
   private Object[] list;
    private int numOfObjects;

   public T get(int spot){
       return (T) list[spot];
   }

   public void set(int spot, T smth){
       list[spot]=smth;
   }

    public int getNumOfObjects() {
        return numOfObjects;
    }

    public T[] getList() {
        Object[] temp = new Object[numOfObjects];
        for (int i = 0; i <numOfObjects ; i++) {
            temp[i]=list[i];
        }
        return (T[]) temp;
    }

    public void setList(Object[] list) {
        this.list = list;
    }

    public List() {
        this.list = new Object[100];
        this.numOfObjects=100;
    }

    public void add(T smth) {
        if (numOfObjects == list.length) {
            // grow array
            Object[] lists2 = new Object[list.length + 1];
            System.arraycopy(list, 0, lists2, 0, list.length);
            list = lists2;
        }
        list[numOfObjects] = smth;
        numOfObjects++;
    }
    public void setNumOfObjects(int numOfObjects) {
        this.numOfObjects = numOfObjects;
    }
}
