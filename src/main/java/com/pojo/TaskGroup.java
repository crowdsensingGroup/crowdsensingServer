package com.pojo;

import java.util.Date;

/**
 * Created by 胡煜家 on 2019/1/18.
 */
public class TaskGroup {
    private int id;
    private String name;
    private Date acceptanceDeadline;
    private Date submissionDeadline;
    private Date startDatetime;
    private Date endDatetime;
    private String taskType;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAcceptanceDeadline() {
        return acceptanceDeadline;
    }

    public void setAcceptanceDeadline(Date acceptanceDeadline) {
        this.acceptanceDeadline = acceptanceDeadline;
    }

    public Date getSubmissionDeadline() {
        return submissionDeadline;
    }

    public void setSubmissionDeadline(Date submissionDeadline) {
        this.submissionDeadline = submissionDeadline;
    }

    public Date getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(Date startDatetime) {
        this.startDatetime = startDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
