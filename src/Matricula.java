import java.util.Date;

public class Matricula {
    private Aluno alunoMatricula;
    private Curso cursoMatricula;
    private Date dataDoDia;

    public Matricula(Aluno alunoMatricula, Curso cursoMatricula, Date dataDoDia) {
        this.alunoMatricula = alunoMatricula;
        this.cursoMatricula = cursoMatricula;
        this.dataDoDia = dataDoDia;
    }

    public Aluno getAlunoMatricula() {
        return alunoMatricula;
    }

    public void setAlunoMatricula(Aluno alunoMatricula) {
        this.alunoMatricula = alunoMatricula;
    }

    public Curso getCursoMatricula() {
        return cursoMatricula;
    }

    public void setCursoMatricula(Curso cursoMatricula) {
        this.cursoMatricula = cursoMatricula;
    }

    public Date getDataDoDia() {
        return dataDoDia;
    }

    public void setDataDoDia(Date dataDoDia) {
        this.dataDoDia = dataDoDia;
    }
}
