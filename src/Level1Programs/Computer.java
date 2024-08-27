package Level1Programs;

import java.util.Objects;

public class Computer {
    String processor;
    int ram,storage;

    public Computer(String processor,int ram,int storage){
        this.processor=processor;
        this.ram=ram;
        this.storage=storage;
    }
    double calcualtePrice(){
        double price=0;
        if(Objects.equals(processor, "Basic Processor") && ram==4 && storage==256){
            price=40000;
        } else if (Objects.equals(processor,"Mid Range")&& ram==8 && storage==512) {
            price=70000;
        } else if (Objects.equals(processor,"High Range")&& ram==16 && storage==1000) {
            price = 120000;
        }
        else{
            price=250000;
        }
        return price;
    }

    void display(){
        System.out.println("Processor Type:"+processor);
        System.out.println("Ram :"+ram+" GB");
        System.out.println("Storage :"+storage);
        System.out.println("Price: "+calcualtePrice());
    }


    public static void main(String[] args) {
        Computer c = new Computer("High Range",16,1000);
        c.calcualtePrice();
        c.display();
    }
}
