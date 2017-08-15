package com.example.cicctuser.usesgooglemap.services;

import com.example.cicctuser.usesgooglemap.object.Devslopes;

import java.util.ArrayList;

public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<Devslopes> list = new ArrayList<>();
        list.add(new Devslopes(10.287065f, 123.861961f,"Kaizen Pension House","Cebu S Rd, Cebu City, Cebu","slo"));
        list.add(new Devslopes(10.288734f, 123.864729f,"Holy Cross Parish","Cebu S Rd, Cebu City, 6000 Cebu","slo"));
        list.add(new Devslopes(10.289768f, 123.859731f,"Gear Up Cebu","128b E 6000, 128 E Sabellano Street, Cebu City, 6000 Cebu","slo"));
        return list;
    }
}
