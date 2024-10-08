package mundo.animal;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        comidaIngerida += 3;
        System.out.println("O gato comeu 100 g de ração");
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 5;
        System.out.println("O gato se moveu 5 mts");
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
        System.out.println("O gato dormiu 12 horas");
    }
}
