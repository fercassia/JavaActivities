package AtividadeInterface;

public class Divisao implements IOperacaoMatematica
{
    int resultado;
    public Divisao()
    {    }
    @Override
    public int calcula(int numeroUm, int numeroDois)
    {
        if(numeroDois == 0)
        {
            System.out.println("Impossível dividir por 0");
            return 0;
        }
        resultado = numeroUm/numeroDois;
        System.out.println(numeroUm+"/"+numeroDois+"= "+resultado);
        return resultado;
    }
}
