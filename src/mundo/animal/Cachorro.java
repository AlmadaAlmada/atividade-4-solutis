package mundo.animal;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        comidaIngerida += 5;
        System.out.println("O cachorro comeu 200 g de ração");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 10;
        System.out.println("O cachorro andou 10 mts");
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
        System.out.println("O cachorro dormiu 8 horas");
    }
}

