import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {

        int start= 31,end=89,tries=0,maxTriesAllowed=200;
        System.out.println("Please enter the value between "+ start + " and  "+ end);
        String userInput = System.console().readLine();
        System.out.println("You have the entered the value " +userInput );

        while(tries<maxTriesAllowed){
            if(Integer.parseInt(userInput) < start || Integer.parseInt(userInput) > end ){
           
                System.out.println("Please enter the value within the range");
                }else{
                    ranDomNUmberGenerator(11,22);
                    if(Integer.parseInt(userInput) == ranDomNUmberGenerator(start,end) ){
                        System.out.print("both number is matched");
                        break;
            
                    }else {
                        tries++;
                        System.out.println("You have "+ (maxTriesAllowed-tries)+" tries left");
                        
                    }
                }
        }

        if(maxTriesAllowed-tries<=0){
            System.out.println("Btter luck next time!!!");

        }

        

        

       
  
        // Byte val1 = (byte)2030;
        // System.out.println(val1);
        // String binaryFormat = Integer.toBinaryString(val1);
        // System.out.println((byte)2030);
        // System.out.println(binaryFormat.substring(24));

        // // var maxSizeOfByte = Byte.MAX_VALUE;
        // Byte starVal = 0;
        // for(int i=0;i<1000;i++){
        //     starVal= (byte)(starVal+1);
        //     System.out.println(starVal);
        // }
        // // System.out.println((byte)2030);
    }

        // System.out.println(x + "=== Welcome to a Guessing number Game ====");
        public static int ranDomNUmberGenerator(int startRange, int endRange){
               var randomNumber= (int) ((Math.random()*(endRange-startRange)+startRange));

               return randomNumber;
        }
   
}
