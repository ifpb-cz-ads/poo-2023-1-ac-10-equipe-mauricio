package GCExercicio;

public class Cobra extends Reptil{
    private Boolean veneno;

    public Cobra(String nome, String genero, String raca, String cor, Boolean terrestre, Boolean rasteja, Boolean veneno) {
        super(nome, genero, raca, cor, terrestre, rasteja);
        this.veneno = veneno;
    }

    public void falar() {
        System.out.println("está sibilando!!");
        System.out.println("*sons de cobra*");
    }
}
