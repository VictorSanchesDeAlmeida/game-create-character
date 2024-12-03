package Inimigos;

public abstract class Inimigo {

    protected String nome;
    protected int ataque;
    protected int vida;

    public int getVida() {
        return vida;
    }

    public Inimigo(String nome, int ataque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }

    public abstract void atacar();

}
