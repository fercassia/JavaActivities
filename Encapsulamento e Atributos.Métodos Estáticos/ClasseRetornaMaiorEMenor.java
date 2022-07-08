package AtividadeStatica;

public class ClasseRetornaMaiorEMenor
{
    public static int MaiorEntreDoisNumeros(int numero1, int numero2)
    {
        return Math.max(numero1,numero2);
    }
    public static int MaiorEntreTresNumeros(int numero1, int numero2, int numero3)
    {
       int resultado = MaiorEntreDoisNumeros(numero1,numero2);
       return Math.max(resultado, numero3);
    }
    public static int MaiorEntreQuatroNumeros(int numero1, int numero2, int numero3, int numero4)
    {
        int resultadoDois = MaiorEntreTresNumeros(numero1,numero2,numero3);
        return Math.max(resultadoDois, numero4);
    }
    public static int MaiorEntreCincoNumeros(int numero1, int numero2, int numero3, int numero4, int numero5)
    {
        int resultadoTres = MaiorEntreQuatroNumeros(numero1, numero2, numero3, numero4);
        return Math.max(resultadoTres,numero5);
    }
}
