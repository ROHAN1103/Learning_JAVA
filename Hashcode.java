public class Hashcode {
    public static void main(String[] args) {
        Hash emp1 = new Hash(918, "Maria");
        Hash emp2 = new Hash(918, "Maria");
        int a = emp1.hashCode();
        int b = emp2.hashCode();
        System.out.println("hashcode of emp1 = " + a);
        System.out.println("hashcode of emp2 = " + b);
        System.out.println("Comparing objects emp1 and emp2 = " + emp1.equals(emp2));
    }
}
