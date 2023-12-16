package model;

public class Lecturer extends Person {
    public Lecturer(String Major, String Email, String Name, String Gender, String Subject1, String Subject2,
            String Subject3, String Subject4, String Address, String PhoneNum, String BornYear) {
        super(Email, Name, Gender, Name, Gender, Address, Subject1, Subject2, Subject3, Subject4, Major);
    }

    @Override
    public String hintInfor() {
    return        "-----------------------"
                + "\nName of lecturer : " + getName()
                + "\nEmail : " + getEmail()
                + "\nGender : " + getGender()
                + "\nSubject 1 : " + getSubject1()
                + "\nSubject 2 : " + getSubject2()
                + "\nSubject 3 : " + getSubject3()
                + "\nSubject 4 : " + getSubject4()
                + "\nAddress : " + getAddress()
                + "\nPhone number : " + getPhoneNum()
                + "\nBorn Year: " + getBornYear();
    }

}