
class Main{

    public static void main(String [] args){

        int[] stack = testStack();
        for (int i : stack) {
            System.out.println(i);
        }
    }
 
    
    public static int[] testStack(){

        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.push(5);
        stack.pop();
        stack.push(6);
        stack.pop();
        stack.push(7);
        stack.pop();

        return stack.getStack();
    }




    /**
     * Innerface Stack
     */
    public interface StackInterFace {
    
        public boolean push (int item); // add item to stack
        public int pop();       // remove the last item and push back 
        public void stackIsFull();      // when stack is full call
    }

    public static class Stack implements StackInterFace {

        private int length = 0; // length of stack
        

        private int[] stack;
        private int top = -1;


        // constactor
        public Stack (int length ){
            this.length = length;
            stack = new int[length];
        }

        //gettr for stack
        public int[] getStack(){
            return stack;
        }


        @Override
        public boolean push(int item) {
            if (top >= length-1 ){
                stackIsFull();
                return false;
            }
            top++;
            stack[top] = item;
            return true;
        }

        @Override
        public int pop() {
            if (top==-1){
                return -1;
            }
            int item = stack[top];
            stack[top] = 0;
            top--;
            return item;// first return the top and then  (top -1 )
        }

        @Override
        public void stackIsFull() {
            System.err.println("Stack is full.");
        }

    }
}
