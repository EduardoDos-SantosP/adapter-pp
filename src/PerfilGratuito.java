public class PerfilGratuito extends Perfil {
    @Override
    public Sgbd getSgbd() {
        return new ParadoxAdapter(new ParadoxSgbd());
    }
}
