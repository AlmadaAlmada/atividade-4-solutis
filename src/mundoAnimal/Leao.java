package mundoAnimal;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        comidaIngerida += 30;
        System.out.println("O leão comeu 30 unidades de comida.");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 15;
        System.out.println("O leão se moveu 15 unidades de distância.");
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O leão dormiu 10 horas.");
    }
}

