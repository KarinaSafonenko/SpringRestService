package com.vpaveldm;

import javax.persistence.*;

@Entity
public class Standard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String land;

    public Standard() {
    }

    public Standard(int id, String name, String land) {
        this.id = id;
        this.name = name;
        this.land = land;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
