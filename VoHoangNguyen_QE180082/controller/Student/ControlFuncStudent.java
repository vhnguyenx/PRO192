package controller.Student;


import model.Student;
import view.Dashboard;
import java.util.Scanner;
import controller.Lecturer.FunctionforLec;

public class ControlFuncStudent {

    FunctionforStudent functionforStudent = new FunctionforStudent();
    FunctionforLec functionforLec = new FunctionforLec();
    Scanner scanner = new Scanner(System.in);
    Dashboard dashboard = new Dashboard();
     // Add information for Student
    public void AddInforStu() {
        dashboard.Name();
        String Name = scanner.nextLine();
        dashboard.Gender();
        String Gender = scanner.nextLine();
        dashboard.Email();
        String Email = scanner.nextLine();
        dashboard.Major();
        String Major = scanner.nextLine();
        dashboard.Subject1();
        String subject1 = scanner.nextLine();
        dashboard.subject2();
        String subject2 = scanner.nextLine();
        dashboard.subject3();
        String subject3 = scanner.nextLine();
        dashboard.subject4();
        String subject4 = scanner.nextLine();
        dashboard.Address();
        String Address = scanner.nextLine();
        dashboard.PhoneNum();
        String PhoneNum = scanner.nextLine();
        dashboard.Born();
        String BornYear = scanner.nextLine();
        Student student = new Student(Email, Name, Gender, Major, subject1, subject2, subject3, subject4,
                Address,
                PhoneNum, BornYear);
        functionforStudent.Add(student);
    }
   

    // find student by name
    public void FindStuName() {
        dashboard.HindByName();
        
        String find = scanner.nextLine();
        functionforStudent.SearchByName(find).forEach(o -> System.out.println(o.hintInfor()));
    }

    // find student by email
    public void FindStuEmail() {
        dashboard.HindByEmail();
     
        String find = scanner.nextLine();
        functionforStudent.SearchByEmail(find).forEach(o -> System.out.println(o.hintInfor()));
    }

    // find student by major
    public void FindstuMajor() {
        dashboard.HintbyMajor();
        String Major = scanner.nextLine();
       
        functionforStudent.SearchByMajor(Major).forEach(o -> System.out.println(o.hintInfor()));
    }

    // edit student information
    public void EditStu() {
        dashboard.Edit();
       
        String edit = scanner.nextLine();
        dashboard.editAdd();
        String newAdd = scanner.nextLine();
        functionforStudent.SearchByName(edit).forEach(o -> o.setAddress(newAdd));
        dashboard.editPhone();
        String newPhone = scanner.nextLine();
        functionforStudent.SearchByName(edit).forEach(o -> o.setPhoneNum(newPhone));
    }

    // delete information of student by name
    public void DelbyName() {
        dashboard.Deletebyname();
       
        String name = scanner.nextLine();
        functionforStudent.DeleteByName(name);
    }

    // delete information of student by mail
    public void DebyMail() {
        dashboard.Deletebyemail();
       
        String email = scanner.nextLine();
        functionforStudent.DeleteByEmail(email);
    }
   //show all student information
    public void ShowAllInfor()
    {
        functionforStudent.ShowAllInforOfList();
    }
   //dell all student information
    public void DelAll()
   {
    functionforStudent.DelAll();
   }
}
