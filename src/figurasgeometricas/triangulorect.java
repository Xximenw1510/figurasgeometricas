package figurasgeometricas;
public class triangulorect extends figurarecta {
    public triangulorect(int alto, int ancho){ super(alto,ancho); }
    public double calcularArea(){ return (ancho*alto)/2.0; }
    public double calcularPerimetro(){
        double h = Math.sqrt(ancho*ancho + alto*alto);
        return ancho+alto+h;
    }
    public String imprimeFigura(){
        return super.imprimeFigura() + "\n" +
               "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho +
               ", area: " + String.format("%.2f", calcularArea()) +
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}