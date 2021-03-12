public class Test {
    public static void main(String[] args) {

        String friend = "12456755677";
        char[] chars = friend.toCharArray();
        byte[] bytes = friend.getBytes();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
