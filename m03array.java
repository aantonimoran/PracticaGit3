import java.util.Scanner;

public class m03array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i = 0;
        int o = 0:
        int mesos = 0;
        int [] nums = new int[6];
        System.out.println("Escriu 6 numeros: ");
        mesos = sc.nextInt();
        while (i < 6) {
            nums[i] = sc.nextInt();
            i++;
        }
        System.out.println("Escriu el numero a adivinar: ");
        int numadivinar = sc.nextInt();
        i = 0;
        while (i < 6) {
            if (nums[i]== numadivinar) {
                System.out.println("S'ha trobat el numero a la posicio " + (i + 1));  
                break;
            }
            i++;
        }
        if (i == 7) {
            System.out.println("No s'ha trobat el numero");
        }
    }
}
