public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Mark-5", "Australia");
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getOrigin());

        jaeger1.setPilots(2);
        jaeger1.setRockets(3);
        jaeger1.useRockets(2);

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Gipsy Avenger");
        jaeger2.setMark("Mark-6");
        jaeger2.setBodyLanguage("Street Fighter");
        System.out.println(jaeger2.getModelName() + "\n" + 
                jaeger2.getMark() + "\n" + jaeger2.getBodyLanguage());
        jaeger2.setPilots(3);
        System.out.println(jaeger2.getPilots());
        jaeger2.setRockets(10);
        jaeger2.useRockets(5);
    }
}