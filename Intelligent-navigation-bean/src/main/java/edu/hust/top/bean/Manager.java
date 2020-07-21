package edu.hust.top.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    private Integer namagerid;

    private String managername;

    private String managerpwd;

    private String manegerphone;

    private String manageremail;

    private String salt;

}