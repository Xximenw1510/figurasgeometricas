package figurasgeometricas;

public class Figurasgeometricas {
    public static void main(String[] args) {
        figura2d f = new triangulorect(3, 4);
        System.out.println(f.imprimeFigura());
        
        f = new circulo(3);
        System.out.println(f.imprimeFigura());
    }
}