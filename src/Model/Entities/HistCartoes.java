package Model.Entities;

public class HistCartoes {

    private int competicao_idcompeticao;
    private int competicao_categoria_idcompeticao;
    private int jogador_idjogador;
    private String cartaoamarelo;
    private String cartaovermelho;

    //Construtores
    public HistCartoes(int competicao_idcompeticao) {
        this.competicao_idcompeticao = competicao_idcompeticao;
    }

    public HistCartoes(int competicao_idcompeticao, int competicao_categoria_idcompeticao, int jogador_idjogador, String cartaoamarelo, String cartaovermelho) {
        this.competicao_idcompeticao = competicao_idcompeticao;
        this.competicao_categoria_idcompeticao = competicao_categoria_idcompeticao;
        this.jogador_idjogador = jogador_idjogador;
        this.cartaoamarelo = cartaoamarelo;
        this.cartaovermelho = cartaovermelho;
    }

    //Encapsulamentos
    public int getCompeticao_idcompeticao() {
        return competicao_idcompeticao;
    }

    public void setCompeticao_idcompeticao(int competicao_idcompeticao) {
        this.competicao_idcompeticao = competicao_idcompeticao;
    }

    public int getCompeticao_categoria_idcompeticao() {
        return competicao_categoria_idcompeticao;
    }

    public void setCompeticao_categoria_idcompeticao(int competicao_categoria_idcompeticao) {
        this.competicao_categoria_idcompeticao = competicao_categoria_idcompeticao;
    }

    public int getJogador_idjogador() {
        return jogador_idjogador;
    }

    public void setJogador_idjogador(int jogador_idjogador) {
        this.jogador_idjogador = jogador_idjogador;
    }

    public String getCartaoamarelo() {
        return cartaoamarelo;
    }

    public void setCartaoamarelo(String cartaoamarelo) {
        this.cartaoamarelo = cartaoamarelo;
    }

    public String getCartaovermelho() {
        return cartaovermelho;
    }

    public void setCartaovermelho(String cartaovermelho) {
        this.cartaovermelho = cartaovermelho;
    }
}
