/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Hesham
 */
public class InvoiceLines {
    
 private String itemName;
    private double itemPrice;
    private int count;
    private InvoiceHeader invoice;

    public InvoiceLines() {
    }

    public InvoiceLines(String item, double price, int count, InvoiceHeader invoice) {
        this.itemName = item;
        this.itemPrice = price;
        this.count = count;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return itemPrice * count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return itemName;
    }

    public void setItem(String item) {
        this.itemName = item;
    }

    public double getPrice() {
        return itemPrice;
    }

    public void setPrice(double price) {
        this.itemPrice = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + itemName + ", price=" + itemPrice + ", count=" + count + '}';
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getNum() + "," + itemName + "," + itemPrice + "," + count;
    }
    
}   
    
    
    
    
    
    

