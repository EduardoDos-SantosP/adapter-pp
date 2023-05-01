public class ParadoxAdapter implements Sgbd {
    private ParadoxSgbd sgbd;

    public ParadoxAdapter(ParadoxSgbd sgbd) {
        this.sgbd = sgbd;
    }

    @Override
    public String getDataBase() {
        return sgbd.getParadoxDataBase();
    }

    @Override
    public String getUser() {
        return sgbd.getParadoxUser();
    }

    @Override
    public String getPassWord() {
        return sgbd.getParadoxPassWord();
    }
}
