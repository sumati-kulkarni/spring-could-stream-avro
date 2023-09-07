package com.citi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee1 {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("KID")
    private int kid;
    @JsonProperty("DEPTID")
    private String deptId;
    @JsonProperty("ENAME")
    private String ename;
    @JsonProperty("CREATED_DATE")
    private Date createdDate;
    @JsonProperty("MODIFIED_DATE")
    private Date modifiedDate;
}
