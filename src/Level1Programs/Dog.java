package Level1Programs;

public class Dog {
    String breed;
    int age;
    float weight;

    public Dog(int age,String breed,float weight){
        this.age=age;
        this.breed=breed;
        this.weight=weight;

    }
    int calculateAge(){
        int humanAge;
        if (age == 1) {
            humanAge = 15;
        } else if (age == 2) {
            humanAge = 24;
        } else {
            humanAge = 24 + (age - 2) * 4;
        }
        return humanAge;
    }
    void display(){
        System.out.println("Age of dog is: "+ calculateAge()+" in Human years");
        System.out.println("Breed of dog is:"+breed);
        System.out.println("weight of dog is:"+weight);
    }


    public static void main(String[] args) {
        Dog d = new Dog(2,"small", 2.23F);
        d.display();
        d.calculateAge();
    }
}
