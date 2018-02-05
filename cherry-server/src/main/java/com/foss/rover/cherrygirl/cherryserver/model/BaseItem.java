package com.foss.rover.cherrygirl.cherryserver.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class BaseItem {
    @Getter @Setter private int id;
    @Getter @Setter private String title;
    @Getter @Setter private String price;
    @Getter @Setter private List<String> images;
}
