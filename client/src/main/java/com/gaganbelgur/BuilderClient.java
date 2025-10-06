package com.gaganbelgur;

public class BuilderClient {

    public static void main(String[] args) {

        ProfileJava profileJava = new ProfileJava.ProfileBuilder("GaganBelgur", "9876543210").build();
        System.out.println(profileJava.toString());

        ProfileJava profileJava1 = new ProfileJava.ProfileBuilder("GaganBelgur", "9876543210").setBirthDate("25/10/20").build();
        System.out.println(profileJava1.toString());
    }
}
