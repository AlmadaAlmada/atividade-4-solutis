package mundo.animal;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        comidaIngerida += 30;
        System.out.println("O leão comeu 5 kl de carne");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 15;
        System.out.println("O leão se moveu 200 mts");
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O leão dormiu 10 horas");
    }
}

