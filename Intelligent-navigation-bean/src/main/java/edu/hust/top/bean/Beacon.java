package edu.hust.top.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beacon {
    private Integer beaconid;

    private Integer deviceid;

    private String uuid;

    private Integer major;

    private Integer minor;

    private Integer floor;

    private Double x;

    private Double y;

    private Double h;

    private Integer groupid;

    private Integer buildingid;


}