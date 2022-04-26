package test_interfaz;

import static java.lang.System.exit;
import java.util.Scanner;

public class Menu {

    private int Opc;
    private VolumenCono ObjVolumenCono;
    private Scanner Input;
    private double Tamano;
    private String Color;

    public Menu() {
        Opc = 0;
        ObjVolumenCono = new VolumenCono();
        Input = new Scanner(System.in);
        Tamano = 0;
        Color = " ";
    }

    public Menu(double Tamano, String Color) {
        Opc = 0;
        ObjVolumenCono = new VolumenCono();
        Input = new Scanner(System.in);
        this.Tamano = Tamano;
        this.Color = Color;
    }

    public int getOpc() {
        return Opc;
    }

    public void setOpc(int Opc) {
        this.Opc = Opc;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getTamano() {
        return Tamano;
    }

    public void setTamano(double Tamano) {
        this.Tamano = Tamano;
    }

    public void Anuncio() {
        System.out.println("Digite 1 si quiere calcular el ÁREA de un circulo");
        System.out.println("Digite 2 si quiere calcular el Volumen de una esfera");
        System.out.println("Digite 3 si quiere calcular el Volumen de un cilindro");
        System.out.println("Digite 4 si quiere calcular el Volumen de una cono");
        System.out.println("Digite 5 si quiere SALIR");
    }

    public void PedirOpcion() {
        double T = 0;
        while (this.getOpc() <= 0 || this.getOpc() > 5) {
            Anuncio();
            this.setOpc(Input.nextInt());
            if (this.getOpc() <= 0 || this.getOpc() > 5) {
                System.out.println("Ingrese una opción válida");
            }
        }
        if (this.getOpc() == 1) {
            T = this.ObjVolumenCono.CalcularFigura();
            this.setTamano(T);
            this.ObjVolumenCono.MostrarFigura(T);
        }
        if (this.getOpc() == 2) {
            T = this.ObjVolumenCono.CalcularFigura();
            this.setTamano(T);
            this.ObjVolumenCono.MostrarFigura(T);
        }
        if (this.getOpc() == 3) {
            T = this.ObjVolumenCono.CalcularFigura();
            this.setTamano(T);
            this.ObjVolumenCono.MostrarFigura(T);
        }
        if (this.getOpc() == 4) {
            T = this.ObjVolumenCono.CalcularFigura();
            this.setTamano(T);
            this.ObjVolumenCono.MostrarFigura(T);
        }
        if (this.getOpc() == 5) {
            System.out.println("Gracias por usar nuestro programa :)");
            exit(0);
        }
    }

    public void DefinirTamano(double Medida) {
        if (Medida > 0 && Medida <= 10) {
            System.out.println("El tamaño de su figura es muy pequeño");
            this.setColor("Blanco");
            System.out.println("El color de su figura es " + this.getColor());
        }
        if (Medida > 10 && Medida <= 30) {
            System.out.println("El tamaño de su figura es pequeño");
            this.setColor("Rosado");
            System.out.println("El color de su figura es " + this.getColor());
        }
        if (Medida > 30 && Medida <= 50) {
            System.out.println("El tamaño de su figura es mediano");
            this.setColor("Morado");
            System.out.println("El color de su figura es " + this.getColor());
        }
        if (Medida > 50 && Medida <= 100) {
            System.out.println("El tamaño de su figura es grande");
            this.setColor("Azul");
            System.out.println("El color de su figura es " + this.getColor());
        }
        if (Medida > 100 && Medida <= 200) {
            System.out.println("El tamaño de su figura es muy grande");
            this.setColor("Gris");
            System.out.println("El color de su figura es " + this.getColor());
        }
        if (Medida > 200) {
            System.out.println("El tamaño de su figura es enorme");
            this.setColor("Negro");
            System.out.println("El color de su figura es " + this.getColor());
        }
    }

    public void Proceso() {
        boolean Control = true;
        char Recurrencia = ' ';
        System.out.println("Bienvenid@ al programa que calcula Areas Y Volumenes\n");
        while (Control) {
            this.PedirOpcion();
            this.DefinirTamano(this.getTamano());
            System.out.println("\nQuiere volver a ejecutar el programa??? (s/n)");
            Recurrencia = Input.next().charAt(0);
            System.out.println(" ");
            if (Recurrencia == 's' || Recurrencia == 'S') {
                Control = true;
                this.setOpc(0);
            } else {
                Control = false;
            }
        }
    }
}
