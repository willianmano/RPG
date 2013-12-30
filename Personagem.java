abstract class Personagem {
  protected String nome;
  protected int inteligencia;
  protected int forca;
  protected int vitalidade;
  protected int agilidade;
  protected int destreza;
  protected int sorte;

  protected int vida;
  protected int vidaBase = 1500;
  protected int danoBase;
  protected int defesaFisica;
  protected int defesaMagica;

  protected void calculaVida()
  {
    this.vida = this.vidaBase + this.vitalidade * 10;
  }
  public int getVida()
  {
    return this.vida;
  }
  public void diminuiVida(int dano)
  {
    this.vida = this.vida - dano;
  }
  protected void calculaDanoBase()
  {
    Double dano;
    dano = this.forca + (this.forca * 0.1);
    this.danoBase = dano.intValue();
  }
  public int getDanoBase()
  {
    return this.danoBase;
  }
  protected void calculaDefesaFisica()
  {
    Double temp;
    temp = this.vitalidade * 0.3;
    this.defesaFisica = temp.intValue();
  }
  public int getDefesaFisica()
  {
    return this.defesaFisica;
  }
  protected void calculaDefesaMagica()
  {
    Double temp;
    temp = this.inteligencia * 0.3;
    this.defesaMagica = temp.intValue();
  }
  public int getDefesaMagica()
  {
    return this.defesaMagica;
  }
}