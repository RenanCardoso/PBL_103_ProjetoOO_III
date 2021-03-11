package Model.Entities;

public class Competicao {

    //Atributos
    private int idcompeticao;
    private int categoria_idcategoria;
    private String nome;

    //Construtores
    public Competicao() {
    }

    public Competicao(String nome) {
        this.nome = nome;
    }

    public Competicao(Integer idcompeticao, Integer categoria_idcategoria, String nome) {
        this.idcompeticao = idcompeticao;
        this.categoria_idcategoria = idcompeticao;
        this.nome = nome;
    }

    //Encapsulamentos
    public int getIdcompeticao() {
        return idcompeticao;
    }

    public int getCategoria_idcategoria() {
        return categoria_idcategoria;
    }

    public String getNome() {
        return nome;
    }
}
