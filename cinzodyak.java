import java.util.Scanner;
public class cinzodyak {
    
public static void main(String[] args) {
    int birthDate;
    Scanner inp=new Scanner(System.in);

    System.out.println("Doğum yılınızı giriniz :");
    birthDate=inp.nextInt();

    switch (birthDate%12) {
        case 0:
        System.out.println("Çin Zodyağı burcunuz : Maymun");
        break;
        case 1:
        System.out.println("Çin Zodyağı burcunuz : Horoz");
        break;
        case 2:
        System.out.println("Çin Zodyağı burcunuz : Köpek");
        break;
        case 3:
        System.out.println("Çin Zodyağı burcunuz : Domuz");
        break;
        case 4:
        System.out.println("Çin Zodyağı burcunuz : Fare");
        break;
        case 5:
        System.out.println("Çin Zodyağı burcunuz : Öküz");
        break;
        case 6:
        System.out.println("Çin Zodyağı burcunuz : Kaplan");
        break;
        case 7:
        System.out.println("Çin Zodyağı burcunuz : Tavşan");
        break;
        case 8:
        System.out.println("Çin Zodyağı burcunuz : Ejderha");
        break;
        case 9:
        System.out.println("Çin Zodyağı burcunuz : Yılan");
        break;
        case 10:
        System.out.println("Çin Zodyağı burcunuz : At");
        break;
        case 11:
        System.out.println("Çin Zodyağı burcunuz : Koyun");
        break;    
        default:
            System.out.println("Yanlış giriş yaptınız");
            System.exit(0);
            break;
    }
}
}