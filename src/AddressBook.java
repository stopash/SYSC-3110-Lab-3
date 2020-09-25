import java.io.PrintStream;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.addressBook.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
