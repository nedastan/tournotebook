package com.example.tourguide;

public class Location {
    private String nameOfLocation;
    private String address;
    private String phoneNumber = NOT_PROVIDED;
    private String description;
    private String wHours = NOT_PROVIDED;
    private int imageResourceId;
    private static final String NOT_PROVIDED = null;



    public Location() {

    }
    public Location(String nameOfLocation, String address, String phoneNumber, int imageResourceId, String description, String wHours){
        this.nameOfLocation = nameOfLocation;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.wHours = wHours;
    }

    public Location(String nameOfLocation, String address, int imageResourceId, String description, String wHours){
        this.nameOfLocation = nameOfLocation;
        this.address = address;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.wHours = wHours;
    }
    public Location(String nameOfLocation, String address, String description,  int imageResourceId){
        this.nameOfLocation = nameOfLocation;
        this.address = address;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getwHours() {
        return wHours;
    }

    public String getNameOfLocation() {
        return nameOfLocation;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasNumber() {
        return getPhoneNumber() != NOT_PROVIDED;
    }
    public boolean haswHours() {
        return getwHours() != NOT_PROVIDED;
    }
}
