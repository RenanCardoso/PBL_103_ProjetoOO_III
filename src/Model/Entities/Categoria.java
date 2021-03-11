package Model.Entities;

public class Categoria {

    //Atributos
    private int idcategoria;
    private String nome;

    //Construtores
    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(Integer idcategoria, String nome) {
        this.idcategoria = idcategoria;
        this.nome = nome;
    }

    //Encapsulamentos
    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
