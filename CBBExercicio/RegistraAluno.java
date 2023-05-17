package CBBExercicio;

public class RegistraAluno {

    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematcia;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotaMatematcia(double notaMatematcia) {
        this.notaMatematcia = notaMatematcia;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getNotaMatematcia() {
        return notaMatematcia;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public double getMedia (){
        return  (notaMatematcia+notaGeografia+notaPortugues)/3;
    }

    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

    public void imprimir() {
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Idade: "+idade);
    }

    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: "+nome);
        System.out.println("Nota Matemática: " +mNota);
        System.out.println("Nota Português: " +pNota);
        System.out.println("Nota Geografia: " +gNota);
    }
}
