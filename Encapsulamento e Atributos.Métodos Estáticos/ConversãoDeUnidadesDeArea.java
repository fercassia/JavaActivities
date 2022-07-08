package AtividadeStatica;

public class ConversãoDeUnidadesDeArea
{
    private static final double umMetroParaPeQuadrado = 10.76;
    private static final double UmPeQuadradoParaCentrimetroQuadrado= 929;
    private static final double umaMilhaQuadradaParaAcre = 640;
    private static final double umAcreParaPesQuadrados = 43.560;

    public static double ConversaoMetroParaPeQuadrado(double metro)
    {
        return metro*umMetroParaPeQuadrado;
    }
    public static double ConversaoPeQuadradoParaCentrimetroQuadrado(double peQuadrado)
    {
        return peQuadrado*UmPeQuadradoParaCentrimetroQuadrado;
    }
    public static double ConversaoMilhaQuadradaParaAcre(double milhaQuadrada)
    {
        return milhaQuadrada*umaMilhaQuadradaParaAcre;
    }
    public static double ConversaoAcreParaPesQuadrados(double acre)
    {
        return acre*umAcreParaPesQuadrados;
    }
}
