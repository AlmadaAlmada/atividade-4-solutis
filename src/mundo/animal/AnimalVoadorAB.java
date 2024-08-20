package mundo.animal;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidaDeAsas;
    protected  int distanciaDoVoo;
    protected double envergaduraDaAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, int quantidaDeAsas, double envergaduraDaAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidaDeAsas = quantidaDeAsas;
        this.envergaduraDaAsa = envergaduraDaAsa;
    }

    public int getquantidaDeAsas() {
        return quantidaDeAsas;
    }

    public double getEnvergaduraDaAsa() {
        return envergaduraDaAsa;
    }

    public abstract void voar();
}

