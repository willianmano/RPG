class WillianMano {
  public static void main(String[] args) {
    Mago mago = new Mago("Mago",150,10,5,100,50,1);
    System.out.println("Nome do personagem: " + mago.nome);
    System.out.println("HP: " + mago.getVida());
    System.out.println("Dano base: " + mago.getDanoBase());

    Bruxo bruxo = new Bruxo("Bruxo",150,10,5,100,50,1);
    System.out.println("Nome do personagem: " + bruxo.nome);
    System.out.println("HP: " + bruxo.getVida());
    System.out.println("Dano base: " + bruxo.getDanoBase());

    // Cavaleiro cavaleiro = new Cavaleiro("Cavaleiro",10,80,30,30,115,1);
    // System.out.println("Nome do personagem: " + cavaleiro.nome);
    // System.out.println("HP: " + cavaleiro.getVida());
    // System.out.println("Dano base: " + cavaleiro.getDanoBase());

    // Templario templario = new Templario("Templario",10,80,30,30,115,1);
    // System.out.println("Nome do personagem: " + templario.nome);
    // System.out.println("HP: " + templario.getVida());
    // System.out.println("Dano base: " + templario.getDanoBase());

    PVP pvp = new PVP();
    // argumento 3 imprime o dano causado em cada round 
    Personagem vencedor = pvp.batalhar(mago, bruxo, false);

    System.out.println("------------");
    System.out.println("Vencedor do duelo: " + vencedor.nome);
    System.out.println("HP: " + vencedor.getVida());
  }
}