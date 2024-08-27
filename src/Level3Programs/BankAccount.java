package Level3Programs;

public class BankAccount {
    static int data=30;
    static class Interest{
        void show(){
            System.out.println("Data "+data);
        }
    }

    public static void main(String[] args) {
        BankAccount.Interest obj = new BankAccount.Interest();
        obj.show();
    }
}
