# Battle Simulation Game

## **Descrição**
Este projeto é um jogo de simulação de batalha simples, onde um personagem principal (Mago) enfrenta dois inimigos (Orc e Goblin). Cada entidade possui características como pontos de vida e habilidades de ataque. O jogo se desenrola de forma aleatória, simulando turnos de ataques e defesas até que o mago ou os inimigos sejam derrotados.

---

## **Estrutura do Projeto**

### Diretório: `src/`
O código está dividido em pacotes, cada um contendo classes específicas para organização.

#### **1. Pacote: `Inimigos`**
Este pacote contém as classes que representam os inimigos:
- `Goblin`: Um inimigo com dano e pontos de vida menores.
- `Orc`: Um inimigo mais forte com maior dano e pontos de vida.
- `Inimigo`: Classe base para inimigos.

#### **2. Pacote: `Personagem`**
Este pacote contém as classes que representam os personagens:
- `Mago`: Personagem principal do jogo com ataques simples e especiais.
- `Guerreiro` (opcional): Outra classe de personagem, se implementada.
- `Personagem`: Classe base para os personagens.

#### **3. Classe Principal: `Main`**
A classe principal contém a lógica do jogo, gerencia os turnos e determina o vencedor.

---

## **Regras do Jogo**
1. **Personagem Principal:**
   - O mago pode usar ataques simples ou habilidades especiais.
   - Ataques especiais causam dano em área (atingem todos os inimigos).

2. **Inimigos:**
   - Tanto o Goblin quanto o Orc têm ataques simples e causam dano ao mago.

3. **Condições de Vitória/Derrota:**
   - O jogo termina quando:
     - O mago perde todos os seus pontos de vida (**derrota**).
     - Ambos os inimigos perdem todos os seus pontos de vida (**vitória**).

4. **Probabilidade:**
   - Os eventos (ataques e habilidades) são determinados por números gerados aleatoriamente.

---

## **Como Executar**
1. Certifique-se de ter um ambiente Java configurado.
2. Compile o projeto:
   ```bash
   javac Main.java
