public class RemoveJunk {
    public static void main(String[] args) {
        String s="@@@###Java***007";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
