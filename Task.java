public class Task {
    private String name;
    private boolean isComplete;
    private int importance;

    public Task(String name, boolean isComplete, int importance){
        this.name=name;
        this.isComplete=isComplete;
        this.importance=importance;
    }

    public String getName() {
        return name;
    }

    public int getImportance() {
        return importance;
    }

    public String toString() {
        return super.toString();
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }


}
