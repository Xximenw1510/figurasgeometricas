package figurasgeometricas;
public class circulo extends figuracircular {
    public circulo(int radio){ super(radio); }
    public double calcularArea(){ return Math.PI*radio*radio; }
    public double calcularPerimetro(){ return 2*Math.PI*radio; }
    public String imprimeFigura(){
        return super.imprimeFigura() + "\n" +
               "Se imprime un Circulo con radio: " + radio +
               ", area: " + String.format("%.2f", calcularArea()) +
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}