import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        criando todas as listas
        List<Aluno> listaAlunos = new ArrayList<>();
        List<ProfessorTitular> listaProfTitular = new ArrayList<>();
        List<ProfessorAdjunto> listaProjAdjunto = new ArrayList<>();
        List<Curso> listaCurso = new ArrayList<>();

//        instanciando os objetos
        ProfessorTitular profTitular01 = new ProfessorTitular
                ("Alfredo", "Cruz", 182, "Java");
        ProfessorTitular profTitular02 = new ProfessorTitular
                ("Francisco", "Alves", 78, "JavaScript");

        ProfessorAdjunto profAdjunto01 = new ProfessorAdjunto
                ("Eliana", "Silva", 99, 0);
        ProfessorAdjunto profAdjunto02 = new ProfessorAdjunto
                ("José", "Silva", 165, 0);

//        adicionando cada objeto em sua respectiva lista

    }
}
