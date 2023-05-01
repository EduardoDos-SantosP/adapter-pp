public class FirebaseAdapter implements Sgbd {
    private FirebaseSgbd sgbd;

    public FirebaseAdapter(FirebaseSgbd sgbd) {
        this.sgbd = sgbd;
    }

    @Override
    public String getDataBase() {
        return sgbd.getFirebaseDataBase();
    }

    @Override
    public String getUser() {
        return sgbd.getFirebaseUser();
    }

    @Override
    public String getPassWord() {
        return sgbd.getFirebasePassWord();
    }
}
