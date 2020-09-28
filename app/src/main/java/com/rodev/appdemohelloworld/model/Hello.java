package com.rodev.appdemohelloworld.model;

public class Hello {
    public String nombre;
    public String edad;


    public Hello(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public  String informations(){
        return nombre + " "+ edad;
    }

}
