public class Program {
    public static void printList(List items) {
        for (int i = 0; i < items.getList().length; i++) {
            System.out.println(items.getList()[i] + ",");
        }
    }
}
