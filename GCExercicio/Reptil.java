package GCExercicio;

public abstract class Reptil extends Animal{
    private Boolean terrestre;
    private Boolean rasteja;

    public Reptil(String nome, String genero, String raca, String cor, Boolean terrestre, Boolean rasteja) {
        super(nome, genero, raca, cor);
        this.terrestre = terrestre;
        this.rasteja = rasteja;
    }

    public abstract void falar();
    @Override
    public void andar() {
        if (terrestre){
            if (rasteja){
                System.out.println(getNome()+ "está rastejando!!");
            }
            else {
                System.out.println(getNome()+"está andando!!");
            }
        }
        else {
            System.out.println(getNome()+"está nadando!!");
        }

    }
}
