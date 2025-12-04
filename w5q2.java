public class w5q2{
    
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i+= 2) {      
            System.out.println(i);
        }
        */
        
        int i=2;
         while (i<=10){
            System.out.println(i);
            
            i+=2;
        }
        
        
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 10);
    }
    
}
