package CBBExercicio;

public class AppRegistraAluno {
    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();

        ana.setNome("Ana");
        ana.setEndereco("Av. Brasil, 1000");
        ana.setIdade(15);

        ana.setNotaMatematcia(9.7);
        ana.setNotaPortugues(8.2);
        ana.setNotaGeografia(7.4);

        ana.imprimir();
    }
}
