package com.pojo;

/**
 * Created by 胡煜家 on 2019/1/22.
 */
public class TaskCompletion {
    private int id;
    private int taskId;
    private String completionDatetime;
    private String submissionDatetime;
    private String taskData;
    private String taskPic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getCompletionDatetime() {
        return completionDatetime;
    }

    public void setCompletionDatetime(String completionDatetime) {
        this.completionDatetime = completionDatetime;
    }

    public String getSubmissionDatetime() {
        return submissionDatetime;
    }

    public void setSubmissionDatetime(String submissionDatetime) {
        this.submissionDatetime = submissionDatetime;
    }

    public String getTaskData() {
        return taskData;
    }

    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }

    public String getTaskPic() {
        return taskPic;
    }

    public void setTaskPic(String taskPic) {
        this.taskPic = taskPic;
    }
}
