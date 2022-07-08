package AtividadeInterface;

public class EscolhaDeOperacao {
    public static void escolha(int entradaUsuario, int numeroUm, int numeroDois)
    {
        switch (entradaUsuario)
        {
            case 1:
                IOperacaoMatematica soma = new Soma();
                soma.calcula(numeroUm,numeroDois);
                break;
            case 2:
                IOperacaoMatematica subtracao = new Subtracao();
                subtracao.calcula(numeroUm,numeroDois);
                break;
            case 3:
                IOperacaoMatematica multiplicacao = new Multiplicacao();
                multiplicacao.calcula(numeroUm,numeroDois);
                break;
            case 4:
                IOperacaoMatematica divisao = new Divisao();
                divisao.calcula(numeroUm,numeroDois);
                break;
            default:
                System.out.println("Não existe esta operação");
        }
    }
}
