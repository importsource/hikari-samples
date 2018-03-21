package com.importsource.hiraki.samples;

import lombok.*;

import java.sql.Date;

/**
 * @author hezhuofan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int empNo;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private int sal;
    private int comm;
    private int deptno;
}
