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
    @Column(name = "c_model")
    public String model;
    @Column(name = "c_type")
    public String type;
    @Column(name = "c_engineNum")
    public int engNum;
    @Column(name = "c_engineType")
    public String engType;
    @Column(name = "c_occupantNum")
    public int occupantNum;
    @Column(name = "c_range")
    public String range;
    @Column(name = "c_maxSpeed")
    public String maxSpeed;
    @Column(name = "c_ceiling")
    public String ceiling;
    @Column(name = "c_status")
    public boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngNum() {
        return engNum;
    }

    public void setEngNum(int engNum) {
        this.engNum = engNum;
    }

    public String getEngType() {
        return engType;
    }

    public void setEngType(String engType) {
        this.engType = engType;
    }

    public int getOccupantNum() {
        return occupantNum;
    }

    public void setOccupantNum(int occupantNum) {
        this.occupantNum = occupantNum;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCeiling() {
        return ceiling;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Airplane() {
    }

    public Airplane(int id, String manufacturer, String model, String type, int engNum, String engType, int occupantNum, String range, String maxSpeed, String ceiling, boolean status) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.engNum = engNum;
        this.engType = engType;
        this.occupantNum = occupantNum;
        this.range = range;
        this.maxSpeed = maxSpeed;
        this.ceiling = ceiling;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", engNum=" + engNum +
                ", engType='" + engType + '\'' +
                ", occupantNum=" + occupantNum +
                ", range='" + range + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", ceiling='" + ceiling + '\'' +
                ", status=" + status +
                '}';
    }
}
