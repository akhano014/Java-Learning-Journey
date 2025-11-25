import java.util.ArrayList;
public class Arrayslist {
 public  static void main(String[] args) {
        ArrayList<Integer> Alist=new ArrayList<Integer>();
     System.out.println("Adding Element");
        Alist.add(0);
        Alist.add(2);
        Alist.add(4);
        Alist.add(6);

     System.out.println(Alist);

     System.out.println("Getting Elemnets");
     int a=Alist.get(2);
     System.out.println(a);

     System.out.println("Updating Elements");
     Alist.add(3,3);
     System.out.println(Alist);

     System.out.println("Removing Elemnt");
     Alist.remove(3);
     System.out.println(Alist);

     System.out.println("Loops");
     for (int i = 0; i < Alist.size(); i++) {
         System.out.print("Arrays list: " + Alist.get(i));
     }
    }
}
