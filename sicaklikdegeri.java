import java.util.Scanner;

public class sicaklikdegeri {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Değerini Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        else if (sicaklik<=15 ) {
            System.out.println("Sinema izlemeye gidebilirsiniz");
        }
        else if (sicaklik<=25) {
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }
        else System.out.println("Yüzmeye gidebilirsiniz");
    }

}