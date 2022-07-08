package AtvidadeClasseAbstrata;

import java.util.ArrayList;

public class Multiplicacao extends OperacaoMatematica
{
    @Override
    public void calcula(double entradaNumeros[])
    {
        if(entradaNumeros.length <= 0)
        {
            System.out.println("Para multiplicar alimente com numeros");
            return;
        }
        double resultadoMultiplicacao = entradaNumeros[0];

        for(double numero : entradaNumeros)
        {
            resultadoMultiplicacao*= numero;
        }
        System.out.println("Resultado da Multiplicacao: "+resultadoMultiplicacao);
    }
}
