package com.cisco.javatwo.chapter3;

public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        Invoice.setPartNumber("12345");
        Invoice.setPartDescription("Dining Table - 6 seater set");
        Invoice.setPrice(18000);
        Invoice.setQuantity(2);

        System.out.println("Invoice Amount: "+invoice.getInvoiceAmount());


    }
}
