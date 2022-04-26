package test_interfaz;

import java.util.Scanner;

public class AreaCirculo implements I_Figura {

    private double Radio;

    public AreaCirculo() {
        Radio = 0;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return this.Radio;
    }

    public double PedirRadio() {
        Scanner Input = new Scanner(System.in);
        double R = 0;
        while (R <= 0) {
            System.out.print("Digite su radio: ");
            R = Input.nextDouble();
            if (R <= 0) {
                System.out.println("***Digite un radio valido***");
            }
        }
        return R;
    }

    @Override
    public double CalcularFigura() {
        this.setRadio(this.PedirRadio());
        return Math.PI * this.getRadio() * this.getRadio();
    }

    @Override
    public void MostrarFigura(double Area) {
        System.out.println("El Area de su circulo es: " + Area);
    }
}
