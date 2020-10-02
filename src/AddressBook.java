import java.io.PrintStream;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            addressBook.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < addressBook.size()) {
            return addressBook.remove(index);
        }
        return null;
    }

    public void happyMessage(){
        System.out.println("Have a happyman kind of day!");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("HappyMan105", 1051051234, "105 Happy Lane");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);
    }
}
