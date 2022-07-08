package AtividadeInterface;

public class Subtracao implements IOperacaoMatematica
{
    int resultado;
    public Subtracao()
    {    }
    @Override
    public int calcula(int numeroUm, int numeroDois)
    {
        resultado = numeroUm-numeroDois;
        System.out.println(numeroUm+"-"+numeroDois+"= "+resultado);
        return resultado;
    }
}
