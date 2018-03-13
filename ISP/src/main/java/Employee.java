public class Employee implements WorkableInterface,FeadableInterface
{
    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }
}
