package edu.hust.top.bean;

import java.util.Date;

public class Trace {
    private Integer traceid;

    private String userid;

    private Integer floor;

    private Double x;

    private Double y;

    private Date time;

    private Integer buildingid;

    public Integer getTraceid() {
        return traceid;
    }

    public void setTraceid(Integer traceid) {
        this.traceid = traceid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}