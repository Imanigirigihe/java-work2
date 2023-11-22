class jool
{
public static void main(String args[]){
PermanentEmp p = new PermanentEmp();
TemporaryEmp t = new TemporaryEmp();
All objects of inherited classes can access the variable of class Employee
System.out.println("Permanent Employee salary is :" +p.salary);
System.out.println("Hike for Permanent Employee is:" +p.hike);
System.out.println("Temporary Employee salary is :" +t.salary);
System.out.println("Hike for Temporary Employee is :" +t.hike);
}
}package P1;
class Employee{
float salary = 40000;
}
class PermanentEmp extends Employee{
double hike = 0.5;
}
class TemporaryEmp extends Employee{
double hike = 0.35;
}
