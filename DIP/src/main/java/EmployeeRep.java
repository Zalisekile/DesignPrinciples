public class EmployeeRep
{
    Employee employee;

    public void setEmployee (Employee p)
    {
        employee = p;
    }
    public void manage()
    {
        employee.work();
    }
}
