/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S03_13;

/**
 *
 * @author Lenovo
 */
public class S3_13_Switch {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;
        
        switch(a){
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            default:
                System.out.println("No se ha encontrado la opcion");
                break;
                
        }
        
        String b= "pantalón";
        
        switch (b){
            case "polo":
                System.out.println("Estas comprando un polo");
                break;
            case "short":
                System.out.println("Estas comprando un short");
                break;
            case "Chompa":
                System.out.println("Estas comprando una chompa");
                break;
            default:
                System.out.println("No encontre la prenda");
                break;
        }
    }

}
