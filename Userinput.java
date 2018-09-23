

/*Write a Java program that will ask the user to enter the price and quantity of an item. The program should perform the following calculations:

Subtotal:
subtotal = price * quantity.

Sales Tax Amount:
Assume that sales tax rate is 7.5%.
sales tax amount = subtotal * sales tax rate / 100.

Total Amount:
total amount = subtotal + sales tax amount

The program should display the price of the item, quantity, subtotal, sales tax
amount, and total amount.*/

import java.util.Scanner;
class Userinput
{
  public static void main(String[]args)
  {
    Scanner ip =new Scanner(System.in);
    double price,quantity,subtotal, SalesTax_Amount, salestax_rate, total_amount;
    System.out.println("Enter the price");
    price= ip.nextDouble();
    System.out.println("Enter the quantity");
    quantity= ip.nextDouble();
    subtotal = (price*quantity);
    System.out.println("The subtotal is: " + subtotal);
    salestax_rate= 7.5;
    SalesTax_Amount= subtotal*(salestax_rate/100);
    System.out.println("The sales tax amount is: " + SalesTax_Amount);
    total_amount= subtotal + SalesTax_Amount;
    System.out.println("The total amount is: " + total_amount); 
  }
}