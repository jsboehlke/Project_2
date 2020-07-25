import java.util.*;
public class Project_2 {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("\n\nColor Categorizer\n\n");
    for (int i = 0; i < 12; i++){
    System.out.println("Insert a color\n\n");
    String raw_value = user_input.nextLine();
    System.out.println("\n\n");
    String[] primary = {"Red", "Blue", "Yellow"};
    if (raw_value.equals(primary[0])) {System.out.println("Primary\n\n");}
    if (raw_value.equals(primary[1])) {System.out.println("Primary\n\n");}
    if (raw_value.equals(primary[2])) {System.out.println("Primary\n\n");}
    String[] secondary = {"Orange", "Green", "Violet"};
    if (raw_value.equals(secondary[0])) {System.out.println("Secondary\n\n");}
    if (raw_value.equals(secondary[1])) {System.out.println("Secondary\n\n");}
    if (raw_value.equals(secondary[2])) {System.out.println("Secondary\n\n");}
    String[] tertiary = {"Red-Orange", "Yellow-Orange", "Yellow-Green", "Blue-Green", "Blue-Violet", "Red-Violet"};
    if (raw_value.equals(tertiary[0])) {System.out.println("Tertiary\n\n");}
    if (raw_value.equals(tertiary[1])) {System.out.println("Tertiary\n\n");}
    if (raw_value.equals(tertiary[2])) {System.out.println("Tertiary\n\n");}
    if (raw_value.equals(tertiary[3])) {System.out.println("Tertiary\n\n");}
    if (raw_value.equals(tertiary[4])) {System.out.println("Tertiary\n\n");}
    if (raw_value.equals(tertiary[5])) {System.out.println("Tertiary\n\n");}
    }
  }
}