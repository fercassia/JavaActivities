package AtvidadeClasseAbstrata;

import java.util.ArrayList;

public class Subtracao extends OperacaoMatematica
{
    @Override
    public void calcula(double entradaNumeros[])
    {
        double resultadoSubtracao = 0;
        for(double numero : entradaNumeros)
        {
            resultadoSubtracao-= numero;
        }
        System.out.println("Resultado da Subtracao: "+resultadoSubtracao);
    }
}
