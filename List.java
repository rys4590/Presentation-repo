public class List <T> {
   private Object[] list;
    private int numOfObjects;
   public List() {
       this.list = new Object[100];
       this.numOfObjects=100;
   }

   public void add(T smth){
       if(list.length==numOfObjects){
           Object[] lists2 = new Object[list.length+1];
           lists2[list.length] = smth;
           list = lists2;
       }
       else{
           for (int i = 0; i < list.length; i++) {
               if(list[i]==null)
                   list[i]=smth;
           }
       }
   }

   public T get(int spot){
       return (T) list[spot];
   }

   public void set(int spot, T smth){
       list[spot]=smth;
   }

    public int getNumOfObjects() {
        return numOfObjects;
    }

    public Object[] getList() {
        return list;
    }
}
