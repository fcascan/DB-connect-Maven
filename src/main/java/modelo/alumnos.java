/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fer
 */
public class alumnos{
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
        
    public alumnos(int id, String nombre, String apellido, String mail){
        //Contructor general
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;       
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String m){
        this.mail = m;
    } 
}
