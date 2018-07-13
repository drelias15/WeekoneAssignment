import java.util.Scanner;
import java.util.Random;

public class GroceryApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        String itemName01, itemName02;
        double itemPrice01, itemPrice02;
        int itemQuantity01, itemQuantity02;
        double itemCost01, itemCost02, totalAmount;
        int randomNumber = 1 + rand.nextInt(10);

        System.out.println("Enter name of item 1 ");
        itemName01 = keyboard.next();

        System.out.println("Enter name of item 2 ");
        itemName02 = keyboard.next();

        System.out.println("Enter price of item 1 ");
        itemPrice01 = keyboard.nextDouble();

        System.out.println("Enter price of item 2 ");
        itemPrice02 = keyboard.nextDouble();

        System.out.println("Enter Quantity of item 1 ");
        itemQuantity01 = keyboard.nextInt();

        System.out.println("Enter Quantity of item 2 ");
        itemQuantity02 = keyboard.nextInt();

        itemCost01 = itemPrice01*itemQuantity01;
        itemCost02 = itemPrice02*itemQuantity02;
        totalAmount = itemCost01 + itemCost02;

        System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Cost" + "\n"
                                + itemName01 + "\t\t" + "$"+ itemPrice01 + "\t" + itemQuantity01 + "\t\t\t" + "$" + itemCost01 + "\n"
                                + itemName02 + "\t\t" + "$" + itemPrice02 + "\t\t" + itemQuantity02 + "\t\t\t" + "$" + itemCost02 + "\n\n"
                                + "Total Purchase Amount = " + "$" + totalAmount + "(" + randomNumber + ")" + "\n\n"
                );

        if (totalAmount <=20){
            System.out.println("Thank you for shopping in my market!");
        }
        else {
            System.out.println("You spent too much today...");
        }


        keyboard.close();



    }
}
