
public class Sicl {

    public static void main(String[] arges) {
        
        //for(float i=100; i>0; i-=2){
          //  System.out.println("Element: " + i);

        //}
        
        //int i = 1;
        //while (i < 10) {
        //    System.out.println("Elements: " +i);
       //     i++;
        
        //byte i =1;
        //do{
        //    System.out.println("elements: " +i);
        //    i++;
        //}while(i < 100);
    

        for (int i = 5; i <25; i+=2){
            if(i % 3 == 0)
                continue;
            
            if (i >= 15)
                break;
                
            
            System.out.println("element: " +i);

        }
        
    
        }
    
    }
