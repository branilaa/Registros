public class Voto {
  private double voto;
  private String materia;
  
  public Voto(double voto, String materia) {
    if (voto < 1 || voto > 10) {
      voto = -1;
    }

    this.voto = voto;
    this.materia = materia;
  } 

  // Metodi getter
  public double getVoto() {
    return voto;
  }

  public String getMateria() {
    return materia;
  }

  // Metodi setter
  public void setVoto(double voto) {
    this.voto = voto;
  } 

  public void setMateria(String materia) {
    this.materia = materia;
  }
}