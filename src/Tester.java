import java.util.concurrent.TimeUnit;

public class Tester {

    public static void main(String[] args){

         while( 2 < 3){
             System.out.println("I'm in loop!");

             try{
                 TimeUnit.SECONDS.sleep(1);  //Sleep meth. call
             }catch (InterruptedException e) { } // End
         }

    }
}
