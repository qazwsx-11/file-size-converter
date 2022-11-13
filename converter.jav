import java.util.*;
import java.io.*;
import java.text.DecimalFormat;


public class converter {
  public static void main(String[] args) {
  
      // setting
    DecimalFormat df = new DecimalFormat("###.#########");
    Scanner sc = new Scanner (System.in);

/* */

    System.out.println("What is your file size");
    int num = sc.nextInt();
    System.out.println("What unit is it in? ");
    System.out.print("(Type 1 for Bit, type 2 for Byte, type 3 for KB, type 4 for MB, type 5 for GB)");
    int unit = sc.nextInt();

    if (unit == 1) {

        double Bit = num;
        double Byte = num/8;
        double KB = num/8000;
        double MB = num/8000000;
        double GB = MB/1000;

        System.out.println(Bit + " Bits");
        System.out.println(Byte + " Bytes");
        System.out.println(KB + " Kilobytes");
        System.out.println(MB + " Megabytes");
        System.out.println(GB + " Gigabytes");

    }

    if (unit == 2) {

      double Bit = num*8;
      double Byte = num;
      double KB = num/1000;
      double MB = num/1000000;
      double GB = MB/1000;

      System.out.println(Bit + " Bits");
      System.out.println(Byte + " Bytes");
      System.out.println(KB + " Kilobytes");
      System.out.println(MB + " Megabytes");
      System.out.println(GB + " Gigabytes");

  }

  if (unit == 3) {

    double Bit = num*8000;
    double Byte = num*1000;
    double KB = num;
    double MB = num/1000;
    double GB = MB/1000;

    System.out.println(Bit + " Bits");
    System.out.println(Byte + " Bytes");
    System.out.println(KB + " Kilobytes");
    System.out.println(MB + " Megabytes");
    System.out.println(GB + " Gigabytes");

}

if (unit == 4) {

  double Bit = num*800*10000;
  double Byte = num*10000*100;
  double KB = num*1000;
  double MB = num;
  double GB = num/1000;

  System.out.println(Bit + " Bits");
  System.out.println(Byte + " Bytes");
  System.out.println(KB + " Kilobytes");
  System.out.println(MB + " Megabytes");
  System.out.println(GB + " Gigabytes");

}

if (unit == 5) {

  double Bit = num*800*1000*10000;
  double Byte = num*100*1000*10000;
  double KB = num*1000*1000;
  double MB = num*1000;
  double GB = num;

  System.out.println(Bit + " Bits");
  System.out.println(Byte + " Bytes");
  System.out.println(KB + " Kilobytes");
  System.out.println(MB + " Megabytes");
  System.out.println(GB + " Gigabytes");

}
else {
  System.exit(1);

}

      
  }

}