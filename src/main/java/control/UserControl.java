package control;

import entities.Product;
import entities.enums.Type;
import lombok.SneakyThrows;
import service.ServiceDefault;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserControl {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    ServiceDefault service = new ServiceDefault();

    @SneakyThrows
 public void cmdList(){
     System.out.println("\nPlease, enter :");
     System.out.println("1 - to create new notebook");
     System.out.println("2 - to create new phone");
     System.out.println("3 - to create new TV");

     switch (read.readLine().replaceAll(" ","")){
         case ("1"):
             Product notebook = service.create(Type.NOTEBOOK);
             System.out.println(notebook);
             Product copyOfNotebook = notebook.clone();
             System.out.println(copyOfNotebook);
             System.out.println("equals product link : " + (notebook == copyOfNotebook));
             System.out.println("equals price link : " + (notebook.getPrice() == copyOfNotebook.getPrice()));
             break;
         case ("2"):
             Product iPhone = service.create(Type.PHONE);
             System.out.println(iPhone);
             Product copyOfPhone = iPhone.clone();
             System.out.println(copyOfPhone);
             System.out.println("equals product link : " + (iPhone == copyOfPhone));
             System.out.println("equals price link : " + (iPhone.getPrice() == copyOfPhone.getPrice()));
             break;
         case ("3"):
             Product tv = service.create(Type.TV);
             System.out.println(tv);
             Product copyOfTv = tv.clone();
             System.out.println(copyOfTv);
             System.out.println("equals product link : " + (tv == copyOfTv));
             System.out.println("equals price link : " + (tv.getPrice() == copyOfTv.getPrice()));
             break;
         default:
             System.out.println("Unsupported command");
             cmdList();
     }
     cmdList();
 }
}
