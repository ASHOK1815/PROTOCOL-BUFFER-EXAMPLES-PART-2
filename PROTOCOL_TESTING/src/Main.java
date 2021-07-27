import proto.example.Schema.Student;
import proto.example.Schema.Students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void  main(String [] args)
    {
          Student.Builder students1 = new Student.Builder();
          Student.Builder students2 = new Student.Builder();
          Student.Builder students3 = new Student.Builder();

          // Here we are adding the object to the list
          Students.Builder arrayList = new Students.Builder();


          students1.setName("ASHOK");
          students1.setUid(6735);
          students1.setDepartment("CSE");

          students2.setName("SUNIL");
          students2.setUid(2467);
          students2.setDepartment("CSE");


          students3.setName("JAVED");
          students3.setUid(6705);
          students3.setDepartment("CSE");



          arrayList.addStudents(students1);
          arrayList.addStudents(students2);
          arrayList.addStudents(students3);

          //System.out.println(students1.getName()+" "+students1.getDepartment()+" "+students1.getUid());

        Iterator<Student> it = arrayList.getStudentsList().iterator();
        System.out.println("ASSESING THE INDEX 1 OF THE STUDENT ARRAYLIST");
        System.out.println(arrayList.getStudents(1));
        System.out.println("-----------------------------------------------");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("------------------------------------------------");

       // checking that all the required feet is set or not !

        System.out.println(arrayList.isInitialized());

        System.out.println("--------------------------------------------------");

       for(Student students: arrayList.getStudentsList())
       {
           System.out.println(students.toString());
       }

       // writing to the STUDENTDATA files..................................

        String usersFilePath = "./STUDENTDATA";

        try{
            FileInputStream inputFile = new FileInputStream(usersFilePath);

            Students.Builder studentdata = Students.newBuilder();
            studentdata.addStudents(students1);
            studentdata.addStudents(students2);
            studentdata.addStudents(students3);

            FileOutputStream outputFile = new FileOutputStream(usersFilePath);
            studentdata.build().writeTo(outputFile);
        } catch (IOException e)
        {
            System.out.println("Problem in adding data from file !");
        }



        // READING FROM THE STUDENT DATA FILE................................
        System.out.println("READING FROM THE STUDENT BINEARY FILE");



        try {
            FileInputStream inputFile = new FileInputStream(usersFilePath);
            Students.Builder studentdata = Students.newBuilder();
            studentdata.mergeFrom(inputFile);

            int size=studentdata.getStudentsCount();

            for(int i=0;i<size;i++)
            {
                System.out.println(studentdata.getStudents(i).getName());
                System.out.println(studentdata.getStudents(i).getUid());
            }

        } catch (IOException e) {
            System.out.println("Problem in reading data from file !");
        }






    }


}
