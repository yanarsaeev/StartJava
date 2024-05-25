public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private String bodyLanguage;
    private int speed;
    private int pilotsCount;
    private int rockets;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, float height, float weight,
            int strength, int armor, String bodyLanguage, int speed, int pilotsCount, int rockets) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
        this.bodyLanguage = bodyLanguage;
        this.speed = speed;
        this.pilotsCount = pilotsCount;
        this.rockets = rockets;
    }

    public Jaeger(String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        this.armor = armor;
    }

    String getBodyLanguage() {
        return bodyLanguage;
    }

    void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getPilots() {
        return pilotsCount;
    }

    void setPilots(int pilotsCount) {
        this.pilotsCount = pilotsCount;
    }

    int getRockets() {
        return rockets;
    }

    void setRockets(int rockets) {
        this.rockets = rockets;
    }

    boolean drift() {
        return true;
    }

    void move() {
        System.out.println("moving...");
    }

    String scanKaiju() {
        return "scanning";
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    void attackInCloseCombat() {
        System.out.println("Attacking");
    }

    void useRockets(int rocketsCount) {
        if (rockets > 0) {
            if (rocketsCount > rockets) {
                System.out.println("Error");
            } else {
                System.out.printf("%d missiles were fired", rocketsCount);
            }
        } else {
            System.out.println("No missiles");
        }
    }
}