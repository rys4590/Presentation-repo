public class Task {
    private String name;
    private boolean isComplete;
    private int importance;

    public String getName() {
        return name;
    }

    public int getImportance() {
        return importance;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }


}
