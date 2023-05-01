public class PerfilBasico extends Perfil {
    @Override
    public Sgbd getSgbd() {
        return new FirebaseAdapter(new FirebaseSgbd());
    }
}
