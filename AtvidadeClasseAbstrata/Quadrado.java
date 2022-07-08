package AtvidadeClasseAbstrata;

public class Quadrado extends FormaGeometrica
{
    private double lado;
    private final int NUMERO_LADOS = 4;

    public void setLado(double entradaLado)
    {
        if(entradaLado <= 0)
        {
            System.out.println("O lado deve ser maior que 0");
            return;
        }
        lado = entradaLado;
    }

    @Override
    public void area()
    {
        double area = Math.pow(lado,2);
        System.out.println("Area do quadrado é: "+area+"cm²");
    }
    @Override
    public void comprimento()
    {
        double comprimento = lado*NUMERO_LADOS;
        System.out.println("O comprimento do quadrado é: "+comprimento+"cm");
    }
}
