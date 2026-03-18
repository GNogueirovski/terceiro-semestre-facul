package advanced.br.com.fiap.entity;


import advanced.br.com.fiap.annotations.Descricao;

import javax.persistence.*;

@Entity
@Table(name = "TB_FUNCIONARIO")
@Descricao(descricao = "Tabela com informações básicas de um funcionário")
@SequenceGenerator(name = "funcionario", sequenceName = "SQ_TB_FUNCIONARIO", allocationSize = 1)
public class Funcionario {

    @Id
    @Column(name="id_funcionario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario")
    private Integer id;
    @Column(name="nm_funcionario", nullable = false, length = 100)
    private String nome;
    @Column(name="hr_trabalhada", length = 60)
    private Integer horasTrabalhadas;
    @Column(name="vl_hora_trabalhada", precision = 10, scale = 2)
    private Double valorHoraTrabalhada;

    public Funcionario (){}

    public Funcionario(String nome, int horasTrabalhadas, double valorHoraTrabalhada) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public void exibirSQL(Object objeto, String operacao) {
        Table table = objeto.getClass().getAnnotation(Table.class);
        String nomeTabela = table.name();

        switch (operacao.toUpperCase()) {
            case "SELECT":
                System.out.println("SELECT * FROM " + nomeTabela);
                break;
            case "INSERT":
                System.out.println("INSERT INTO " + nomeTabela + " VALUES (...)");
                break;
            case "UPDATE":
                System.out.println("UPDATE " + nomeTabela + " SET ... WHERE id = " + this.getId());
                break;
            case "DELETE":
                System.out.println("DELETE FROM " + nomeTabela + " WHERE id = " + this.getId());
                break;
        }
    }

    public void imprimirInformacao (){
        String mensagem = String.format("Informações do Funcionário\nID:%d\nNOME:%s\nSALÁRIO: R$%.2f\nVALOR HORA: R$%.2f" +
                "\nHORAS Trabalhadas: %d", this.getId(), this.getNome(), this.calcularSalario(),this.getValorHoraTrabalhada(), this.getHorasTrabalhadas());
        System.out.println(mensagem);
    }

    public Double calcularSalario(){
        return this.getValorHoraTrabalhada() * this.getHorasTrabalhadas();
    }
}
