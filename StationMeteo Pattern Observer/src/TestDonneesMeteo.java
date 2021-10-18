public class TestDonneesMeteo {
    public static void main(String[] args) {
        DonneesMeteo dm= new DonneesMeteo();
        AffichageConditions ac= new AffichageConditions(dm);
        dm.setMesures(22,65,1020);
        dm.setMesures(25,85,1010);
        dm.setMesures(20,25,1100);
    }
}
