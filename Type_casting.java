import java.text.DecimalFormat;
import java.util.*;
public class Type_casting {
    public static void main(String args[]){
        //implict casting
        byte b=10;//byte can be casted to all upper forms i.e, [short,int,long,float,double]
        short s=b;//byte to short
        int i=s;//short to int
        long l=i;//int to long
        float f=l;//long to float
        double d=f;//double to float
        char c='A';
        int i1=c;//char is converted into int further it can be converted into long,float,double.
        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+i1);
        
        //explict casting
        double d1=65;
        float f1=(float)d1;
        long l1=(long)f1;
        int i2=(int)l1;
        short s1=(short)i2;
        char c1=(char)i2;
        byte b1=(byte)s1;
        System.out.println(d1+" "+f1+" "+l1+" "+i2+" "+s1+" "+b1+" "+c1);

        //String conversion
        String x=String.valueOf(b);//String.valueOf converts all other type to string
        byte b2=Byte.parseByte(x);//String to byte
        String x1=Byte.toString(b);//Byte to string
        long l2=Long.parseLong(x);//string to long
        String x2=Long.toString(l);//long to string
        int i3=Integer.parseInt(x);//string to integer
        String x3=Integer.toString(i2);//integer to string 
        float f2=Float.parseFloat(x);//string to float
        String x4=Float.toString(f);//float to string
        double d2=Double.parseDouble(x);//string to double
        String x5=Double.toString(d);//double to string
        System.out.println(x+" "+b2+" "+x1+" "+l2+" "+x2+" "+i3+" "+x3+" "+f2+" "+x4+" "+x5+" "+d2);

        //To binary conversion
        String bin=Integer.toBinaryString(10);//int to binary
        int i4=Integer.parseInt(bin,2);//binary to int
        System.out.println(bin+" "+i4);

        //To octal conversion
        String oct=Integer.toOctalString(10);//int to octal
        int i5=Integer.parseInt(oct,8);//octal to int
        System.out.println(oct+" "+i5);

        //To Hexadecimal conversion
        String hex=Integer.toHexString(10);//int to octal
        int i6=Integer.parseInt(hex,16);//Hexadecimal to int
        System.out.println(hex+" "+i6);

        //Round-Off
        double d3=8.3333;
        System.out.printf("%.2f\n",d3);
        String x6=String.format("%.2f", d3);
        DecimalFormat df=new DecimalFormat("#.000");
        String x7=df.format(d3);
        System.out.println(x6+" "+x7);

    }
}
