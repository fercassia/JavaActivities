package AtividadeInterface;

public class Quadrado implements IFormaGeometrica
{
    private double lado;
    private final int LADOS_QUADRADO = 4;

    public Quadrado(double entradaLado)
    {
        setLado(entradaLado);
    }
    private void setLado(double entradaLado)
    {
        if(entradaLado <= 0)
        {
            System.out.println("O lado deve ser maior que 0!");
            return;
        }
        lado = entradaLado;
    }
    private double getRaio()
    { return lado; }

    @Override
    public double area() {
        return (lado*lado);
    }

    @Override
    public double comprimento() {
        return (lado*LADOS_QUADRADO);
    }
}
