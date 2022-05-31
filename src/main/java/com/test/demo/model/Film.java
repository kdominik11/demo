package com.test.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
//@Generated
public class Film {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Double timeLength;

    @Getter
    @Setter
    private String type;

}