package ashwin;

import java.util.LinkedList;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
    // ----------------------------------------
     //System.out.println(list);
     list.addFirst(40);//[40, 1, 2, 3, 4, 5]
     list.addFirst(11);//[11, 40, 1, 2, 3, 4, 5]
   //  -------------------------------------------
     list.addLast(100);//[11, 40, 1, 2, 3, 4, 5, 100]
   //----------------------------------------------
     list.pop();
   //----------------------------------------------
     list.push(23);
     list.push(21);//[21, 23, 40, 1, 2, 3, 4, 5, 100]
   //---------------------------------------------
     list.removeFirst();//[23, 40, 1, 2, 3, 4, 5, 100]
    
     list.removeLast();//[23, 40, 1, 2, 3, 4, 5]
     System.out.println(list);//[23, 40, 1, 2, 3, 4, 5]
	}

}
