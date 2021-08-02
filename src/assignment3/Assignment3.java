
package assignment3;

import java.util.Iterator;
import java.util.LinkedList;



public class Assignment3 {
    

  
    public static void main(String[] args) {
        LinkedList assignment3 = new LinkedList();
        assignment3.add("ALice");
        assignment3.add("Michael");
        assignment3.add("Ferrari");
        assignment3.add("Eunice");
        assignment3.add("Fred");
        assignment3.add("Gideon");
        assignment3.add("Eunifred");
        
        assignment3.addLast("Sedem");
        assignment3.removeFirst();
        assignment3.clear();
        
        
        System.out.println(assignment3.getClass());
        Iterator it = assignment3.iterator();
        
        
        // TODO code application logic here
    }
    
}
