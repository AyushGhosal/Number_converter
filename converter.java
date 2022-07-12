import java.util.*;
class number
{
    void dec_bin(int a) //1
    {
        int n= Integer.parseInt(Integer.toBinaryString(a));
        System.out.println("BINARY EQUIVALENT = "+n);
    }
    void dec_oct(int a) //2
    {
        int n=Integer.parseInt(Integer.toOctalString(a));
        System.out.println("OCTAL EQUIVALENT = "+n);
    }
    void dec_hex(int a) //3
    {
        String n= Integer.toHexString(a);
        String d=n.toUpperCase();
        System.out.println("HEXA-DECIMAL EQUIVALENT = "+n);
    }
    void bin_dec(int a) //4
    {
        int n=Integer.parseInt(String.valueOf(a),2);
        System.out.println("DECIMAL EQUIVALENT ="+n);
    }
    void bin_oct(int a) //5
    {
        int d=Integer.parseInt(String.valueOf(a),2);
        int n=Integer.parseInt(Integer.toOctalString(d));
        System.out.println("OCTAL EQUIVALENT ="+n);
    }
    void bin_hex(int a) //6
    {
        int d=Integer.parseInt(String.valueOf(a),2);
        String b= Integer.toHexString(d);
        String n=b.toUpperCase();
        System.out.println("HEXA-DECIMAL EQUIVALENT ="+n);
    }
    void oct_dec(int a) //7
    {
        int n=Integer.parseInt(String.valueOf(a),8);
        System.out.println("DECIMAL EQIVALENT ="+n);
    }
    void oct_bin(int a) //8
    {
        int d=Integer.parseInt(String.valueOf(a),8);
        int n=Integer.parseInt(Integer.toBinaryString(d));
        System.out.println("BINARY EQUIVALENT ="+n);
    }
    void oct_hex(int a) //9
    {
        int d=Integer.parseInt(String.valueOf(a),8);
        String b= Integer.toHexString(d);
        String n=b.toUpperCase();
        System.out.println("HEXA-DECIMAL EQUIVALENT ="+n);
    }
    void hex_dec(String a) //10
    {

        int n=Integer.parseInt(a,16);
        System.out.println("DECIMAL EQUIVALENT ="+n);
    }
    void hex_bin(String a) //11
    {

        int d=Integer.parseInt(a,16);
        int n= Integer.parseInt(String.valueOf(d), 0b10);
        System.out.println("BINARY EQUIVALENT ="+n);
    }
    void hex_oct(String a) //12
    {
        int d=Integer.parseInt(a,16);
        int n=Integer.parseInt(Integer.toOctalString(d));
        System.out.println("OCTAL EQUIVALENT = "+n);
    }
}
public class converter {
    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);
        number obj = new number();
        System.out.println("*************** NUMBER CONVERTOR ***************");
        System.out.println("****************ENTER YOUR CHOICE*************");
        System.out.println("1. DECIMAL TO BINARY\n 2.DECIMAL TO OCTAL \n 3. DECIMAL TO HEXA-DECIMAL \n 4.BINARY TO DECIMAL\n 5.BINARY TO OCTAL \n 6.BINARY TO HEXA-DECIMAL \n 7.OCTAL TO DECIMAL \n 8.OCTAL TO BINARY \n 9. OCTAL TO HEXA-DECIMAL \n 10.HEXA-DECIMAL TO DECIMAL \n 11.HEXA-DECIMAL TO BINARY \n 12.HEXA-DECIMAL TO OCTAL");
        System.out.println("************ PRESS THE NUMBER ****************");
        int choice = ab.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER DECIMAL NUMBER : ");
                    int n1 = ab.nextInt();
                    obj.dec_bin(n1);
                    break;
                case 2:
                    System.out.println("ENTER DECIMAL NUMBER : ");
                    int n2 = ab.nextInt();
                    obj.dec_oct(n2);
                    break;
                case 3:
                    System.out.println("ENTER DECIMAL  NUMBER : ");
                    int n3 = ab.nextInt();
                    obj.dec_hex(n3);
                    break;
                case 4:
                    System.out.println("ENTER BINARY  NUMBER : ");
                    int n4 = ab.nextInt();
                    obj.bin_dec(n4);
                    break;
                case 5:
                    System.out.println("ENTER BINARY  NUMBER : ");
                    int n5 = ab.nextInt();
                    obj.bin_oct(n5);
                    break;
                case 6:
                    System.out.println("ENTER BINARY  NUMBER : ");
                    int n6 = ab.nextInt();
                    obj.bin_hex(n6);
                    break;
                case 7:
                    System.out.println("ENTER OCTAL NUMBER : ");
                    int n7 = ab.nextInt();
                    obj.oct_dec(n7);
                    break;
                case 8:
                    System.out.println("ENTER OCTAL NUMBER : ");
                    int n8 = ab.nextInt();
                    obj.oct_bin(n8);
                    break;
                case 9:
                    System.out.println("ENTER OCTAL NUMBER : ");
                    int n9 = ab.nextInt();
                    obj.oct_hex(n9);
                    break;
                case 10:
                    System.out.println("ENTER HEXA-DECIMAL  NUMBER : ");
                    String n10 = ab.next();
                    obj.hex_dec(n10);
                    break;
                case 11:
                    System.out.println("ENTER HEXA-DECIMAL  NUMBER : ");
                    String n11 = ab.nextLine();
                    obj.hex_bin(n11);
                    break;
                case 12:
                    System.out.println("ENTER HEXA-DECIMAL NUMBER : ");
                    String n12 = ab.nextLine();
                    obj.hex_oct(n12);
                    break;
                default:
                    System.out.println("WRONG CHOICE !!! PLEASE CHECK AND TRY AGAIN.......");
            }
        }
    }


