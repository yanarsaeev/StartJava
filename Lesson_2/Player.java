public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }
}