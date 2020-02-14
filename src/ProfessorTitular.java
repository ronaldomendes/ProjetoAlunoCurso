public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int tempoDeCasa, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    public ProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, codigoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
