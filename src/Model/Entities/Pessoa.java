package Model.Entities;

public class Pessoa {

    private int idpessoa;
    private int endereco_idendereco;
    private String nome;
    private String dtnascimento;
    private int idade;
    private String cpf;
    private String rg;
    private String tituloeleit;
    private String jogador;
    private String presidente;
    private String diretor;
    private String tecnico;
    private String auxtecnico;
    private String pessoa_de_fora;

    //Construtores
    public Pessoa() {
    }
    public Pessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idpessoa, int endereco_idendereco, String nome, String dtnascimento, int idade, String cpf, String rg, String tituloeleit, String jogador, String presidente, String diretor, String tecnico, String auxtecnico, String pessoa_de_fora) {
        this.idpessoa = idpessoa;
        this.endereco_idendereco = endereco_idendereco;
        this.nome = nome;
        this.dtnascimento = dtnascimento;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.tituloeleit = tituloeleit;
        this.jogador = jogador;
        this.presidente = presidente;
        this.diretor = diretor;
        this.tecnico = tecnico;
        this.auxtecnico = auxtecnico;
        this.pessoa_de_fora = pessoa_de_fora;
    }

    //Encapsulamentos
    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public int getEndereco_idendereco() {
        return endereco_idendereco;
    }

    public void setEndereco_idendereco(int endereco_idendereco) {
        this.endereco_idendereco = endereco_idendereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTituloeleit() {
        return tituloeleit;
    }

    public void setTituloeleit(String tituloeleit) {
        this.tituloeleit = tituloeleit;
    }

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getAuxtecnico() {
        return auxtecnico;
    }

    public void setAuxtecnico(String auxtecnico) {
        this.auxtecnico = auxtecnico;
    }

    public String getPessoa_de_fora() {
        return pessoa_de_fora;
    }

    public void setPessoa_de_fora(String pessoa_de_fora) {
        this.pessoa_de_fora = pessoa_de_fora;
    }
}
