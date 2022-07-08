package AtividadeStatica;

public class ConversaoDeUnidadesDeTempo
{
    private static final int umMinutoPraSegundos = 60;
    private static final int umaHoraParaMinutos= 60;
    private static final int umDiaParaHora = 24;
    private static final int umaSemanaParaDias = 7;
    private static final int umMesParaDias = 30;
    private static final double umAnoParaDias = 365.25;

    public static int ConversaoMinutoPraSegundos(int minuto)
    {
        return minuto*umMinutoPraSegundos;
    }
    public static int ConversaoHoraParaMinutos(int hora)
    {
        return hora*umaHoraParaMinutos;
    }
    public static int ConversaoDiaParaHora(int dia)
    {
        return dia*umDiaParaHora;
    }
    public static int ConversaoSemanaParaDias(int semana)
    {
        return semana*umaSemanaParaDias;
    }
    public static int ConversaoMesParaDias(int mesQuantidade)
    {
        return mesQuantidade*umMesParaDias;
    }
    public static double ConversaoAnoParaDias(double anos)
    {
        return anos*umAnoParaDias;
    }
}
