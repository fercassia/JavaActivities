package AtvidadeClasseAbstrata;

public class Circulo extends FormaGeometrica
{
    private final double PI = 3.14;
    private double raio;

    public void setRaio(double entradaRaio)
    {
        if(entradaRaio <= 0)
        {
            System.out.println("O raio deve ser maior que 0");
            return;
        }
        raio = entradaRaio;
    }

    @Override
    public void area()
    {
        double area = PI*(Math.pow(raio,2));
        System.out.println("Area do círculo é: "+area+"cm²");
    }
    @Override
    public void comprimento()
    {
        double comprimento = Math.round(2*(PI*raio));
        System.out.println("O comprimento do círculo é: "+comprimento+"cm");
    }
}
