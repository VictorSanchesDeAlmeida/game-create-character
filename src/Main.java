import Inimigos.Goblin;
import Inimigos.Orc;
import Personagem.Mago;

public class Main {
    public static void main(String[] args) {

        Mago mago = new Mago("Victor", 18, 55);
        Orc orc = new Orc("Rex o Orc", 15, 60);
        Goblin goblin = new Goblin("Goblito", 12, 30);

        int numRandom = 0;

        while (true){

            numRandom = (int) (Math.random() * 100);

            if (numRandom <= 70){

                numRandom = (int) (Math.random() * 100);

                if(numRandom >= 50){
                    orc.atacar();
                    mago.sofreDano(orc.getAtaqueBasico());
                }else{
                    goblin.atacar();
                    mago.sofreDano(goblin.getAtaqueBasico());
                }

            }else{

                numRandom = (int) (Math.random() * 100);

                if(numRandom > 70){

                    mago.habilidadeEspecial();
                    orc.sofreDano(mago.ataqueEspecial());
                    goblin.sofreDano(mago.ataqueEspecial());
                }else{
                    mago.atacar();
                    orc.sofreDano(mago.ataqueSimples());
                    goblin.sofreDano(mago.ataqueSimples());
                }

            }

            if(mago.getVida() <= 0){

                System.out.println("Seu personagem morreu!!");
                break;

            }else if (orc.getVida() <= 0 && goblin.getVida() <= 0){

                System.out.println("Seu personagem venceu!!");
                break;

            }

        }

    }
}