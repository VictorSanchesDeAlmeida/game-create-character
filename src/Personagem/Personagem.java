package Personagem;

public abstract class Personagem {

    protected String nome;
    protected int ataque;
    protected int vida;

    public Personagem(String nome, int ataque, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void sofreDano(int ataqueInimigo) {
        this.vida -= ataqueInimigo;
        System.out.println(nome + " sofre um ataque de " + ataqueInimigo + " de dano, ficando com " + vida + " de vida.");
    }

    public abstract void atacar();
    public abstract void habilidadeEspecial();
}
