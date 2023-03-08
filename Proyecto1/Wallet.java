public class Wallet {
    int id;
    private float balance;
    Cards cards;

    public Wallet(int id) {
        this.id = id;
        balance = (float) 0.0;
    }

    public void addBalnce(float money) {
        balance = balance + money;
    }

    public void addCard(Cards card) {
        this.cards = card;

    }
}
