public class Main {
  public static void main(String[] args) {
    Registro registro = new Registro();

    registro.inserisciStudente("Mario Rossi");
    registro.inserisciStudente("Luigi Verdi");
    registro.inserisciStudente("Giovanni Bianchi");
    registro.inserisciStudente("Giuseppe Negri");
    registro.inserisciStudente("Paolo Gialli");

    registro.aggiungiVoto(0, 8, "Matematica");
    registro.aggiungiVoto(0, 7, "Italiano");
    registro.aggiungiVoto(0, 2, "Inglese");
    registro.aggiungiVoto(0, 5, "Storia");

    registro.aggiungiVoto(1, 8, "Matematica");
    registro.aggiungiVoto(1, 5, "Italiano");
    registro.aggiungiVoto(1, 9, "Inglese");
    registro.aggiungiVoto(1, 6, "Storia");

    registro.aggiungiVoto(2, 8, "Matematica");
    registro.aggiungiVoto(2, 2, "Italiano");
    registro.aggiungiVoto(2, 9, "Inglese");
    registro.aggiungiVoto(2, 6, "Storia");

    registro.aggiungiVoto(3, 8, "Matematica");
    registro.aggiungiVoto(3, 7, "Italiano");
    registro.aggiungiVoto(3, 5, "Inglese");
    registro.aggiungiVoto(3, 6, "Storia");

    registro.aggiungiVoto(4, 2, "Matematica");
    registro.aggiungiVoto(4, 7, "Italiano");
    registro.aggiungiVoto(4, 9, "Inglese");
    registro.aggiungiVoto(4, 6, "Storia");

    System.out.println("Numero studenti: " + registro.getNumStudenti());
    System.out.println("Media studenti: " + registro.getMedia());

    // Stampa il nome e la media di ogni studente
    for (int i = 0; i < registro.getNumStudenti(); i++) {
      System.out.println("Studente " + registro.getStudente(i).getNome() + ": " + registro.getStudente(i).getMedia());
    }

    registro.eliminaUltimo();

    System.out.println("Numero studenti: " + registro.getNumStudenti());
    System.out.println("Media studenti: " + registro.getMedia());
  }
}