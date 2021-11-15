import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void mainMenu() {
      DataBase database = new DataBase();

        System.out.println("1 Manage Booking");
        System.out.println("2 Manage Staff ");
        System.out.println("3 Manage Guests");
        System.out.println("4 Manage Room");
        System.out.println("Press \"r\" to reset Database");
        System.out.println("Press 5 to quit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "2":
                for (Staff staff: database.getStaffList()) {
                    staff.printStaff();
                }
                break;

            case "r":
                FileIo.databaseSerialization(database);
                mainMenu();
                break;

            case "6":
                System.exit(1);
                break;

            default:
                System.out.println("Wrong input ");
                mainMenu();
                break;
        }
    }
}