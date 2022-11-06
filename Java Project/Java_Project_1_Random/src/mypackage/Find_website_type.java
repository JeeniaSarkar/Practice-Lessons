package mypackage;

import java.util.Scanner;

public class Find_website_type {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your website: ");
        String website=scan.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an organisational website. ");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commercial website. ");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website.");
        }
    }
}
