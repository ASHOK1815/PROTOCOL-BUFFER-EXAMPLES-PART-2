import com.example.protos.employee.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {


    public  static Employee setData(int id,String name,String email, int value, int salary) // adding data
    {
        Employee.Builder builder = Employee.newBuilder();
        builder.setEmpId(id)
            .setEmail(email)
            .setEmpName(name)
            .setGenderValue(value)// PASSING VALUE IS NOT A GOOD APPROACH   TRY ONLY  (  .setGender(Employee.Gender.MALE)      )
            .setSalary(salary);
        return  builder.build();
    }


    public static ArrayList<Employee> deleteData(String name, ArrayList<Employee> employeeArrayList) // deleting data
    {

        Iterator<Employee> it = employeeArrayList.iterator();

        while (it.hasNext())
        {
            if(it.next().getEmpName().equals(name))
            {
                it.remove();

            }
        }

        return  employeeArrayList;

    }

    public static String ShowPaySlip(int eCode,ArrayList<Employee> employees)
    {
           Iterator<Employee> it = employees.iterator();
           String paySlip = "Invalid employee id";

           for(Employee employee : employees)
           {
               if(employee.getEmpId() == eCode)
               {
                   paySlip = employee.getEmpName()+" PAY SLIP FOR EMPLOYEE ID " + eCode + " IS " +
                             employee.getSalary();
               }
           }


           return paySlip;

    }

    public static void main(String[] args) {

        Employee employee1 = setData(6735,"ASHOK","rupender20@gmail.com",1,60000);
        Employee employee2 = setData(2467,"SUNIL","sunilvashist45@gmail.com",1,60002);
        Employee employee3 = setData(6705,"JAVED","javedali0563@gmailcom",1,60001);

        // USING OF THE ARRAY LIST ......... JUST FOR FUN :)

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        // USING OF ITERATOR FOR ACCESSSING THE DATA ...................................................

        System.out.println("...................BEFORE DELETING THE DATA...........................");
        Iterator<Employee> it = employeeArrayList.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());

        }

        System.out.println("...................AFTER DELETING THE DATA...........................");

        ArrayList<Employee> newEmployeeList = deleteData("JAVED",employeeArrayList);

        for(Employee employee:newEmployeeList)
        {
            System.out.println(employee);
        }


        System.out.println(".......................GENERATING PAY SLIP...........................");
        System.out.println(ShowPaySlip(6735,newEmployeeList));







    }
}
