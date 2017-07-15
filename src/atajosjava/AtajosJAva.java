/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atajosjava;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author andre
 */
public class AtajosJAva {
     
    // metodo para haccer las validaciones
    public String Validar(LinkedList<String> variables){  
      Iterator<String> it = variables.iterator();
      String res = ""; 
      while(it.hasNext()){
          String p = it.next();
         res+="if ("+p+"== null) { throw new Exception(\""+p+" No puede Ser nulo\"); } \n";
    }
      return res;
    }
    
    public String Setter(LinkedList<String> variables){  
      Iterator<String> it = variables.iterator();
      String res = ""; 
      while(it.hasNext()){
          String p = it.next();
         res+="public void set"+p+"(String "+p+") throws Exception {\n" +
"        if ("+p+" == null) { throw new Exception(\"EL "+p+" No puede ser nulo\"); }\n" +
"        else{\n" +
"        this."+p+" = "+p+";\n" +
"        }\n" +
"    }";
    }
      return res;
    }
    
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        AtajosJAva Atajos= new AtajosJAva();
        LinkedList<String> variables = new LinkedList<String>();
        variables.add("id");
        variables.add("nombre");
        variables.add("apellidos");
        variables.add("correo");
        variables.add("Sexo");
        variables.add("tipo");
        
        System.out.println(Atajos.Validar(variables));
        System.out.println("\n\n\n\n");
        System.out.println(Atajos.Setter(variables));
        
        
    }
    
}
