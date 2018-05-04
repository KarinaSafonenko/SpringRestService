package com.vpaveldm;

import javax.persistence.*;

@Entity
public class LocalNetwork {
    private String name;
    private String cable;
    private int speed;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "standard_id")
    private Standard standard;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public LocalNetwork() {
    }

    public LocalNetwork(String name, String cable, int speed, Standard standard) {
        this.name = name;
        this.cable = cable;
        this.speed = speed;
        this.standard = standard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
