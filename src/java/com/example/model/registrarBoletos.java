/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class registrarBoletos {
    public List obtenerInfo(String name, String last_name, String email, String phone, String city, String zip_code, String country){
        List datosFormulario = new ArrayList();
        datosFormulario.add(name);
        datosFormulario.add(last_name);
        datosFormulario.add(email);
        datosFormulario.add(phone);
        datosFormulario.add(city);
        datosFormulario.add(country);
        datosFormulario.add(zip_code);
        return (datosFormulario);
    }

}
