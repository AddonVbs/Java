import java.util.Scanner;

public class Swict_case {
    public static void main(String[] arges) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("write 1 num");
        int num1 = scan.nextInt();

        
        switch(num1){

            case 7:
                System.out.println("Семь");
                break;

            case 3:
                System.out.println("Три");
                break;

            default:
                System.out.println("Что-то другое");
        
            }
        }
    
    }
