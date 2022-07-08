package AtividadeHerança;

public class Call
{
    public static void main(String[] args)
    {
        System.out.println("\nInicio cachorro 01\n");
        Cachorro cachorroUm = new Cachorro("Adriano", "Buldogue");
        cachorroUm.comer();
        cachorroUm.dormir();
        cachorroUm.latir();
        Cachorro.imprime(cachorroUm);

        System.out.println("\nInicio cachorro 02\n");
        CachorroAdestrado cachorroDois = new CachorroAdestrado("Rex", "Chihuahua");
        cachorroDois.comer();
        cachorroDois.dormir();
        cachorroDois.latir();
        cachorroDois.deitar();
        cachorroDois.fingirDeMorto();
        cachorroDois.rolar();
        Cachorro.imprime(cachorroDois);
    }
}
