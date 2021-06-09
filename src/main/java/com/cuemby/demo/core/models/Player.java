package com.cuemby.demo.core.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private Integer id;
    private String name;
    private String position;
    private String nation;
    private String team;


}
