public class TaskManager {
    private Task[] tasks;
    private int numOfAdd;
    public void addTask(Task task){
        if(numOfAdd>tasks.length){
            Task[] temp = new Task[200];
            for (int i = 0; i < 100; i++) {
                temp[i]=tasks[i];
            }
            temp[100]=task;
            numOfAdd++;
            tasks = temp;
        }
        else{
        tasks[numOfAdd] = task;
        numOfAdd++;
        }
    }

    public void printFiltered(TaskFilter filter){
        for (int i = 0; i <tasks.length; i++) {
            if(filter.didFilter(tasks[i]))
                System.out.println(tasks[i]);
        }
    }

    public void deleteFiltered(TaskFilter filter){
        int count = 0;
        for (int i = 0; i < tasks.length; i++) {
            if(!filter.didFilter(tasks[i]))
                count++;
        }
        Task[] temp = new Task[count];
        int j = 0;
        for (int i = 0; i < tasks.length; i++) {
            if(filter.didFilter(tasks[i])){
                temp[j] = tasks[i];
                j++;
            }
        }
        tasks=temp;
    }

    public void raiseFilter(TaskFilter filter){
        for (int i = 0; i <tasks.length; i++) {
            if(filter.didFilter(tasks[i])){
                int importance = tasks[i].getImportance();
                tasks[i].setImportance(importance++);
            }
        }
    }

    public void lowerFilter(TaskFilter filter){
        for (int i = 0; i <tasks.length; i++) {
            if(filter.didFilter(tasks[i])){
                int importance = tasks[i].getImportance();
                tasks[i].setImportance(importance--);
            }
        }
    }

}
