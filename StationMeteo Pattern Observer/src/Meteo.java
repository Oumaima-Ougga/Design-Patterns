public interface Meteo {
    void enregistrerObservateur(Observateur obs);
    void supprimerObservateur(Observateur obs);
    void notifierObservateurs();
}
