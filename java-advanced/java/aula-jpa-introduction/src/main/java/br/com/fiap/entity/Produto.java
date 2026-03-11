package br.com.fiap.entity;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="TDS_TB_PRODUTO")
@SequenceGenerator(name = "produto", sequenceName = "SQ_TDS_TB_PRODUTO", allocationSize = 1)
public class Produto {
    @Id
    @Column(name="id_produto")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    private Integer id;

    @Column(name="nm_produto", nullable = false, length = 100)
    private String nome;

    @CreationTimestamp //Criar a data atual automaticamente no cadastro
    @Temporal(TemporalType.TIMESTAMP) //Gravar a data e hora no banco
    @Column(name="dt_cadastro", updatable = false)
    private Calendar dataCadastro;

    @Enumerated(EnumType.STRING) //Gravar o texto da constante
    @Column(name="tp_tipo", length = 20)
    private TipoProduto TipoProduto;

    @Column(name="qt_quantidade")
    private Integer quantidade;

    @Column(name="st_ativo")
    private Boolean ativo;

    public Produto() {
    }

    public Produto( String nome, Calendar dataCadastro, TipoProduto tipoProduto, Integer quantidade, Boolean ativo) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        TipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.ativo = ativo;
    }

    @PostPersist //Executa o metodo apos o persist
    private void executar() {
        System.out.println("Executando o método..");
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

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoProduto getTipoProduto() {
        return TipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        TipoProduto = tipoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
