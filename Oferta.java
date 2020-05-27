import java.util.ArrayList;
import java.time.LocalDate;

public class Oferta {
    private String Nombre; 
    private ArrayList<Articulo> Articulos;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    
    
    //Constructor
    public Oferta(String Nombre, ArrayList<Articulo> Articulos, LocalDate FechaInicio, LocalDate FechaFin) {
        this.Nombre = Nombre;
        this.Articulos = Articulos;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }

    
    //Getters & Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(ArrayList<Articulo> Articulos) {
        this.Articulos = Articulos;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    
    
    //Code
    public void EliminarOferta(Articulo Artic){}
    
    public void Mostrar(){}
    
    public void getDuracion(){}
    
    
}
