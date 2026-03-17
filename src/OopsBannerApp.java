public class OopsBannerApp {
    public static void main(String[] args) throws Exception {
        String[] bannerLines = {
            String.join("", "  *****   ", "  *****   ", " ******   ", " ****** "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *      "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *      "),
            String.join("", " *     *  ", " *     *  ", " ******   ", " ****** "),
            String.join("", " *     *  ", " *     *  ", " *        ", "      * "),
            String.join("", " *     *  ", " *     *  ", " *        ", "      * "),
            String.join("", "  *****   ", "  *****   ", " *        ", " ****** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
