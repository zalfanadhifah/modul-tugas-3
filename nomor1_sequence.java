package modul3_tugas;

import java.util.Scanner;
public class nomor1_sequence {
     public static void main(String[] args) {
        System.out.println("******* SEQUINTIAL SEARCH *****"+"\n" );
        String data[] = {"Galileo" ,"Archimedes","Alkhawarizmi","Aljabar" , "Zalfa Nadhifah" , "Tesla" }; 
        String key;
       
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan data yang akan dicari: ");
        key = input.nextLine();
            
        
        System.out.println("Isi Data adalah");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
            System.out.println("");
            System.out.println("");
         for(int i = 0; i < data.length; i++){
            if(key.equalsIgnoreCase(data[i])){
                System.out.println("Data "+key+" berada pada index ke "+i);
                break;
            }
        }
        System.out.print("\n");
        System.out.println("Zalfa Nadhifah");
    }
}


