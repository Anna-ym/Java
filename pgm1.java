
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class pgm1 {
        int pcode;
        String pname;
        int price;
    pgm1(){
        pcode=0;
        pname="not set";
        price=0;
    }
    pgm1(int pcode,String pname,int price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int pcode;
        String pname;
        int price;
        System.out.println("Enter the product details 1: ");
        System.out.println("Enter the pcode: ");
        pcode=Integer.parseInt(br.readLine());
        System.out.println("Enter the pname: ");
        pname=br.readLine();
        System.out.println("Enter the price: ");
        price=Integer.parseInt(br.readLine());
        pgm1 p1=new pgm1(pcode,pname,price);

        System.out.println("Enter the product details 2: ");
        System.out.println("Enter the pcode: ");
        pcode=Integer.parseInt(br.readLine());
        System.out.println("Enter the pname: ");
        pname=br.readLine();
        System.out.println("Enter the price: ");
        price=Integer.parseInt(br.readLine());
        pgm1 p2=new pgm1(pcode,pname,price);

        System.out.println("Enter the product details 3: ");
        System.out.println("Enter the pcode: ");
        pcode=Integer.parseInt(br.readLine());
        System.out.println("Enter the pname: ");
        pname=br.readLine();
        System.out.println("Enter the price: ");
        price=Integer.parseInt(br.readLine());
        pgm1 p3=new pgm1(pcode,pname,price);
        
        pgm1 less=p1;
        if(p2.price < less.price){
            less=p2;
        }
        if(p3.price<less.price){
            less=p3;
        }
        System.out.println("Lowest price: "+less.pcode+" "+less.pname+" "+less.price);
        
    }

}