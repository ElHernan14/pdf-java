/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesEntidad;

import java.time.LocalDate;

/**
 *
 * @author Hernan14
 */
public class Usuario {

    public Usuario(String password, String nombre, String apellido, LocalDate fechaEntrada, String mail, String dni) {
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaEntrada = fechaEntrada;
        this.mail = mail;
        this.dni = dni;
    }

    public Usuario() {
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaEntrada=" + fechaEntrada + ", mail=" + mail + ", dni=" + dni + '}';
    }
    private String password,nombre,apellido,mail,dni;
    private LocalDate fechaEntrada;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Usuario(String password, String nombre, String apellido, LocalDate fechaEntrada, String mail) {
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaEntrada = fechaEntrada;
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public String getMail() {
        return mail;
    }
}
