public class AdaptateurDOie implements Cancaneur {
    private Oie oie;

    public AdaptateurDOie(Oie oie) {
        this.oie = oie;
    }

    @Override
    public void cancaner() {
        oie.cacarder();
    }
}
