public class People {

    private int age;
    private String name;
    private float height;
    private float weight;

    public People(int age, String name, float height, float weight){
        System.out.println("Person is created: "+"\n");
        setValues(age, name, height, weight);
        System.out.println("Возраст: "+age + "\n" + "Имя: " + name + "\n" + "Рост: " + height + "\n" + "Вес: " + weight + "\n");
    }

    public People(String name){
        System.out.println("Person is created: " );
        this.name = name;
        System.out.println("Известно лишь имя человека, его/её зовут - " + name + "\n");
    }
    public void setValues(int age, String name, float height, float weight){
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void skill(){
        System.out.println("Умеет подтягиваться))");

    }

    public static void ageComparing(People p1, People p2){
        if (p1.age > p2.age){
            System.out.println("Возраст" + " " + p1.name + " = " + p1.age);
            System.out.println("Возраст" + " " + p2.name + " = " + p2.age);
            System.out.println(p1.name + " " + "Старше чем " + p2.name);
        }
        else{
            System.out.println("Возраст" + " " + p1.name + " = " + p1.age);
            System.out.println("Возраст" + " " + p2.name + " = " + p2.age);
            System.out.println(p2.name + " " + "Старше чем " + p1.name);
        }

    }

    public static String age_control(People p){
        if (p.age >= 18) {
            return p.name + " - это ваш сидр со вкусом груши сэр!";
        }
        else{
            return p.name + ", извините, но для вас лишь Натахтари";
        }
    }


}
