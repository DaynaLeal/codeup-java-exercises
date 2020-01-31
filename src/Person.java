public class Person {
    private String name;

    public static void main(String[] args) {
        Person dayna = new Person("Dayna");

        System.out.println(dayna.getName());
        dayna.sayHello();
        dayna.setName("Revae");
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        String output = "";
        output += this.name;
        return output;
    }

    public void sayHello(){
        System.out.println("Hello, " + this.name + "!\n");
    }
}
