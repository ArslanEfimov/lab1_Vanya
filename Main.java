public class Main {
    public static void main(String[] args) {
        People Arina = new People("Арина");
        People Arslan = new People(17, "Арслан", 180.5f, 57.5f);
        Arslan.skill();
        People Vanya = new People(20, "Иван", 185.4f,72.5f);
        Vanya.skill();

        People.ageComparing(Arslan, Vanya);

        String control1 = People.age_control(Arslan);
        String control2 = People.age_control(Vanya);

        System.out.println(control1);
        System.out.println(control2);

    }
}