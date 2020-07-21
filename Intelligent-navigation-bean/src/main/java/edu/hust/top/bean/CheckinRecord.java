package edu.hust.top.bean;

import java.util.Date;

public class CheckinRecord {
    private Integer checkinrecordid;

    private Date checktime;

    private String workerid;

    private Integer buildingid;

    public Integer getCheckinrecordid() {
        return checkinrecordid;
    }

    public void setCheckinrecordid(Integer checkinrecordid) {
        this.checkinrecordid = checkinrecordid;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getWorkerid() {
        return workerid;
    }

    public void setWorkerid(String workerid) {
        this.workerid = workerid == null ? null : workerid.trim();
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}