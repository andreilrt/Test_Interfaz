package test_interfaz;

public class VolumenEsfera extends AreaCirculo implements I_Figura {

    @Override
    public double CalcularFigura() {
        double Resultado = 4 * (super.CalcularFigura()) / 3;
        return Resultado;
    }

    @Override
    public void MostrarFigura(double VolumenEsfera) {
        System.out.println("El volumen de su esfera es: " + VolumenEsfera);
    }
}
