package test_interfaz;

public class VolumenCono extends VolumenCilindro implements I_Figura{

    @Override
    public double CalcularFigura() {
        double Resultado = (super.CalcularFigura()) / 3;
        return Resultado;
    }

    @Override
    public void MostrarFigura(double VolumenCono) {
        System.out.println("El volumen de su cono es: " + VolumenCono);
    }
}
