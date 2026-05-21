import java.util.*;
class BalancedParantheses {
    static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String exp = sc.next();

        if(isBalanced(exp)){
            System.out.println("Balanced Parantheses");
        }
        else {
            System.out.println("Not a balanced parantheses");
        }
    }
}