public class ReverseAString {
    public static void main(String[] args) {
    String hello = "Hello World";
    String reversedString = "";

    for(int i = hello.length() - 1; i >= 0; i--){
    	reversedString += hello.charAt(i);
      System.out.print("REVERSED STRING AT EACH STEP: " + reversedString + "\n");
    }

    System.out.print(reversedString);
    }
}
