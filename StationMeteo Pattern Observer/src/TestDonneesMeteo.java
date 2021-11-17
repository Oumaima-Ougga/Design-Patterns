public class TestDonneesMeteo {
    public static void main(String[] args) {
        DonneesMeteo dm= new DonneesMeteo();
        AffichageConditions ac= new AffichageConditions(dm);
        System.out.println("Changement de donnéss ...");
        dm.setMesures(22,65,1020);
        System.out.println("Changement de donnéss ...");
        dm.setMesures(25,85,1010);
        System.out.println("Changement de donnéss ...");
        dm.setMesures(20,25,1100);
    }
}
