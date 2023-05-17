package GCExercicio;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, String genero, String raca, String cor, String gestacao, Boolean terrestre) {
        super(nome, genero, raca, cor, gestacao, terrestre);
    }

    public void falar() {
        System.out.println(getNome() + "está latindo!");
        System.out.println("Au au!");
    }
}
