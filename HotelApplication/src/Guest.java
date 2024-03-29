import java.util.ArrayList;

public class Guest implements java.io.Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Guest(int id, String firstName, String lastName, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void printGuest() {
        System.out.println("====================" +
                "\nID: " + id +
                "\n" + "Name: " + firstName + " " + lastName +
                "\nAddress " + address +
                "\nPhone number " + phoneNumber + "\n"
        );
    }

    public static void printGuestList(ArrayList<Guest> guestList) {
        for (Guest guest : guestList) {
            guest.printGuest();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
