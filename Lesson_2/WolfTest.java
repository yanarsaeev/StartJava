class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.name = "Волчонок";
        wolf.gender = "М";
        wolf.color = "Серый";
        wolf.age = 3;
        wolf.weight = 41.4f;

        System.out.println("Имя: " + wolf.name + "\nПол: " + wolf.gender +
                "\nОкрас: " + wolf.color + "\nВозраст: " + wolf.age + 
                "\nВес: " + wolf.weight);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunting();
    }
}