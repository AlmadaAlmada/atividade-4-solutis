package mundo.animal;

public abstract class AnimalMarinhoAB extends AnimalAB {

    int distanciaNadada;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.distanciaNadada = 0;
    }

    public abstract void nadar();
}


