import java.util.Scanner;

public class Massive {

    /**
     * @param arges
     */
    public static void main(String[] arges) {
        //масив
        /* 
        int[] nums = new int[5]; 
        nums[0] = 45;
        nums[1] = 32;
        nums[2] = 40;
        nums[3] = 55;
        nums[4] = 60;
    

        System.out.println(nums[3]);
        
        float[] pop = new float[] {5.0f, 4.0f, 2.0f, 44.0f, 10.0f,55.0f};
        System.out.println("element: " + pop[3]);
        
    
        for (int i = 0;  i < pop.length; i++) {

            System.out.println(pop[i]);
        }
                                        
        int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){

            System.out.print("You Elements: ");
            int value = scan.nextInt();
            arr[i] = value;


        
        }
        System.out.println(arr[3]);
    
        int min = arr[0];
        for(int i=0; i < arr.length;i++){
            if(arr[i]< min)
                min = arr[i];    

        }
        System.out.println(min);*/

    
    
        char[][] syms = new char[2][2];
        syms[0][1] = 't';
        System.out.println(syms[0][1]);
    
    
        byte[][] nums = new byte[][]{
                {5,6},
                {7,3},
                {2,0},

        };
    
        nums[1][1] = 54;
        System.out.println(nums[1][1]);
    }

}