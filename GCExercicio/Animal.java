package GCExercicio;

public abstract class Animal {
    private String nome;
    private String genero;
    private String raca;
    private String cor;

    public Animal(String nome, String genero, String raca, String cor) {
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void dorme() {
        System.out.println(nome + "a mimir!");
        System.out.println("zZzZzZzZzZz");
    }

    public void come() {
        System.out.println(nome + "está papando!");
        System.out.println("nham nham nham, delicious!");
    }

    public abstract void andar();
}
