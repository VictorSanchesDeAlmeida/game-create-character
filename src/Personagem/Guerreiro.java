package Personagem;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int ataque, int vida) {
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
        System.out.println(nome + " ataca com espada causando " + (ataque * 2) + " de dano mágico!");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " fez um ataque basico de " + (ataque + 8) + " de dano.");
    }
}