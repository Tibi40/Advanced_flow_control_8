public class FlowControl {

    private static String somevalue;
    public static void main(String[] args) {

        String name1 = "Andreea";
        String name2 = "Andreea";

        String name3 = new String("Andreea"); //un nou obiect

        int age = 10;
        Animal animal = new Animal();

        User user1 = new User();
        User user2 = new User();

        //user1.setName("Maria");
        //user2.setName("Ion");

        FlowControl flowControl1 = new FlowControl();
        FlowControl flowControl2 = new FlowControl();

        System.out.println(name1 == name2);      //true
        System.out.println(name1.equals(name2)); //true



    }
}

class User {

    private String somevalue;

    public String getSomevalue() {
        return somevalue;
    }

    public void setSomevalue(String somevalue) {
        this.somevalue = somevalue;
    }
}
