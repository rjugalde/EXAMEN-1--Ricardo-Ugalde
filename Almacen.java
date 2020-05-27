/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ches.examenru_poo;

import java.util.ArrayList;

/**
 *
 * @author ches
 */
public class Almacen {
    private String Nombre;
    private String Ubicacion;
    private String Web;
    private String Telefono;
    private ArrayList<Articulo> Inventario;
    private ArrayList<Oferta> Ofertas;
    private ArrayList<Financiamiento> Financiamientos;

    
    //constructor
    public Almacen(String Nombre, String Ubicacion, String Web, String Telefono) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.Web = Web;
        this.Telefono = Telefono;
    }
    
    //Getters & Setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public ArrayList<Articulo> getInventario() {
        return Inventario;
    }

    public void setInventario(ArrayList<Articulo> Inventario) {
        this.Inventario = Inventario;
    }

    public ArrayList<Oferta> getOfertas() {
        return Ofertas;
    }

    public void setOfertas(ArrayList<Oferta> Ofertas) {
        this.Ofertas = Ofertas;
    }

    public ArrayList<Financiamiento> getFinanciamientos() {
        return Financiamientos;
    }

    public void setFinanciamientos(ArrayList<Financiamiento> Financiamientos) {
        this.Financiamientos = Financiamientos;
    }
    
    
    //Code
    public void RegistrarArticulo(){}
    
    public void AgregarProducto(){}
    
    public void NuevaOferta(ArrayList<Articulo> Articulos){}

    
    


}
