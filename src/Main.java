import java.util.Scanner;
public class Main {
    static void desen(int num){
        System.out.print(num + " ");
        if(num<=0){
            return;
        }
        desen(num-5);
        System.out.print(num+ " ");
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num;

        System.out.println("Sayıyı giriniz:");
        num = input.nextInt();
        desen(num);
    }
}