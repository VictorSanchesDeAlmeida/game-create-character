package Inimigos;

public class Orc extends Inimigo{

    public Orc(String nome, int ataque, int vida) {
        super(nome, ataque, vida);
    }

    public int getAtaqueBasico(){
        return ataque + 2;
    }

    public void sofreDano(int ataque){
        this.vida -= ataque;

        System.out.println(nome + " sofre um ataque de " + ataque + ", ficando com " + vida + " de vida");
    }

    @Override
    public void atacar(){

        System.out.println(nome + " ataca com clava, causando " + (ataque + 2) + " de dano");

    }

}