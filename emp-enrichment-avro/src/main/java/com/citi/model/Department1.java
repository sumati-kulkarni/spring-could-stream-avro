package com.citi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department1 {
    @JsonProperty("ID")
    private String id;
    @JsonProperty("KID")
    private int kid;
    @JsonProperty("DNAME")
    private String dname;
    @JsonProperty("CREATED_DATE")
    private Date createdDate;
    @JsonProperty("MODIFIED_DATE")
    private Date modifiedDate;
}
