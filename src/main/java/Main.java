

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101", "101"));
        System.out.println(bins.mult("11", "10101"));
    }
}

class BinOps {
    public String sum(String a, String b) {
        int tmp = toDecim(a) + toDecim(b);
        return toBinar(tmp);
    }

    public String mult(String a, String b) {
        int tmp = toDecim(a) * toDecim(b);
        return toBinar(tmp);
    }

    private int toDecim(String binStr) {
        return Integer.parseInt(binStr, 2);
    }

    private String toBinar(int decInt) {
        return Integer.toBinaryString(decInt);
    }

}
