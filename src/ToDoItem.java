public class ToDoItem {
    private User user;
    private boolean isRunning;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // Add getters and setters for each field

}
