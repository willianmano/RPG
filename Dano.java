class Dano {
  int calculaDano(Personagem atacante, Personagem defensor)
  {
    int defesa;
    if(atacante.getClass().getName() == "Mago" || atacante.getClass().getName() == "Bruxo")
    {
      defesa = defensor.getDefesaMagica();
    } else if (atacante.getClass().getName() == "Cavaleiro" || atacante.getClass().getName() == "Templario") {
      defesa = defensor.getDefesaFisica();
    } else {
      defesa = defensor.getDefesaFisica();
    }

    return atacante.getDanoBase() - defesa;
  }
}