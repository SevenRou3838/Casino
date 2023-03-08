public class Cards {
    String numberOnly;
    String expire;
    String name;
    Enum type;
    int id;

    public Cards(String numberOnly, String expire, String name, int id, int type) {
        this.numberOnly = numberOnly;
        this.expire = expire;
        this.name = name;
        this.id = id;
    }

    public String getNumberOnly() {
        return numberOnly;
    }

    public void setNumberOnly(String numberOnly) {
        this.numberOnly = numberOnly;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
