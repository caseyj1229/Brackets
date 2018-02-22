import java.util.Stack;

public class Brackets {
    public static int solution(String S){
        char[] charString = S.toCharArray();
        Stack<Character> brackets = new Stack<Character>();



        for(int i = charString.length-1; i >= 0; i--){
            //If a closed bracket, push onto stack
            if(charString[i] == '}' || charString[i] == ')' || charString[i] == ']'){
                brackets.push(charString[i]);
            }

            //If open bracket and no closed bracket exists, return 0
            if(charString[i] == '{' || charString[i] == '(' || charString[i] == '['){
                if(brackets.isEmpty()){
                    return 0;
                }
            }

            //If { character on top of stack must be }
            if(charString[i] == '{'){
                if(brackets.pop() != '}'){
                    return 0;
                }
            }//If ( character on top of stack must be )
            else if(charString[i] == '('){
                if(brackets.pop() != ')'){
                    return 0;
                }
            }//If [ character on top of stack must be ]
            else if(charString[i] == '['){
                if(brackets.pop() != ']'){
                    return 0;
                }
            }
            else{
                continue;
            }
        }

        if(brackets.isEmpty()) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
