package edu.hust.top.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dwx
 * @create 2020-07-28 15:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionException extends RuntimeException{

    private String message;
}
