public class PerfilUltimate extends Perfil {
    @Override
    public Sgbd getSgbd() {
        return new MySqlAdapter(new MySqlSgbd());
    }
}
