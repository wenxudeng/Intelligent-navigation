package edu.hust.top.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dwx
 * @create 2020-07-18 9:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerException extends RuntimeException {

    private String message;

}
