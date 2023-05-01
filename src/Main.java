import java.util.Scanner;

public class Main {
    private static void print(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Perfil perfil = null;
        var input = new Scanner(System.in);
        var loop = true;
        while (loop){
            print("Digite o tipo do usuário");
            print("1 - Gratuito\n2 - Básico\n3 - Ultimate");
            print("0 - Sair");

            loop = false;
            var op = input.nextByte();
            switch (op) {
                case 0:
                    return;
                case 1:
                    perfil = new PerfilGratuito();
                    break;
                case 2:
                    perfil = new PerfilBasico();
                    break;
                case 3:
                    perfil = new PerfilUltimate();
                    break;
                default:
                    loop = true;
                    break;
            }
        }

        var sgbd = perfil.getSgbd();
        print("Conectado em " + sgbd.getDataBase() + " com " + sgbd.getUser());
    }
}
