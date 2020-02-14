import java.util.Date;
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
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        this.listaCurso.add(curso);
    }

    public void excluirCurso(Integer codigoCurso) {
        this.listaCurso.remove(codigoCurso);
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorAdjunto profAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        this.listaProfessor.add(profAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular profTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        this.listaProfessor.add(profTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        this.listaProfessor.remove(codigoProfessor);
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        this.listaAluno.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        if(listaCurso.contains(codigoCurso)) {
            Matricula matricula = new Matricula(listaAluno.get(codigoAluno), listaCurso.get(codigoCurso), new Date());
            this.listaMatricula.add(matricula);
            System.out.println("Matrícula realizada com sucesso!");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        //
    }
}
