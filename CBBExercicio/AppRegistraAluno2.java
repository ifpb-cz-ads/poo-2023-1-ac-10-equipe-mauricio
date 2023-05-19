package CBBExercicio;

public class AppRegistraAluno2 {
    public static void main(String[] args) {
        RegistraAluno gabi = new RegistraAluno();

        gabi.setNome("Gabi");
        gabi.setEndereco("Av. Beyhive, 1981");
        gabi.setIdade(20);

        gabi.setNotaMatematcia(10);
        gabi.setNotaPortugues(10);
        gabi.setNotaGeografia(7.4);

        gabi.imprimir(gabi.getNotaMatematcia(),gabi.getNotaPortugues(),gabi.getNotaGeografia());
    }
}
