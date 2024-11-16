public class SimulateurDeCanards {
    public static void main(String[] args) {
        SimulateurDeCanards simulateur = new SimulateurDeCanards();
        simulateur.simuler();



    }

    public void simuler() {

        Cancaneur colvert = new CompteurDeCouacs(new Colvert());
        Cancaneur mandarin = new CompteurDeCouacs(new Mandarin());
        Cancaneur canardEnPlastique = new CompteurDeCouacs(new CanardEnPlastique());
        Cancaneur canardOie = new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
        Cancaneur Appelant = new CompteurDeCouacs(new Appelant());


        colvert.cancaner();
        mandarin.cancaner();
        canardEnPlastique.cancaner();
        canardOie.cancaner();
        Appelant.cancaner();

        System.out.println("Nous avons compté " + CompteurDeCouacs.getCouacs() + " couacs");
    }

    public void simuler(Cancaneur canard) {
        canard.cancaner();
    }
}
