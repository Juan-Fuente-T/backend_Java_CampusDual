package com.library_app.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "SOCIOS")

public class Socio {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int socioId;
    @Column
    private String Nnmbre;
    @Column
    private String apellidos;
    @Column
    private String direccion;
    @Column
    private String ciudad;
    @Column
    private int codigoPostal;
    @Column
    private String telefono;
    @Column
    private String email;
    @Column
    private Date fechaAlta;
    @Column
    private boolean activo;
    @Column
    private int prestamoId;

    public int getSocioId() {
        return socioId;
    }

    public void setSocioId(int socioId) {
        this.socioId = socioId;
    }

    public String getNnmbre() {
        return Nnmbre;
    }

    public void setNnmbre(String nnmbre) {
        Nnmbre = nnmbre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(int prestamoId) {
        this.prestamoId = prestamoId;
    }
}
