import java.util.Scanner;



public class work {
 
    public static void main(String[] arges) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("введите чило: ");
        float num = scan.nextInt();

        System.out.println("введите второе чило: ");
        float num1 = scan.nextInt();

        float result = num + num1;
        float result3 = num - num1;
        float result2 = num / num1;
        float result1 = num % num1;


        System.out.println("Сумма: " + result + "\n" +"Деление на остаток: "+ result1 + "\n"+"Деление: " + result2 + "\n"+ "Разница: " + result3 + "\n");
        
    }


}
