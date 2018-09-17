/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.labJSP;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Claudia
 */
public class NameHandler {
    
    private String name;
    private String email;
    private String nacimiento;
    public int edad;
    public int caracteres;
    
    

    public NameHandler() {
        name = null;
        email = null;
        nacimiento = null ;
        edad = 0;
    }
    
    public NameHandler(String name,String email) {
        this.name = name;
        this.email = email;
        this.nacimiento = nacimiento;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setCaracteres(name);
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
        setEdad(Integer.parseInt(nacimiento));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nacimiento) {
        this.edad = calculaEdad(nacimiento);
    }   

    public int getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String name) {
        this.caracteres = numeroCaracteres(name);
        
    }
    
    public int calculaEdad(int nacimiento){
        String formato="yyyy";
        Date actual = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
        int year = Integer.parseInt(dateFormat.format(actual));
        return (year - nacimiento); 
    }
    
    public int numeroCaracteres(String name){
        return name.length(); 
    }
}
