package BusBooking;
import java.util.Date;
import java.util.Scanner;
interface BusInterface{
    public void showBuses();
    public void viewTicket();
    public void getSourceDest();
    public void getDate();
    String[] buseList={"Bus 1","Bus 2","Bus 3"};
    int[] prices={200,200,200};
    
}
class Buses implements BusInterface{
    Scanner scn=new Scanner(System.in);
    String name;
    String source;
    String dest;
    Date date;
    String selectedBus;
    public void showBuses(){
        System.out.println("List of buses available: ");
        for(int i=0;i<busesList.length;i++){
            System.out.println((i+1)+")"+busesList[i]+":Rs "+prices[i]);
        }

    }   
    public void viewTicket(){
        System.out.println();
        System.out.println("Name : "+this.name);
        System.out.println("Boarding point : "+this.source);
        System.out.println("Destination : "+this.dest);
        System.out.println("Date of travel: "+this.date);
        System.out.println("Bus Name : "+this.selectedBus);
        System.out.println();
    }
    public void getSourceDest(){
        System.out.println("Enter Source");
                this.source=scn.next();
                System.out.println("Enter destination");
                this.dest=scn.next();
    }
    public void getDate(){
        System.out.println("Enter date for travel (dd/mm/yyyy)");
                
                try{
                    this.date=new Date(scn.next());
                }
                catch(Exception e){
                    System.out.println("Enter date in proper format");
                    return;
                }
    }
} 

public class Mainn extends Buses{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int ch=2;
        Buses user1=new Buses();


        do{     

                System.out.println("Bus Booking System");
                System.out.println("Enter your name");
                user1.name=scn.next();
                user1.getSourceDest();
                user1.getDate();
                user1.showBuses();
                System.out.println("Enter Choice");
                int choice=scn.nextInt();
                user1.selectedBus=user1.buseList[choice-1];
                user1.viewTicket();
                System.out.println("1)Book another ticket");
                System.out.println("2)Exit");
                System.out.println("Enter Choice");
                ch=scn.nextInt();
        }
        while(ch==1);
        scn.close();
    }
}