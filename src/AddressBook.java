import java.io.PrintStream;
import java.util.ArrayList;

/*I have a morning ritual that I need to share. I call it "the terminator".

First I crouch down in the shower in the classic "naked terminator traveling through time" pose. With my eyes closed I crouch there for a minute, visualizing either Arnold or the guy from the second movie (not the chick in the third one because that one sucked) and I start to hum the terminator theme.

Then I slowly rise to a standing position and open my eyes. It helps me to proceed through my day as an emotionless, cyborg badass.

The only problem is if the shower curtain sticks to my terminator leg. It ruins the fantasy.*/
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
