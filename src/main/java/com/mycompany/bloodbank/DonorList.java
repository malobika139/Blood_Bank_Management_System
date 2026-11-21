package com.mycompany.bloodbank;

import java.util.ArrayList;

public class DonorList {

    static ArrayList<Donor> donors = new ArrayList<>();

    public static void addDonor(Donor d) {

        donors.add(d);

    }

    public static ArrayList<Donor> getDonors() {

        return donors;

    }
}