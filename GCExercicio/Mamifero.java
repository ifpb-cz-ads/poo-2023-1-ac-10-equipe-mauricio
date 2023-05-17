package GCExercicio;

public abstract class Mamifero extends Animal{

    private String gestacao;
    private Boolean terrestre;

    public Mamifero(String nome, String genero, String raca, String cor, String gestacao, Boolean terrestre) {
        super(nome, genero, raca, cor);
        this.gestacao = gestacao;
        this.terrestre = terrestre;
    }

    public void andar() {
        if (terrestre){
            System.out.println(getNome() + "está andando!!");
        }
        else {
            System.out.println(getNome() + "está nadando!!");
        }
    }

    public abstract void falar();

}
