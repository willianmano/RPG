import java.util.Random;

class PVP {
  public Personagem batalhar(Personagem personagem1, Personagem personagem2, Boolean console)
  {
    while(personagem1.getVida() > 0 && personagem2.getVida() > 0) {
      Random gerador = new Random();
      boolean resultado = gerador.nextBoolean();

      Dano dano = new Dano();
      int danoPersonagem;
      if (resultado) {
        //dano do personagem 1 no personagem 2
        danoPersonagem = dano.calculaDano(personagem1, personagem2);
        personagem2.diminuiVida(danoPersonagem);

        if (console) {
          System.out.println("Ataque: " + personagem1.nome + " - Dano causado: " + danoPersonagem);
        }
      } else {
        //dano do personagem 2 no personagem 1
        danoPersonagem = dano.calculaDano(personagem2, personagem1);
        personagem1.diminuiVida(danoPersonagem);
        
        if (console) {
          System.out.println("Ataque: " + personagem2.nome + " - Dano causado: " + danoPersonagem);
        }
      }
    }

    if (personagem1.getVida() > personagem2.getVida()) {
      return personagem1;
    } else {
      return personagem2;
    }
  }
}