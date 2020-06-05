public enum Tamanho {

  P("Pequeno"),
  M("Médio"),
  G("Grande"),
  GG("Extra Grande");

  private String tamanho;

  private Tamanho (String tamanho) {
    this.tamanho = tamanho;
  }

  public String getTamanho(){
    return tamanho;
  }
}
