package edu.hust.top.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    private Integer regionid;

    private String regionname;

    private String regionlocation;

    private String regionmap;

}