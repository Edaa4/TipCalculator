import java.util.Scanner;

public class TipCalculator {
    public static void main(String [] args){
        double temp = 0.0;

//this whole segment is used to get answers from the user and assign values to variables, so I can use them later in the program
        System.out.println("Hiya!! welcome to this rlly cool tip calculator!");
        Scanner scan = new Scanner (System.in);
        System.out.print("How many people are in your party?");
        int people = scan.nextInt();
        System.out.print("Whats the tip percentage? (number 0-100):");
        double percentage = scan.nextInt();
        double cost = 0.0;
        while (temp != -1) { //until the user inputs -1, the program will keep adding a cost to the overall cost
            System.out.print("Enter a cost in dollars and cents(type -1 to end):");
            temp = scan.nextDouble(); //using a temp variable, so I can add it to cost
            cost = cost + temp;
            if (temp == -1) {
                cost = cost + 1; //had to do this because the program was also adding the -1 to the cost, so I made it add 1 in return
                System.out.println("--------------------------------");
            }else{
                temp = 0.0; //resets temp
            }
        }
        scan.close();

// these are the print statements that the user will see at the end, and where the math and problem-solving happens ^.^
        System.out.println("Cost without tip: "+cost);
        System.out.println("Tip percentage: "+(int) percentage);
        double tip = (percentage/100)* cost; //using the percentage equation to get how much my tip would be
        System.out.println("Total tip: "+tip);
        System.out.println("Total bill with tip: "+(cost+tip));
        System.out.println("Per person cost before tip: "+(cost/people));
        System.out.println("Tip per person: "+(tip/people));
        double total = cost + tip;
        System.out.println("Total cost per person: "+(total/people));
    }
}

