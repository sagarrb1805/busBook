import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface BusInterface{
    public void showBuses();
    public void viewTicket();
    public void getDetails();
    public void getDate();
    Map<String, Integer> buses = new HashMap<>(){{
        put("1) Bus 1", 200);
        put("2) Bus 2", 250);
        put("3) Bus 3", 300);
    }};
}

class Bus implements BusInterface{
    String name;
    int age;
    String source;
    String destination;

    String selectedBus;
    Date travelDate;
    Scanner scn=new Scanner(System.in);

    public void showBuses(){
        System.out.println("Available buses");
        for(String bus: buses.keySet()){
            System.out.println(bus + " : "+buses.get(bus));
        }
    }
    public void viewTicket(){
        System.out.println(this.name+"\n"+ this.age+"\n"+this.source+"\n"+this.destination+"\n"+this.selectedBus+"\n"+this.travelDate);
    }
    public void getDetails(){
        System.out.println("enter your name: ");
        this.name = scn.nextLine();

        System.out.println("Enter your age: ");
        this.age = scn.nextInt();

        System.out.println("Enter your boarding point: ");
        this.source = scn.nextLine();

        System.out.println("Enter your destination: ");
        this.destination = scn.nextLine();
    }
    
    public void selectBus(){

        int choice = -1;
        boolean validChoice = false;
        while(!validChoice){
            showBuses();
        System.out.println("enter your choice ");
        choice = scn.nextInt();
        if (choice<1 || choice > buses.size()){
            System.out.println("enter a valid choice");
            selectBus();
        }else{
            validChoice = true;
            if(choice==1){
                this.selectedBus = "Bus 1";
            }else if (choice ==2 ){
                this.selectedBus = "Bus 2";
            }else if (choice == 3){
                this.selectedBus = "Bus 3";
            }
        }
        }
        
    }
    public void getDate(){

    }
}

public class BusBook {

    public static void main(String[] args) {

        int choice;
        do{
        Bus bus = new Bus();
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to Green Bus");
        bus.getDetails();
        bus.selectBus();
        bus.viewTicket();
        System.out.println("1) Book another ticket \n 2) Exit");
         choice = scn.nextInt();
        }
        while(choice == 1);
        
    }
    
}
