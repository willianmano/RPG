class Cavaleiro extends Personagem {
  Cavaleiro (String nome, int inteligencia, int forca, int agilidade, int destreza, int vitalidade, int sorte)
  {
    this.nome = nome;
    this.inteligencia = inteligencia;
    this.forca = forca;
    this.agilidade = agilidade;
    this.destreza = destreza;
    this.vitalidade = vitalidade;
    this.sorte = sorte;

    //aumenta a vida base de 1500 para 3000
    this.vidaBase = 3000;
    //calcula a vida do personagem
    calculaVida();
    //calcula o dano base do personagem
    calculaDanoBase();

    calculaDefesaFisica();

    calculaDefesaMagica();
  }
  public void calculaDanoBase()
  {
    Double dano;
    dano = this.forca + (this.forca * 0.3);
    this.danoBase = dano.intValue();
  }
  public void calculaVida()
  {
    this.vida = this.vidaBase + this.vitalidade * 12;
  }
  protected void calculaDefesaFisica()
  {
    Double temp;
    temp = this.vitalidade * 0.5;
    this.defesaFisica = temp.intValue();
  }
}