package edu.hust.top.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {
    private Integer buildingid;

    private String buildinglocation;

    private String buildingname;

    private Double longtitude;

    private Double latitude;

    private Integer height;

    private Integer regionid;

    private String regionName;

}