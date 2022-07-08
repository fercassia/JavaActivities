package AtividadeInterface;

import AtividadeHerança.Cachorro;

public class Circulo implements IFormaGeometrica
{
    private double raio;
    private static final double PI = 3.14;

    public Circulo(double entradaRaio)
    {
        setRaio(entradaRaio);
    }
    private void setRaio(double entradaRaio)
    {
        if(entradaRaio <= 0)
        {
            System.out.println("O raio deve ser maior que 0!");
            return;
        }
        raio = entradaRaio;
    }
    private double getRaio()
    { return raio; }

    @Override
    public double area()
    {
        return (PI*raio*raio);
    }

    @Override
    public double comprimento()
    {
        return (2*PI*raio);
    }
}
