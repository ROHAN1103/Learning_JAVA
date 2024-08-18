public class conversion {
    public static void main(String args[]){
        //String to int;
        String n="200";
        int x=Integer.parseInt(n);
        x=Integer.valueOf(n);
        System.out.println(x);
        //int to string
        String s=String.valueOf(x);
        s=Integer.toString(x);
        //string to long
        long l=Long.valueOf(s);
        l=Long.parseLong(s);
        //long to string
        String st=String.valueOf(l);
        st=Long.toString(l);
        //string to float
        float f=Float.parseFloat(st);
        f=Float.valueOf(st);
        //float to string
        String str=String.valueOf(f);
        str=Float.toString(f);
    }
    
}
