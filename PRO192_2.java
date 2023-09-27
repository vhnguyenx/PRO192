import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class PRO192_2
{
    private static String arr[];
    private static String Name;
    private static Scanner scaner;
    public static String[] LuuTru()
    {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Nhap vao so luong nguoi ban muon luu:");
        int n = sc4.nextInt();
        String arr[]= new String[n];
        for (int i=0 ; i<arr.length; i++)
        {
            System.out.println("Nhap vao ten ban muon luu: ");
            sc4.nextLine();
            arr[i]= sc4.nextLine();
        }
        return arr;

    }
      public static void main(String[] args)
    {
     while(true)
     {
      System.out.println("1.Tinh + - * / cua hai so a va b ");
      System.out.println("2.Nhap ho ten va in ra ho ten day du");
      System.out.println("3.Tinh diem hoc phan");
      System.out.println("4.Kiem tra ho ten trong danh sach");
      Scanner scanner = new Scanner(System.in);
       int choice = scanner.nextInt(); 
       switch(choice)
       
       {
        case 1:
        {
         //exception 2 : xử lý khi người dùng nhập vào một String mà yêu cầu là nhập vào một số
         try
        {
           Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao hai so a va b:");
           if(sc.hasNextDouble())
           {
             double a = sc.nextInt();
             double b = sc.nextInt();
             System.out.println(a+b);
             System.out.println(a-b);
             System.out.println(a*b);
            //exception 1 : trường hợp một số chia cho số 0
             if(b!=0)
             {
             System.out.println(a/b);
             }
             else 
             {
                System.out.println("At / caculator , b must be different 0");
             }
           } 
           else
           {
             System.out.println("Your input must be interger");
           }       
          
          } 
          catch(InputMismatchException e)
          {
            System.out.println("Your input must be interger");
          } 
          break;
        }     
        
        case 3:
        {
         Scanner sc2= new Scanner(System.in);  
        System.out.println("Enter pp score, half and final :");
        int score = scanner.nextInt();
        int mid = scanner.nextInt();
        int fina = scanner.nextInt();
        System.out.println("Overall : "+((score*0.1)+(mid*0.2)+(fina*0.7)));
        
        break;
        }
        case 2:
        {
              Scanner sc3 = new Scanner(System.in);
              System.out.println("Enter Name:");
              scanner.nextLine();
              String Name= sc3.nextLine();
              System.out.println("Ho ten la: " +Name);
              
              break;
        }
        case 4:
        {
          
           String[] arr = LuuTru();
           System.out.println("Enter name to search: ");
           scanner.nextLine();
           String Name = scanner.nextLine();
           
           boolean search = false;
           for(String name: arr)
           {
              if(name.equals(Name))
              {
                search = true;
                break;
              } 
           }
           if(search)
           {
            System.out.println("Yes");
           }
           else
           {
            System.out.println("No");
           }
           scanner.close();
           break;
        }
      }
        continue;
       }
    }
}
