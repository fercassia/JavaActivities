package AtividadeInterface;

public class Multiplicacao implements IOperacaoMatematica
{
    int resultado;
    public Multiplicacao()
    {    }
    @Override
    public int calcula(int numeroUm, int numeroDois)
    {
        resultado = numeroUm*numeroDois;
        System.out.println(numeroUm+"*"+numeroDois+"= "+resultado);
        return resultado;
    }
}
