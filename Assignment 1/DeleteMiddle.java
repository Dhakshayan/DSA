import java.util.Stack;

public class DeleteMiddle {
    public Stack<Integer> deleting(Stack<Integer> st, int num){
        Stack<Integer> stn = new Stack<>();
        int middle = st.size()/2;
        for (int i= 0; i<middle;i++){
            stn.push(st.pop());
        }
        st.pop();
        while(!stn.isEmpty()){
            st.push(stn.pop());
        }
        return st;

    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        DeleteMiddle dm = new DeleteMiddle();
        dm.deleting(st,3);
        System.out.println(st);
        
    }
}
