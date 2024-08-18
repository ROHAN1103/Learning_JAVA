public class lcm {
    public static void main(String args[]){
        int a=12,b=18;
        int ans=lcm(a,b);
        System.out.println("lcm="+ans);
    }
    static int lcm(int a,int b){
        return Math.abs(a*b)/gcd(a,b);
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
