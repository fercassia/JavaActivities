package AtividadeInterface;

public class Soma implements IOperacaoMatematica
{
    int resultado;
    public Soma()
    {    }
    @Override
    public int calcula(int numeroUm, int numeroDois)
    {
        resultado = numeroUm+numeroDois;
        System.out.println(numeroUm+"+"+numeroDois+"= "+resultado);
        return resultado;
    }
}
