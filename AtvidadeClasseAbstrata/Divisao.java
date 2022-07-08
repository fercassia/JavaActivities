package AtvidadeClasseAbstrata;

public class Divisao extends OperacaoMatematica {
    @Override
    public void calcula(double entradaNumeros[])
    {
        double resultadoDivisao = entradaNumeros[0];

        if (entradaNumeros.length <= 0) {
            System.out.println("Para Dividir alimente com numeros");
            return;
        }

        if (entradaNumeros.length == 1) {
            resultadoDivisao = entradaNumeros[0];
            return;
        }

        for (int aux = 1; aux < entradaNumeros.length; aux++)
        {
            resultadoDivisao /= entradaNumeros[aux];
            if (aux == entradaNumeros.length)
            {
                break;
            }
        }
        System.out.println("Resultado divisão: "+resultadoDivisao);
    }
}

