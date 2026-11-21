package com.mycompany.bloodbank;

public class Donor {

    String id;
    String name;
    String age;
    String gender;
    String bloodGroup;
    String phone;
    String address;
    String height;
    String weight;

    public Donor(String id, String name, String age,
                 String gender, String bloodGroup,
                 String phone, String address,
                 String height, String weight) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getAge() {

        return age;
    }

    public String getGender() {

        return gender;
    }

    public String getBloodGroup() {

        return bloodGroup;
    }

    public String getPhone() {

        return phone;
    }

    public String getAddress() {

        return address;
    }

    public String getHeight() {

        return height;
    }

    public String getWeight() {

        return weight;
    }
}