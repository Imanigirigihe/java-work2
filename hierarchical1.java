package P1;
public class colum
{
public static void main(String args[]){
PermanentEmp p = new PermanentEmp();
TemporaryEmp t = new TemporaryEmp();
// All objects of inherited classes can access the method of class Employee
p.dispSalary();
p.incrementSalary();
t.dispSalary();
t.incrementSalary();
}
}class Employee{
float salary = 40000;
void dispSalary()
{
System.out.println("The Employee salary is :" +salary);
}
}
class PermanentEmp extends Employee{
double hike = 0.5;
void incrementSalary()
{
System.out.println("The Permanent Employee incremented salary is :" +(salary+(salary * hike)));
}
}
class TemporaryEmp extends Employee{
double hike = 0.35;
void incrementSalary()
{
System.out.println("The Temporary Employee incremented salary is :" +(salary+(salary * hike)));
}
}
