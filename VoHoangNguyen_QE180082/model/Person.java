package model;

public abstract class Person {
    private String Email;
    private String Name;
    private String Gender;
    private String PhoneNum;
    private String BornYear;
    private String Address;
    private String Major;
    private String subject1;
    private String subject2;
    private String subject3;
    private String subject4;

    public Person(String Email, String Name, String Gender, String PhoneNum, String BornYear, String Address, String subject1,
            String subject2, String subject3, String subject4, String Major) {
        this.Email = Email;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.PhoneNum = PhoneNum;
        this.BornYear = BornYear;
        this.Major = Major;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    public String getSubject1() {
        return this.subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return this.subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return this.subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    public String getSubject4() {
        return this.subject4;
    }

    public void setSubject4(String subject4) {
        this.subject4 = subject4;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNum() {
        return this.PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getBornYear() {
        return BornYear;
    }

    public void setBornYear(String BornYear) {
        this.BornYear = BornYear;
    }

    public String getMajor() {
        return this.Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;

    }
    public abstract String hintInfor();

}

