package test_interfaz;

import java.util.Scanner;

public class VolumenCilindro extends VolumenEsfera implements I_Figura {

    private double Altura;

    public VolumenCilindro() {
        Altura = 0;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double PedirAltura() {
        Scanner Input = new Scanner(System.in);
        double H = 0;
        while (H <= 0) {
            System.out.print("Digite su Altura: ");
            H = Input.nextDouble();
            if (H <= 0) {
                System.out.println("***Digite una altura válida***");
            }
        }
        return H;
    }

    @Override
    public double CalcularFigura() {
        double Resultado = super.CalcularFigura();
        this.setAltura(this.PedirAltura());
        Resultado = Resultado * this.getAltura();
        return Resultado;
    }

    @Override
    public void MostrarFigura(double VolumenCilindro) {
        System.out.println("El volumen de su cilindro es: " + VolumenCilindro);
    }
}
