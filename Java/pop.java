import java.util.Scanner;

public class pop {
    public static void main(String[] arges) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scan.nextLine();
        
        System.out.println("Введите пароль: ");
        String pass = scan.nextLine();
        
        if(role.equals("admin") && pass.equals("0000")) {
            System.out.println("Все пользователи: ");

        } else {
            System.out.println("Привет напиши свое имя:");
        }
    
    }


}
