public class Paswords {
    int numbCard;
    String expire;
    int cardVcc;
    String name;
    int type;
    String userPass;

    public Paswords(int numbCard, String expire, int cardVcc, String name, int type, String userPass) {
        this.numbCard = numbCard;
        this.expire = expire;
        this.cardVcc = cardVcc;
        this.name = name;
        this.type = type;
        this.userPass = userPass;
    }

    public int getNumbCard() {
        return numbCard;
    }

    public void setNumbCard(int numbCard) {
        this.numbCard = numbCard;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public int getCardVcc() {
        return cardVcc;
    }

    public void setCardVcc(int cardVcc) {
        this.cardVcc = cardVcc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

}
