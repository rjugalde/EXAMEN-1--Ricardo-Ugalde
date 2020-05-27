import java.time.Period;

public class Financiamiento {
    
    private float prima;
    private float TasaInteres;
    private float PrecioCreditoFinal;
    private Period Plazo;
    private Articulo ArticuloFinanciado;

    
    //Constructor
    public Financiamiento(float prima, float TasaInteres, float PrecioCreditoFinal, Period Plazo, Articulo ArticuloFinanciado) {
        this.prima = prima;
        this.TasaInteres = TasaInteres;
        this.PrecioCreditoFinal = PrecioCreditoFinal;
        this.Plazo = Plazo;
        this.ArticuloFinanciado = ArticuloFinanciado;
    }

    
    //Getters & Setters
    public float getPrima() {
        return prima;
    }

    public void setPrima(float prima) {
        this.prima = prima;
    }

    public float getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(float TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public float getPrecioCreditoFinal() {
        return PrecioCreditoFinal;
    }

    public void setPrecioCreditoFinal(float PrecioCreditoFinal) {
        this.PrecioCreditoFinal = PrecioCreditoFinal;
    }

    public Period getPlazo() {
        return Plazo;
    }

    public void setPlazo(Period Plazo) {
        this.Plazo = Plazo;
    }

    public Articulo getArticuloFinanciado() {
        return ArticuloFinanciado;
    }

    public void setArticuloFinanciado(Articulo ArticuloFinanciado) {
        this.ArticuloFinanciado = ArticuloFinanciado;
    }

    //Code
    public void Mostrar(){}
    
}
