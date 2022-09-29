import java.util.Scanner;

public class TipCalculator {
    public static void main(String [] args){
        double temp = 0.0;

        System.out.println("Hiya!! welcome to this rlly cool tip calculator!");
        Scanner scan = new Scanner (System.in);
        System.out.print("How many people are in your party?");
        int people = scan.nextInt();
        System.out.print("Whats the tip percentage? (number 0-100):");
        int percentage = scan.nextInt();
        double cost = 0.0;
        while (temp != -1) {
            System.out.print("Enter a cost in dollars and cents(type -1 to end):");
            temp = scan.nextDouble();
            cost = cost + temp;
            if (temp == -1) {
                cost = cost + 1;
                System.out.println("--------------------------------");
            }else{
                temp = 0.0;
            }
        }
        scan.close();

        System.out.println("Cost without tip: "+cost);
        System.out.println("Tip percentage: "+percentage);
        double tip = percentage/cost * 100;
        System.out.println("Total tip: "+tip);
        System.out.println("Total bill with tip: "+(cost+tip));
        System.out.println("Per person cost before tip: "+(cost/people));
        System.out.println("Tip per person: "+(tip/people));
        double total = cost + tip;
        System.out.println("Total cost per person: "+(total/people));
    }
}

