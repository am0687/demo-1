public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all 7 lines of the OOPS banner using String.join()
        String[] banner = {

            String.join("  ",
                "  *****  ",   // O
                "  *****  ",   // O
                " ******  ",   // P
                "  *****  "    // S
            ),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** "
            ),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **      "
            ),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                "  *****  "
            ),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **      ",
                "      ** "
            ),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **      ",
                " **   ** "
            ),

            String.join("  ",
                "  *****  ",
                "  *****  ",
                " **      ",
                "  *****  "
            )
        };

        // Print banner using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
