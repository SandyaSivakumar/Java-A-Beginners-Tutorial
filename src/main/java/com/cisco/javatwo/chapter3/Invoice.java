package com.cisco.javatwo.chapter3;

public class Invoice {
    private static String partNumber;
    private static String partDescription;
    private static int quantity;
    private static double price;

    public static String getPartNumber() {

        return partNumber;
    }

    public static void setPartNumber(String partNumber) {

        Invoice.partNumber = partNumber;
    }

    public static String getPartDescription() {

        return partDescription;
    }

    public static void setPartDescription(String partDescription) {

        Invoice.partDescription = partDescription;
    }

    public static int getQuantity() {

        return quantity;
    }

    public static void setQuantity(int quantity) {

        Invoice.quantity = quantity;
    }

    public static double getPrice() {

        return price;
    }

    public static void setPrice(int price) {

        Invoice.price = price;
    }

    public double getInvoiceAmount(){
        if(Invoice.price<=0){
            Invoice.price=0.0;
        }
        else if(Invoice.quantity<=0){
            Invoice.quantity=0;
        }
        else{
            return (Invoice.price*Invoice.quantity);
        }
        return 0.0;
    }




}
