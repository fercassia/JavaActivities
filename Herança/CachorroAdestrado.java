package AtividadeHerança;

public class CachorroAdestrado extends Cachorro
{
    //Construtor dessa classe (CachorroAdestrado) utiliza o construtor da classe Base (Cachorro)
    public CachorroAdestrado(String nomeCachorroEntrada, String racaCachorroEntrada)
    {
        super(nomeCachorroEntrada, racaCachorroEntrada);
    }
    public void deitar()
    {
        System.out.println("Deitando...");
    }
    public void rolar()
    {
        System.out.println("Rolando...");
    }
    public void fingirDeMorto()
    {
        System.out.println("Morri...");
    }
}
