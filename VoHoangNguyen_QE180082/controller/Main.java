package controller;

import view.Dashboard;
import java.util.Scanner;
import controller.Lecturer.ControlFuncLecturer;
import controller.Student.ControlFuncStudent;

public class Main {
  public static void main(String[] args) {
    ControlFuncStudent controlFuncStudent = new ControlFuncStudent();
    ControlFuncLecturer controlFuncLecturer = new ControlFuncLecturer();
    Scanner scanner = new Scanner(System.in);
    Dashboard dashboard = new Dashboard();
    while (true) {
      dashboard.mainMenu();
      int choice = scanner.nextInt();
      switch (choice) {
        case 1: {
          boolean sstudent = true;
          while (sstudent) {
            dashboard.optionMenu();
            int choice2 = scanner.nextInt();
            switch (choice2) {
              case 1: {
                controlFuncStudent.AddInforStu();
              }
                break;
              case 2: {
                dashboard.FindInforStu();
                int choice3 = scanner.nextInt();
                switch (choice3) {
                  case 1: {
                    controlFuncStudent.FindStuName();
                  }
                    break;
                  case 2: {
                    controlFuncStudent.FindStuEmail();
                  }
                    break;
                  case 3: {
                    controlFuncStudent.FindstuMajor();
                  }
                    break;
                }
                break;
              }
              case 3: {
                controlFuncStudent.EditStu();
              }
                break;
              case 4: {
                dashboard.Deleteby();
                int choice5 = scanner.nextInt();
                switch (choice5) {
                  case 1: {
                    controlFuncStudent.DelbyName();
                  }
                    break;
                  case 2: {
                    controlFuncStudent.DebyMail();
                  }
                    break;
                }
              }
                break;
              case 5: {
                dashboard.ShowAllandDel();
                int choice6 = scanner.nextInt();
                switch (choice6) {
                  case 1: {
                    controlFuncStudent.ShowAllInfor();
                  }
                    break;
                  case 2: {
                    controlFuncStudent.DelAll();
                  }
                    break;
                }
              }
                break;
              case 6: {
                sstudent = false;
              }
                break;
            }
          }
        }
          break;
        case 2: {
          Boolean slecturer = true;
          while (slecturer) {
            dashboard.optionMenu();
            int choice4 = scanner.nextInt();
            switch (choice4) {
              case 1: {
                controlFuncLecturer.AddInforLec();
              }
                break;
              case 2: {
                dashboard.FindInforLec();
                int choice5 = scanner.nextInt();
                switch (choice5) {
                  case 1: {
                    controlFuncLecturer.FindLecName();
                  }
                    break;
                  case 2: {
                    controlFuncLecturer.FindLecEmail();
                  }
                  case 3: {
                    controlFuncLecturer.FindLecSub();
                  }
                }
                break;
              }
              case 3: {
                controlFuncLecturer.EditLec();
              }
                break;
              case 4: {
                dashboard.Deleteby();
                int choice5 = scanner.nextInt();
                switch (choice5) {
                  case 1: {
                    controlFuncLecturer.DelbyName();
                  }
                    break;
                  case 2: {
                    controlFuncLecturer.DebyMail();
                  }
                    break;
                }
              }
                break;
              case 5: {
                dashboard.ShowAllandDel();
                int choice7 = scanner.nextInt();
                switch (choice7) {
                  case 1: {
                    controlFuncLecturer.ShowAllInfor();
                  }
                    break;
                  case 2: {
                    controlFuncLecturer.DellAll();
                  }
                    break;
                }
              }
                break;
              case 6: {
                slecturer = false;
              }
                break;
            }
          }
        }
          break;
        case 3: {
          System.exit(0);
        }
          break;
      }
      continue;
    }
  }
}