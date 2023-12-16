package controller.Lecturer;

import java.util.Scanner;
import model.Lecturer;
import view.Dashboard;

public class ControlFuncLecturer {
    Scanner scanner = new Scanner(System.in);
    Dashboard dashboard = new Dashboard();
    FunctionforLec functionforLec = new FunctionforLec();

    // add information for Lecturer
    public void AddInforLec() {
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
        Lecturer lecturer = new Lecturer(Major, Email, Name, Gender, subject1, subject2, subject3, subject4,
                Address, PhoneNum, BornYear);
        functionforLec.Add(lecturer);
    }

    // find Lecturer by name
    public void FindLecName() {
        dashboard.HindByName();
        String find = scanner.nextLine();
        functionforLec.SearchByName(find).forEach(o -> System.out.println(o.hintInfor()));
    }

    // find Lecturer by email
    public void FindLecEmail() {
        dashboard.HindByEmail();
        String find = scanner.nextLine();
        functionforLec.SearchByEmail(find).forEach(o -> System.out.println(o.hintInfor()));
    }

    // find Lecturer by subject
    public void FindLecSub() {
        dashboard.HindBySub();
        String find = scanner.nextLine();
        functionforLec.SearchBySubject(find);
    }

    // edit Lecturer information
    public void EditLec() {
        dashboard.Edit();
        String edit = scanner.nextLine();
        dashboard.editAdd();
        String newAdd = scanner.nextLine();
        functionforLec.SearchByName(edit).forEach(o -> o.setAddress(newAdd));
        dashboard.editPhone();
        String newPhone = scanner.nextLine();
        functionforLec.SearchByName(edit).forEach(o -> o.setPhoneNum(newPhone));
    }

    // delete information of Lecturer by name
    public void DelbyName() {
        dashboard.Deletebyname();
        String name = scanner.nextLine();
        functionforLec.DeleteByName(name);
    }

    // delete information of Lecturer by mail
    public void DebyMail() {
        dashboard.Deletebyemail();
        String email = scanner.nextLine();
        functionforLec.DeleteByEmail(email);
    }

    // delete all Lecturer information
    public void DellAll() {
        functionforLec.DelAll();
    }

    // Show all Lecture information
    public void ShowAllInfor() {
        functionforLec.ShowAllInforOfList();
    }

}
