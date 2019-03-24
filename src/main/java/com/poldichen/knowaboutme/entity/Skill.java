package com.poldichen.knowaboutme.entity;

/**
 * @author poldi.chen
 * @className Skill
 * @description TODO
 * @date 2019/3/24 16:25
 **/
public class Skill {

    private int id;
    private String name;
    private String skilled;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkilled() {
        return skilled;
    }

    public void setSkilled(String skilled) {
        this.skilled = skilled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
