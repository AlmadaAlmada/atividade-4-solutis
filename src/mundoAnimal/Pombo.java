package mundoAnimal;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidaDeAsas, double envergaduraDaAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidaDeAsas, envergaduraDaAsa);
    }

    @Override
    public void comer() {
        comidaIngerida += 1;
        System.out.println("O pombo comeu 1 unidade de comida.");
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
        System.out.println("O pombo dormiu 8 horas.");
    }

    @Override
    public void voar() {
        distanciaDoVoo += 20;
        System.out.println("O pombo voou 20 unidades de distância.");
    }
}

