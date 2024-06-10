class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Волчонок");
        wolf.setGender("М");
        wolf.setColor("Серый");
        wolf.setAge(3);
        wolf.setWeight(41.4f);

        System.out.println("Имя: " + wolf.getName() + "\nПол: " + wolf.getGender() +
                "\nОкрас: " + wolf.getColor() + "\nВозраст: " + wolf.getAge() + 
                "\nВес: " + wolf.getWeight());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}