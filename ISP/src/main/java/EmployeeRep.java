public class EmployeeRep implements WorkableInterface, FeadableInterface
{
    public void work() {
        System.out.println("Representing Employees");
    }

    public void eat()
    {
        System.out.println("Eating like the other guys");
    }
}
