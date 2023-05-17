package GCExercicio;

public class Gato extends Mamifero{

    public Gato(String nome, String genero, String raca, String cor, String gestacao, Boolean terrestre) {
        super(nome, genero, raca, cor, gestacao, terrestre);
    }

    public void falar(){
        System.out.println(getNome() + "está miando!");
        System.out.println("Miau miau!");
    }

}
