package com.craig.allpaprojectdepartment.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "department")
public class Department {
    private String id;
    private String name;
    private String location;
    private String limits;
    private String capital;
    private String province;
    private String population;
    private String surface;
    private String history;
    private String countryId;
//    private List<Event> events;
//    private List<Festivity> festivities;
}
