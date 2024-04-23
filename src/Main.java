import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // FIVE METHODS OF STACK.
        // PUSH >>>> ADD ITEM.
        // POP >>>>> REMOVES ITEM.
        // PEEK >>>> TOP ITEM
        // isEMPTY >>>> bool
        // SEARCH

        // Creates an empty Stack.
        // Stack<E> stack = new Stack<E>();
        Stack<String> waitingList = new Stack<>();

        // PUSH: Pushes an item onto the top of this stack.
        waitingList.push("Jerry");
        waitingList.push("George");
        waitingList.push("Elaine");
        waitingList.push("Kramer");
        waitingList.push("Newman");

        for (String name : waitingList) {
            System.out.println(name);
        }

        // POP - Removes the object at the top of this stack AND returns that object as the value of this function.
        System.out.println(waitingList.pop()); // removes >>> newman and RETURNS OBJECT AS VALUE!!!!!!

        // PEEK - Looks at the object at the top of this stack WITHOUT REMOVING IT from the stack.
        System.out.println("--- PEEK OF THE STACK ----");
        System.out.println(waitingList.peek());

        // isEMPTY - Tests if this stack is empty.
        System.out.println("--- isEMPTY??? ----");
        System.out.println(waitingList.isEmpty()); // FALSE. waitingList isn't empty!

        /* - SEARCH RETURNS AN INT!!!!!!!!!!!!!!
         * Returns the 1-based position where an object is on this stack.
         * If the object o occurs as an item in this stack, this method returns the distance
         * from the top of the stack of the occurrence nearest the top of the stack;
         * the topmost item on the stack is considered to be at distance 1.
         * The equals method is used to compare o to the items in this stack.
         * Returns: the return value -1 indicates that the object is not on the stack.
         */
        System.out.println("--- SEARCH DISTANCE FROM THE TOP ----");
        System.out.println(waitingList.search("Jerry"));
        System.out.println(waitingList.search("Pedro")); // -1.The object is not on the stack.
    }
}