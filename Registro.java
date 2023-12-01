public class Registro {
  private Studente[] studenti = new Studente[10];
  private int numStudenti = 0;
  private double media = 0.0;

  public int getNumStudenti() {
    return numStudenti;
  }

  public double getMedia() {
    return media;
  }

  public Studente getStudente(int numStudente) {
    if (numStudente <= numStudenti) {
      return studenti[numStudente];
    } else {
      return null;
    }
  }

  private void ricalcolaMedia() {
    media = 0;

    for (int i = 0; i < numStudenti; i++) {
      media += studenti[i].getMedia();
    }

    media /= numStudenti;
  }

  public void inserisciStudente(String nome) {
    studenti[numStudenti] = new Studente(nome);
    
    numStudenti++;

    ricalcolaMedia();
  }

  public void eliminaUltimo() {
    numStudenti--;

    ricalcolaMedia();
  }

  public void aggiungiVoto(int numStudente, int voto, String materia) {
    if (numStudente <= numStudenti) {
      studenti[numStudente].inserisciVoto(voto, materia);

      ricalcolaMedia();
    }
  }
}