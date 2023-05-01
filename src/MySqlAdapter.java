public class MySqlAdapter implements Sgbd {
    private MySqlSgbd sgbd;

    public MySqlAdapter(MySqlSgbd sgbd) {
        this.sgbd = sgbd;
    }

    @Override
    public String getDataBase() {
        return sgbd.getMySqlDataBase();
    }

    @Override
    public String getUser() {
        return sgbd.getMySqlUser();
    }

    @Override
    public String getPassWord() {
        return sgbd.getMySqlPassWord();
    }
}
