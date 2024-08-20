package mundo.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rosalia", "Cachorro", 5, "Doméstico", 0.8, 25.0, 4);
        Gato gato = new Gato("Ze", "Gato", 9,"Doméstico", 0.3, 15.00, 4);
        Leao leao = new Leao("Taylor Swift", "Leao", 15,"Selvagem", 2.0, 200.00, 4);
        Peixe peixe = new Peixe("Betinho", "Peixe", 2,"Doméstico", 0.1, 0.4);
        Pombo pombo = new Pombo("Fatinha", "Pombo", 4, "Doméstico", 0.2, 0.4, 2, 0.1);

        List<AnimalAB> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);
        animais.add(leao);
        animais.add(peixe);
        animais.add(pombo);

        for (AnimalIF animal : animais) {
            animal.comer();
            animal.moverse();
            animal.dormir();
            System.out.println();
        }

        for (AnimalAB animal : animais) {
            System.out.println("Informações do " + animal.getTipoAnimal() + ":");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura() + " metros");
            System.out.println("Peso: " + animal.getPeso() + " kg");

            if (animal instanceof AnimalTerrestreAB) {
                System.out.println("Quantidade de patas: " + ((AnimalTerrestreAB) animal).getQuantidadePatas());
            }

            if (animal instanceof AnimalVoadorAB) {
                System.out.println("Quantidade de asas: " + ((AnimalVoadorAB) animal).getquantidaDeAsas());
                System.out.println("Envergadura das asas: " + ((AnimalVoadorAB) animal).getEnvergaduraDaAsa() + " metros");
            }

            System.out.println();
        }
    }
}

