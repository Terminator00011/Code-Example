import java.util.Scanner;
public class helloWorld{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = x*y;
        int v = x/y;
        int b = x+y;

        int item = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        if(name.equals("Jack")){
            System.out.println("Java God");
        }
        else if(name.equals("Nick")){
            System.out.println("He kinda hot");
        }
        else{
            System.out.println("YOu poopy");
        }

        if(x == y){

        }
        else if(x != y){

        }
        
    }

}