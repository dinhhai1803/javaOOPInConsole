
public class Task {
    private int ID;
    private String taskTypeID;
    private String requirementName;
    private String date;
    private float from;
    private float to;
    private String assignee;
    private String reviewer;

    public Task(int ID, String typeID, String re, String date, float from, float to, String assignee,String ex ){
        this.ID = ID;
        this.taskTypeID = typeID;
        this.requirementName = re;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = ex;
    }

    public int getID() {
        return ID;
    }
    public String getReviewer() {
        return reviewer;
    }
    public void setreviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    public String getAssignee() {
        return assignee;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public float getTo() {
        return to;
    }
    public void setTo(float to) {
        this.to = to;
    }
    public float getFrom() {
        return from;
    }
    public void setFrom(float from) {
        this.from = from;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getRequirementName() {
        return requirementName;
    }
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }
    public String getTaskTypeID() {
        return taskTypeID;
    }
    public void setTaskTypeID(String taskTypeID) {
        this.taskTypeID = taskTypeID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }

    public String toString (){
        return this.ID + "\t" + this.requirementName + "\t" + this.taskTypeID + "\t" + this.date + "\t" + (this.to - this.from )+ "\t" + this.assignee + "\t" + this.reviewer ;
    }

    
}