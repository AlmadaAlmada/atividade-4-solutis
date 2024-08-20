package mundo.animal;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        comidaIngerida += 50;
        System.out.println("O elefante comeu 3 kl de folhas");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 20;
        System.out.println("O elefante se moveu 20 mts");
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
        System.out.println("O elefante dormiu 4 horas");
    }
}

