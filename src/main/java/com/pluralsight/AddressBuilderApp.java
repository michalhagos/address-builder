package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Provide the following information");
// import a scanner to get the input and save them in variables.
        System.out.println("Full name: ");
        String fullName = theScanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = theScanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = theScanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = theScanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = theScanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingStreet = theScanner.nextLine();

        System.out.println("Shipping City:  ");
        String shippingCity = theScanner.nextLine();

        System.out.println("Shipping State:  ");
        String shippingState = theScanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = theScanner.nextLine();

// create a new Billing Address string builder  and append all the address feilds that need to be added
        StringBuilder billingAddress = new StringBuilder();

        billingAddress.append(billingStreet);

        billingAddress.append(" ");

        billingAddress.append(billingCity);

        billingAddress.append(", ");

        billingAddress.append(billingState);

        billingAddress.append(" ");

        billingAddress.append(billingZip);
// create a new shipping Address string builder  and append all the address fields that need to be added
        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet);

        shippingAddress.append(" ");

        shippingAddress.append(shippingCity);

        shippingAddress.append(", ");

        shippingAddress.append(shippingState);

        shippingAddress.append(" ");

        shippingAddress.append(shippingZip);

// print full name first
        System.out.println(fullName);

// print out the appended strings
        String billingAddress1 = billingAddress.toString();
        System.out.println(" Billing Address : " + billingAddress1);

        String shippingAddress1 = shippingAddress.toString();
        System.out.println(" Shipping Address : " + shippingAddress1);


    }
}
