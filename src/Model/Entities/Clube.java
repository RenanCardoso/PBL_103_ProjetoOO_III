package Model.Entities;

public class Clube {

    private int idclube;
    private String nome;
    private String dtfundacao;

    //Construtores
    public Clube(int idclube) {
        this.idclube = idclube;
    }

    public Clube(String nome) {
        this.nome = nome;
    }

    public Clube(int idclube, String nome, String dtfundacao) {
        this.idclube = idclube;
        this.nome = nome;
        this.dtfundacao = dtfundacao;
    }

    //Encapsulamentos
    public int getIdclube() {
        return idclube;
    }

    public void setIdclube(int idclube) {
        this.idclube = idclube;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtfundacao() {
        return dtfundacao;
    }

    public void setDtfundacao(String dtfundacao) {
        this.dtfundacao = dtfundacao;
    }
}
