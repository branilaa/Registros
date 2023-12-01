public class Studente {
  private String nome;
  private Voto[] voti = new Voto[10];
  private int numVoti = 0;
  private double media = 0.0;

  public Studente(String nome) {
    this.nome = nome;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Voto[] getVoti() {
    return voti;
  }

  public double getMedia() {
    return media;
  }

  public int getNumVoti() {
    return numVoti;
  }

  private void ricalcolaMedia() {
    media = 0;

    for (int i = 0; i < numVoti; i++) {
      media += voti[i].getVoto();
    }

    media /= numVoti;
  }

  public void inserisciVoto(int voto, String materia) {
    if (numVoti < 10) {
      Voto nuovoVoto = new Voto(voto, materia);
  
      voti[numVoti] = nuovoVoto;
  
      numVoti++;
  
      ricalcolaMedia();
    } else {
      System.out.println("Errore: non puoi aggiungere più di 10 voti.");
    }
  }
  
  public void eliminaUltimo() {
    numVoti--;

    ricalcolaMedia();
  }
}