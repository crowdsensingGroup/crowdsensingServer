package com.pojo;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
public class UserAcceptance {
    private int id;
    private int taskId;
    private float acceptLongitude;
    private float acceptLatitude;
    private String acceptDatetime;
    private int travelDistance;

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

    public float getAcceptLongitude() {
        return acceptLongitude;
    }

    public void setAcceptLongitude(float acceptLongitude) {
        this.acceptLongitude = acceptLongitude;
    }

    public float getAcceptLatitude() {
        return acceptLatitude;
    }

    public void setAcceptLatitude(float acceptLatitude) {
        this.acceptLatitude = acceptLatitude;
    }

    public String getAcceptDatetime() {
        return acceptDatetime;
    }

    public void setAcceptDatetime(String acceptDatetime) {
        this.acceptDatetime = acceptDatetime;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;
    }
}
