import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAluno;
    private List<Professor> listaProfessor;
    private List<Curso> listaCurso;
    private List<Matricula> listaMatricula;

    public DigitalHouseManager(List<Aluno> listaAluno, List<Professor> listaProfessor,
                               List<Curso> listaCurso, List<Matricula> listaMatricula) {
        this.listaAluno = listaAluno;
        this.listaProfessor = listaProfessor;
        this.listaCurso = listaCurso;
        this.listaMatricula = listaMatricula;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        //
    }

    public void excluirCurso(Integer codigoCurso) {
        //
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        //
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        //
    }

    public void excluirProfessor(Integer codigoProfessor) {
        //
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        //
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        //
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        //
    }

}
