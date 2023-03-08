class User {
    String name;
    String lastName_1;
    String lastName_2;
    String birth;
    String email;
    char gerder;
    int id;
    int Ncard[];

    public User(String name, String lastName_1, String lastName_2, String birth, String email, char gerder, int id) {
        this.name = name;
        this.lastName_1 = lastName_1;
        this.lastName_2 = lastName_2;
        this.birth = birth;
        this.email = email;
        this.gerder = gerder;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName_1() {
        return lastName_1;
    }

    public void setLastName_1(String lastName_1) {
        this.lastName_1 = lastName_1;
    }

    public String getLastName_2() {
        return lastName_2;
    }

    public void setLastName_2(String lastName_2) {
        this.lastName_2 = lastName_2;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGerder() {
        return gerder;
    }

    public void setGerder(char gerder) {
        this.gerder = gerder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getNcard() {
        return Ncard;
    }

    public void setNcard(int[] ncard) {
        Ncard = ncard;
    }

}