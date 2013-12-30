class Bruxo extends Personagem {
  Bruxo (String nome, int inteligencia, int forca, int agilidade, int destreza, int vitalidade, int sorte)
  {
    this.nome = nome;
    this.inteligencia = inteligencia;
    this.forca = forca;
    this.agilidade = agilidade;
    this.destreza = destreza;
    this.vitalidade = vitalidade;
    this.sorte = sorte;

    //aumenta a vida base de 1500 para 3500
    this.vidaBase = 3500;
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
    dano = this.inteligencia + (this.inteligencia * 0.5);
    this.danoBase = dano.intValue();
  }
  protected void calculaDefesaMagica()
  {
    Double temp;
    temp = this.inteligencia * 0.8;
    this.defesaMagica = temp.intValue();
  }
}