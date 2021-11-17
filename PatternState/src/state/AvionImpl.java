package state;

public class AvionImpl implements Avion {

    private State state;

    public AvionImpl() {
        state = new StateEnPiste(this);
    }

    @Override
    public void sortirDuGarage() {
         state.executeSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
     state.executeDecoller();
    }

    @Override
    public void atterir() {
       state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }
    abstract class State {
        protected AvionImpl avion;

        public State(AvionImpl avion) {
            this.avion = avion;
        }

        abstract  void executeSortirDuGarage();
        abstract void executeEntrerAuGarage();
        abstract  void executeDecoller();
        abstract   void executeAtterir();
        abstract void executeDoActivity();}

    class StateAuGarage extends State{

        public StateAuGarage(AvionImpl avion) {
            super(avion);
        }

        @Override
        void executeSortirDuGarage() {
            System.out.println("Du garage -> piste");
            avion.state=new StateEnPiste(avion);
        }

        @Override
        void executeEntrerAuGarage() {
            System.out.println("Impossible Deja au garge");
        }

        @Override
        void executeDecoller() {
            System.out.println("Impossible au garage");

        }

        @Override
        void executeAtterir() {
            System.out.println("Impossible au garage");
        }

        @Override
        void executeDoActivity() {
            System.out.println("En activité de l'etat au Garage ....");
        }
    }
    class StateEnAir extends State{


        public StateEnAir(AvionImpl avion) {
            super(avion);
        }

        @Override
        void executeSortirDuGarage() {
            System.out.println("Deja en Air impossible de sortir du garage !");
        }

        @Override
        void executeEntrerAuGarage() {
            System.out.println("Impossible d'entrer au garage , etet en air");

        }

        @Override
        void executeDecoller() {
            System.out.println("Deja en air, impossible de decoller");
        }

        @Override
        void executeAtterir() {
            System.out.println("Atterir air->piste");
            avion.state=new StateEnPiste(avion);
        }

        @Override
        void executeDoActivity() {
            System.out.println("En activité à l'etat en air ....;");
        }
    }
    class StateEnPiste extends State {


        public StateEnPiste(AvionImpl avion) {
            super(avion);
        }

        @Override
        void executeSortirDuGarage() {
            System.out.println("Impossible de sortir du garage !");
        }

        @Override
        void executeEntrerAuGarage() {
            System.out.println("De piste au garage");
            avion.state=new StateAuGarage(avion);

        }

        @Override
        void executeDecoller() {
            System.out.println("De piste à l'air");
            avion.state=new StateEnAir(avion);
        }

        @Override
        void executeAtterir() {
            System.out.println("Impossible d'atterir !");

        }

        @Override
        void executeDoActivity() {
            System.out.println("Activité de l'etat en piste ......");
        }
    }
}

