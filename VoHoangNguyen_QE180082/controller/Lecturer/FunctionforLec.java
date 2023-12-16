package controller.Lecturer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Lecturer;

public class FunctionforLec {

    private List<Lecturer> lecturer;

    public FunctionforLec() {
        this.lecturer = new ArrayList<>();

    }

    public void Add(Lecturer lecturer) {
        this.lecturer.add(lecturer);
    }

    public List<Lecturer> SearchByName(String Name) {

        return this.lecturer.stream().filter(o -> o.getName().equalsIgnoreCase(Name)).collect(Collectors.toList());
    }

    public List<Lecturer> SearchByEmail(String Email) {
        return this.lecturer.stream().filter(o -> o.getEmail().equalsIgnoreCase(Email)).collect(Collectors.toList());
    }

    public List<Lecturer> SearchBySubject(String Subject) {
        return this.lecturer.stream().filter(o -> o.getSubject1().equalsIgnoreCase(Subject)
                || o.getSubject2().equalsIgnoreCase(Subject)
                || o.getSubject3().equalsIgnoreCase(Subject)
                || o.getSubject4().equalsIgnoreCase(Subject)).collect(Collectors.toList());

    }

    public List<Lecturer> SearchByMajor(String Major) {
        return this.lecturer.stream().filter(o -> o.getMajor().equalsIgnoreCase(Major)).collect(Collectors.toList());
    }

    public void DeleteByName(String Name) {
        List<Lecturer> toRemove = this.lecturer.stream().filter(o -> o.getName().contains(Name))
                .collect(Collectors.toList());
        this.lecturer.removeAll(toRemove);
    }

    public void DeleteByEmail(String Email) {
        List<Lecturer> toRemove = this.lecturer.stream().filter(o -> o.getEmail().contains(Email))
                .collect(Collectors.toList());
        this.lecturer.removeAll(toRemove);
    }

    public void ShowAllInforOfList() {
        this.lecturer.forEach(o -> System.out.println(o.hintInfor()));
    }

    public void DelAll() {
        this.lecturer.clear();
    }
}
