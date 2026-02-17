public class OopsOptimized {
    public static void main(String[] args) {
        
        String space = " ";

        String line1 = String.join(space, " ", "***", "***", "*****", "****", " ");
        String line2 = String.join(space, "*", "*", "*", "*", "*", "*", "*", " ");
        String line3 = String.join(space, "*", "*", "*", "*", "*", "*", "*", " ");
        String line4 = String.join(space, "*", "*", "*", "*", "*****", "***", " ");
        String line5 = String.join(space, "*", "*", "*", "*", "*", "*", " ");
        String line6 = String.join(space, "*", "*", "*", "*", "*", "*", " ");
        String line7 = String.join(space, " ", "***", "***", "*", "****", " ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}