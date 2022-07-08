package AtividadeHerança;

public class Cachorro
{
    private String nome;
    private String raca;

    public Cachorro(String nomeCachorroEntrada, String racaCachorroEntrada)
    {
        setNome(nomeCachorroEntrada);
        setRaca(racaCachorroEntrada);
    }
    private void setNome(String nomeCachorro)
    {
        if(nomeCachorro == null ||nomeCachorro.isEmpty() || nomeCachorro.isBlank())
        {
            System.out.println("É necessário colocar o nome do Cachorro");
            return;
        }
        nome = nomeCachorro;
    }
    private void setRaca(String racaCachorro)
    {
        if(racaCachorro == null ||racaCachorro.isEmpty() || racaCachorro.isBlank())
        {
            System.out.println("É necessário colocar a raça do Cachorro");
            return;
        }
        raca = racaCachorro;
    }
    private String getNome() { return nome; }
    private String getRaca() { return raca; }

    public void latir()
    {
        System.out.println("Au Au Au");
    }
    public void dormir()
    {
        System.out.println("Zzzzz...zzzzz...");
    }
    public void comer()
    {
        System.out.println("nham...nham...");
    }
    public static void  imprime(Cachorro cachorroEntrada)
    {
        System.out.println("Dados do cachorro: \nNome: "+cachorroEntrada.getNome()+"\nRaca: "+cachorroEntrada.getRaca());
    }
}
