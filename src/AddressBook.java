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
        BuddyInfo buddy = new BuddyInfo("HappyMan105", 1051051234, "105 Happy Lane");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
    }
}
