package AtvidadeClasseAbstrata;

import java.util.ArrayList;

public class Soma extends OperacaoMatematica
{
    @Override
    public void calcula(double entradaNumeros[])
    {
        double resultadoSoma = 0;
        for(double numero : entradaNumeros)
        {
            resultadoSoma+= numero;
        }
        System.out.println("Resultado da Soma: "+resultadoSoma);
    }
}
