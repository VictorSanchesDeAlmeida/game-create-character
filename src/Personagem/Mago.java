package Personagem;

public class Mago extends Personagem {

    public Mago(String nome, int ataque, int vida) {
        super(nome, ataque, vida);
    }

    public int ataqueSimples(){
        return (ataque + 6);
    }

    public int ataqueEspecial(){
        return (ataque * 2);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " lança uma bola de fogo causando " + (ataque * 2) + " de dano mágico!");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " fez um ataque basico de " + (ataque + 6) + " de dano.");
    }
}