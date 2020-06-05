public class Camisa {
  
  private String cor;
  private String marca;
  private int valor;

  public Camisa (String cor, String marca, int valor) {
    setCor(cor);
    setMarca(marca);
    setValor(valor);
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
  
  @Override
  public String toString() {
    return "Informações: "+cor+", "+marca+", R$" +valor+"."; 
  }

  public boolean equals(Object o) {
    if(this == o) return true;
    if(o instanceof Camisa) {
      Camisa p = (Camisa) o;
      return this.cor == p.cor && this.marca == p.marca && this.valor == p.valor;
    }
    return false;
  }
}