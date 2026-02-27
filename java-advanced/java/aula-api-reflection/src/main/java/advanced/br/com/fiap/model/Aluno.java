package advanced.br.com.fiap.model;


@Tabela (nome = "TAB_ALUNO")
public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static String exibeSQL(Object obj) {
        Tabela annotation = obj.getClass().getAnnotation(Tabela.class);
        return String.format("SELECT * FROM %s", annotation.nome());
    }
}


