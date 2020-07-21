package edu.hust.top.bean;

public class Building {
    private Integer buildingid;

    private String buildinglocation;

    private String buildingname;

    private Double longtitude;

    private Double latitude;

    private Integer height;

    private Integer regionid;

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildinglocation() {
        return buildinglocation;
    }

    public void setBuildinglocation(String buildinglocation) {
        this.buildinglocation = buildinglocation == null ? null : buildinglocation.trim();
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname == null ? null : buildingname.trim();
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }
}