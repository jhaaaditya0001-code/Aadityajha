public class Tuto3{
    int age;//instance variable 
    static int qty;//static variable 
    
    public static void main(String[]arg){
        int i=10;
        System.out.println(i);
        
        //implict typecasting 
        
        double db=i;
        System.out.println(db);
        
        long ong=i;
        System.out.println(ong);
        
        byte num=(byte) i;
        System.out.println(num);
        
    
        short num2= (short) i;
        System.out.println(num2);
        
        //exceptions in arithematic
        
        byte bt=10;
        byte btr= 11;
        
        byte sum= (byte)(bt+btr);
        
        short a=20;
        short b=40;
        
        short sum2=(short) (a+b);
        
        char c=10;
        char d=20;
        
        char sum3 =(char) (c+d);
        

        
        // Max,Min,Size and bytes
        
        
        System.out.println(Byte.MAX_VALUE);//return maximum value 
        System.out.println(Byte.MIN_VALUE);//return minimum value
        System.out.println(Byte.SIZE);//return in bits
        System.out.println(Byte.BYTES);//return in bytes
        
        //Escape Sequence'
        
        System.out.println("Hello/nWorld");// new line
        System.out.println("Hamro\tNepal");//tab
        System.out.println("She said\"Hi\" ");//Double quotation
        
        //Unicode escape sequence 
        
        System.out.println("\u2764");
        
        
        
        

    
        
    }
}