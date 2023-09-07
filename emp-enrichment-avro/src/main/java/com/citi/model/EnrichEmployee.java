package com.citi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrichEmployee {
    @JsonProperty("ID")
    private String eid;
    @JsonProperty("DEPTID")
    private String deptId;
    @JsonProperty("ENAME")
    private String Ename;
    @JsonProperty("DNAME")
    private String Dname;
    @JsonProperty("CREATED_DATE")
    private Date createdDate;
    @JsonProperty("MODIFIED_DATE")
    private Date modifiedDate;

}
