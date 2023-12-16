package view;

public class Dashboard {

    public void mainMenu() {
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("***          **************     **************     *************** ***");
        System.out.println("***         **************     **************     ***************  ***");
        System.out.println("***        ****               ****      ****           ****        ***");
        System.out.println("***       ****               ****      ****           ****         ***");
        System.out.println("***      **************     **************           ****          ***");
        System.out.println("***     **************     **************           ****           ***");
        System.out.println("***    ****               ****                     ****            ***");
        System.out.println("***   ****               ****                     ****             ***");
        System.out.println("***  ****               ****                     ****              ***");
        System.out.println("*** ****               ****                     ****     by Vo Hoang Nguyen");
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("UNIVERSITY MANAGE");
        System.out.println("CHOOSE YOUR OPTION");
        System.out.println("1.Student.");
        System.out.println("2.Lecturer.");
        System.out.println("3.Exit.");
    }

    public void MasterMenu() {
        System.out.println("UNIVERSITY MANAGE");
        System.out.println("CHOOSE YOUR OPTION");
        System.out.println("1.Student.");
        System.out.println("2.Lecturer.");
        System.out.println("3.Exit.");
    }

    public void optionMenu() {
        System.out.println("-----------------------");
        System.out.println("1.Add information.");
        System.out.println("2.Show information.");
        System.out.println("3.Edit information.");
        System.out.println("4.Delete information.");
        System.out.println("5.Show all information and delete.");
        System.out.println("6.Back to the master menu. ");
    }

    public void Name() {
        System.out.println("Name :");
    }

    public void Gender() {
        System.out.println("Gender : ");
    }

    public void Email() {
        System.out.println("Email :");
    }

    public void Major() {
        System.err.println("Major :");
    }

    public void Subject1() {
        System.out.println("Subject 1:");
    }

    public void subject2() {
        System.out.println("Subject 2:");
    }

    public void subject3() {
        System.out.println("Subject 3:");
    }

    public void subject4() {

        System.out.println("Subject 4:");
    }

    public void Address() {
        System.out.println("Address :");
    }

    public void PhoneNum() {
        System.out.println("Phone number :");
    }

    public void Born() {
        System.out.println("Born year: ");
    }

    public void FindInforLec() {
        System.out.println("You want to search information by ?");
        System.out.println("1.By name");
        System.out.println("2.By email");
        System.out.println("3.By Subject. ");

    }

    public void FindInforStu() {
        System.out.println("You want to search information by ?");
        System.out.println("1.By name");
        System.out.println("2.By email");
        System.out.println("3.By Major. ");

    }

    public void Edit() {
        System.out.print("Enter name of people you want to edit information :");
    }

    public void HindByName() {
        System.out.print("Enter name of person you want to show information : ");
    }

    public void HindByEmail() {
        System.out.println("Enter email of person you want to show information :");
    }

    public void HindBySub() {
        System.out.println("Enter subject of person you want to show information : ");
    }

    public void HintbyMajor() {
        System.out.println("Enter major of student you want to show information : ");
    }

    public void editPhone() {
        System.out.println("Enter new phone number :");
    }

    public void editAdd() {
        System.out.println("Enter new address : ");
    }

    public void Deleteby() {
        System.out.println("You want to delete by ?");
        System.out.println("1.By name.");
        System.out.println("2.By Email");
    }

    public void Deletebyname() {
        System.out.println("Enter name of people you want to delete information.");
    }

    public void Deletebyemail() {
        System.out.println("Enter email of people you want to delete information.");
    }

    public void ShowAllandDel() {
        System.out.println("1.Do you want to show all information of student.");
        System.out.println("2.Delete all.");
    }

}
