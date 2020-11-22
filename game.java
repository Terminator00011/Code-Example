import java.util.Scanner;
public class game {
    public static void main(String[] args){
        int option1 = 1;
        int option2 = 2;
        int shaq = 3;
        int bobobno = 4;
        int pop = 5;
        int nah = 6;
        boolean test = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("You wake up in a strip club. What do you?: Option 1: Marry a hoe: Option 2: Shoot up a hoe");
        int action = scan.nextInt();

        if(action == option1){
            System.out.println("Which hoe? Option 3: shaq: Option 4: BOBOBNO");
            int hoe = scan.nextInt();
            if(hoe == shaq){
                System.out.println("you marry " + shaq);
            
            }
            else if(hoe == bobobno){
                System.out.println("You marry " + bobobno);
            }
            else{
                System.out.println("That aint no hoe");
            }
        }
        else if(action == option2){
            System.out.println("You gon shoot bitch? Option 1: Yuh imma shoot a bitch: Option 2: Nah imma shoot a bitch");
            int shoot = scan.nextInt();
            if(shoot == pop){
                System.out.println("OH SHOOT you shot a bitch hol up RING DINGINDG IDNGDINGDINDNIGIDNGIDGDGIN");
            }
            else if(shoot == nah){
                System.out.println("Daym you aint gon shoto ok");
            }
            else{
                System.out.println("What the fuck you shootin?");
            }
        }
        else{
            System.out.println("Bitch you stoopid as hell jesus fuck");
        }
    }
}
