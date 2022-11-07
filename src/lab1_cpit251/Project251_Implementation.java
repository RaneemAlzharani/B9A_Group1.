
package lab1_cpit251;

import java.util.ArrayList;
import java.util.Scanner;

public class Project251_Implementation {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        //Array list to stored 3 type of supplies in the system
        ArrayList<Supplies>table = new ArrayList<Supplies>();
        table.add(new Supplies("Round table for 6",100,1,0));
        table.add(new Supplies("Round table for 4",100,1,0));
        ArrayList<Supplies>chair = new ArrayList<Supplies>();
        chair.add(new Supplies("White Chair",40,1,0));
        chair.add(new Supplies("Red Chair",40,1,0));
        chair.add(new Supplies("Wooden Chair",40,1,0));
        ArrayList<Supplies>speaker = new ArrayList<Supplies>();
        speaker.add(new Supplies("Big Speaker",120,1,0));
        speaker.add(new Supplies("Small Speaker",120,1,0));
       boolean restart = true;
       int ch=0;
       //while loop to restart the system
       while(restart){
           System.out.print("4-Functional Requirement\n 1. Rent product \n 2. Update supplies"
                   + "\n 3.             \n 4.        \n Enter number (Enter 0 to exit): ");
              ch=scanner.nextInt();
              if(ch==1){
              }else if(ch==2){
              }else if(ch==3){
                  
              }else if(ch==4){
                  
              }else{
                  restart=false;
              }
           
       }
       
       
       
    }


}
