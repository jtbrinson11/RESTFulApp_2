package com.GenSpark.RESTFulApp_2.Entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_airplanes")
public class Airplane {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "c_manufacturer")
    public String manufacturer;
    @Column(name = "c_type")
    public String type;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Airplane() {
    }

    public Airplane(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
    }
}
