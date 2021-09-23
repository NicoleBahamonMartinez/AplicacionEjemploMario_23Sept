package com.example.helloworld;

public class DataSingleton {

    private static DataSingleton instance = null;

    private String name;
    private String email;

    private DataSingleton(){
        name = "";
        email = "";
    }

    public static DataSingleton getInstance(){
        if(instance == null){
            instance = new DataSingleton();
        }
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
