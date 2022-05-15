package za.ac.cput.Entity;

public class Card {

    private int password;

    public Card(int password) {
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Card{" +
                "password=" + password +
                '}';
    }
}
