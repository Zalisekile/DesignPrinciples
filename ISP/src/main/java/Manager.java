public class Manager
{
    WorkableInterface employee;

    public void setemployee(WorkableInterface p)
    {
        employee = p;
    }

    public void manage()
    {
        employee.work();
    }
}
