package model;


public class Student extends Person {

   public Student(String Email, String Name, String Gender, String Major, String subject1, String subject2,
         String subject3, String subject4, String Address, String PhoneNum, String BornYear) {
      super(Email, Name, Gender, Name, Gender, Address, subject1, subject2, subject3, subject4, Major);

   }

   @Override
   public String hintInfor() {
    return    "-----------------------"
            + "\nName of student : " + getName()
            + "\nEmail : " + getEmail()
            + "\nGender : " + getGender()
            + "\nAddress : " + getAddress()
            + "\nMajor : " + getMajor()
            + "\nSubject 1 : " + getSubject1()
            + "\nSubject 2 : " + getSubject2()
            + "\nSubject 3 : " + getSubject3()
            + "\nSubject 4 : " + getSubject4()
            + "\nPhone number : " + getPhoneNum()
            + "\nBorn Year: " + getBornYear();
   }

}