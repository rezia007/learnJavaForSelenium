public class ReverseInteger {
    public static void main(String[] args) {
        long num=123456;
        long rev=0;
        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse number is "+rev);
    }
}
