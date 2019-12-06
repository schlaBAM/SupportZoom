public class TestClass {

    public static void main(String[] args) {
        // Here are some objects we can store in our lists...
        
        ReadThis r1 = new ReadThis("position 1");
        
        ReadThis r2 = new ReadThis("position 2");
        
        ReadThis r3 = new ReadThis("position 3");
        
        ReadThis r4 = new ReadThis("position 4");
        
        ReadThis r5 = new ReadThis("position 5");

        
        
        /*
         We can manually create a linked list
         with two nodes like this:
        */

        ListNode listHead = new ListNode(r1, new ListNode(r2));
        
        ListNode.printNumNodes(); // <- best way to call a static method
//        listHead.printNumNodes(); // <- prints the same thing, but should avoid
//        listHead.next.printNumNodes(); // <- prints the same thing, but should avoid
        
        listHead.printListFromHere();
        
        
        ////
        // Now we can add nodes to the beginning, end, and middle:
        
        listHead = listHead.addNodeToBeginning(new ListNode(r3));
        
        listHead.addNodeToEnd(new ListNode(r4));
        
        listHead.addNodeAfterNode(new ListNode(r5), listHead);
        
        ListNode.printNumNodes();
        listHead.printListFromHere();

        //Concatenate test -
        System.out.println("\n-------- CONCAT TEST --------");
        System.out.println(listHead.concatenate());

        System.out.println("\n-------- LIST REVERSAL --------");
        listHead = listHead.reverse();
        System.out.println(listHead.concatenate());
        
        ////
        // Let's test removing nodes from the beginning, middle, and end:
        
        listHead = listHead.removeFirstNode();
        System.out.println(listHead.concatenate());

        System.out.println("Deleted position 3.");
        listHead = listHead.removeLastNode();
        listHead = listHead.reverse();
        System.out.println(listHead.concatenate());

        listHead = listHead.removeNode(listHead.next);
        listHead.printListFromHere();
        
        listHead = listHead.removeNode(listHead);
        listHead.printListFromHere();
        
        listHead = listHead.removeNode(listHead);
        System.out.println(listHead); // <- should be null!
    }

}