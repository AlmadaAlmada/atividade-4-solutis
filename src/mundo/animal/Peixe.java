package mundo.animal;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    @Override
    public void comer() {
        comidaIngerida += 2;
        System.out.println("O peixe comeu 2 unidades de comida.");
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
        System.out.println("O peixe dormiu 6 horas.");
    }

    @Override
    public void nadar() {
        distanciaNadada += 15;
        System.out.println("O peixe nadou 15 unidades de distância.");
    }
}

