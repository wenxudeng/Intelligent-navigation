package edu.hust.top.bean;

public class IndoorMap {
    private Integer indoormapid;

    private Integer floor;

    private String svgpath;

    private Integer buildingid;

    public Integer getIndoormapid() {
        return indoormapid;
    }

    public void setIndoormapid(Integer indoormapid) {
        this.indoormapid = indoormapid;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getSvgpath() {
        return svgpath;
    }

    public void setSvgpath(String svgpath) {
        this.svgpath = svgpath == null ? null : svgpath.trim();
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}