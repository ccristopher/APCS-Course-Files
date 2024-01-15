public class testing {
    public static void main(String[] args) {
         int idLength = 9;
         String deviceID = "abx123xy";
         int msgLength = 21;
         String textMsg = "Today is a great day!";

        if (idLength == deviceID.length()) {
            if (msgLength == textMsg.length()) {
                System.out.println(true);
            }
        }
        System.out.println(false);

        int w = 1;
        for (int i = 0; i < textMsg.length(); i++) {
            if (textMsg.charAt(i) == ' ') {
                w++;
            }
        }
        System.out.println(w);
    }
}
