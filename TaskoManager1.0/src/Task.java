public class Task {
    private String name;
    private String priority;
    private String status;

    public Task(String name, String priority) {
        this.name = name;
        this.priority = priority;
        status = "New";
    }

    public String getPriority() { return this.priority; }

    public String getName() { return this.name; }

    public String getStatus() { return this.status; }

    public void setPriority(String priority) { this.priority = priority; }
    public void setStatus(String status) { this.status = status; }
    public void setName(String name) { this.name = name; }


}
