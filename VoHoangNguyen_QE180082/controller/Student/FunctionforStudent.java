package controller.Student;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import model.Student;

public class FunctionforStudent {

  private List<Student> student;

  public FunctionforStudent() {
    this.student = new ArrayList<>();

  }

  public void Add(Student student) {
    this.student.add(student);
  }

  public List<Student> SearchByName(String Name) {

    return this.student.stream().filter(o -> o.getName().equalsIgnoreCase(Name)).collect(Collectors.toList());
  }

  public List<Student> SearchByEmail(String Email) {
    return this.student.stream().filter(o -> o.getEmail().equalsIgnoreCase(Email)).collect(Collectors.toList());
  }

  public List<Student> SearchBySubject(String Subject1) {
    return this.student.stream().filter(o -> o.getSubject1().equalsIgnoreCase(Subject1)).collect(Collectors.toList());

  }

  public List<Student> SearchByMajor(String Major) {
    return this.student.stream().filter(o -> o.getMajor().equalsIgnoreCase(Major)).collect(Collectors.toList());
  }

  public void DeleteByName(String Name) {
    List<Student> toRemove = this.student.stream().filter(o -> o.getName().contains(Name)).collect(Collectors.toList());
    this.student.removeAll(toRemove);
  }

  public void DeleteByEmail(String Email) {
    List<Student> toRemove = this.student.stream().filter(o -> o.getEmail().contains(Email))
        .collect(Collectors.toList());
    this.student.removeAll(toRemove);
  }

  public void ShowAllInforOfList() {
    this.student.forEach(o -> System.out.println(o.hintInfor()));
  }

  public void DelAll() {
    this.student.clear();
  }

}
