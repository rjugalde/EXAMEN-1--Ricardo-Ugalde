import java.util.*;

public class Articulo {
    private ArrayList<String> Tipos = new ArrayList<String>( 
            Arrays.asList("A","B","C","D"));
    
    private String Tipo;
    private String Codigo;
    private String Descripcion;
    private String Modelo;
    private String Serie;
    private float PrecioContado;
    private boolean Garantia;
    private Financiamiento FinanciamientoArticulo;
    private Oferta OfertaArticulo;

    
    //Constructor
    public Articulo(String Tipo, String Codigo, String Descripcion, String Modelo, String Serie, float PrecioContado, boolean Garantia, Financiamiento FinanciamientoArticulo, Oferta OfertaArticulo) {
        this.Tipo = Tipo;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Modelo = Modelo;
        this.Serie = Serie;
        this.PrecioContado = PrecioContado;
        this.Garantia = Garantia;
        this.FinanciamientoArticulo = FinanciamientoArticulo;
        this.OfertaArticulo = OfertaArticulo;
    }
    
    // No Financiamiento Oferta
    public Articulo(String Tipo, String Codigo, String Descripcion, String Modelo, String Serie, float PrecioContado, boolean Garantia) {
        this.Tipo = Tipo;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Modelo = Modelo;
        this.Serie = Serie;
        this.PrecioContado = PrecioContado;
        this.Garantia = Garantia;
    }

    
    //Getters & Setters
    public ArrayList<String> getTipos() {
        return Tipos;
    }

    public void setTipos(ArrayList<String> Tipos) {
        this.Tipos = Tipos;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public float getPrecioContado() {
        return PrecioContado;
    }

    public void setPrecioContado(float PrecioContado) {
        this.PrecioContado = PrecioContado;
    }

    public boolean isGarantia() {
        return Garantia;
    }

    public void setGarantia(boolean Garantia) {
        this.Garantia = Garantia;
    }

    public Financiamiento getFinanciamientoArticulo() {
        return FinanciamientoArticulo;
    }

    public void setFinanciamientoArticulo(Financiamiento FinanciamientoArticulo) {
        this.FinanciamientoArticulo = FinanciamientoArticulo;
    }

    public Oferta getOfertaArticulo() {
        return OfertaArticulo;
    }

    public void setOfertaArticulo(Oferta OfertaArticulo) {
        this.OfertaArticulo = OfertaArticulo;
    }

    
    //Code
    public void SistemaFinanciamiento(){}

    public void Mostrar(){}
    
    
    
}
