/**
 * OOPSBannerApp
 * 
 * UC3: Render "OOPS" banner using String.join()
 * 
 * @author Akshay
 * @version 1.1
 */
public class OOPSBanner{

    public static void main(String[] args) {

        // Each row of the banner (7 rows total)
        String row1 = String.join(" ",
                " ***** ", " ***** ", " ******", " ******");
        
        String row2 = String.join(" ",
                "*     *", "*     *", "*     *", "*     *");
        
        String row3 = String.join(" ",
                "*     *", "*     *", "*     *", "*");
        
        String row4 = String.join(" ",
                "*     *", "*     *", "****** ", " ******");
        
        String row5 = String.join(" ",
                "*     *", "*     *", "*      ", "      *");
        
        String row6 = String.join(" ",
                "*     *", "*     *", "*      ", "*     *");
        
        String row7 = String.join(" ",
                " ***** ", " ***** ", "*      ", " ******");

        // Print banner
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
        System.out.println(row6);
        System.out.println(row7);
    }
}