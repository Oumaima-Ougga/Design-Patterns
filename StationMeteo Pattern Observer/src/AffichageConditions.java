public class AffichageConditions implements Observateur,Affichage{
    private float temperature;
    private float humidite;
    private float pression;
    private Meteo donneesMeteo;

    public AffichageConditions(Meteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.println("Conditions actuelles: "+temperature+ " degré et "+humidite+" d'humidité "+pression + " de pression.");
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature=temperature;
        this.humidite=humidite;
        this.pression=pression;
        afficher();

    }
}
