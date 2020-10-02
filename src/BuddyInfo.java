import java.io.PrintStream;

public class BuddyInfo {
    private String address;
    private int phoneNo;
    private String name;

    public String getAddress() {
        return this.address;
    }

    public int getPhoneNo() {
        return this.phoneNo;
    }

    public String getName() {
        return this.name;
    }

    public BuddyInfo(String address, int phoneNo, String name) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("HappyMan105", 1051051234, "105 Happy Lane");
        PrintStream var10000 = System.out;
        String var10001 = buddy.getName();
        var10000.println("Hello, " + var10001 + " who lives at " + buddy.getAddress() + " with phone number " + buddy.getPhoneNo() + ".");
    }
}
