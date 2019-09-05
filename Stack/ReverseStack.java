/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author alsten
 */
class ReverseStack {
    private String input, output;
    
    public ReverseStack(String in){
        input = in;
    }
    
    public String doRev(){
        int maxSize = input.length();
        StackX st = new StackX(maxSize);
        
        for(int j = 0; j < maxSize; j++){
            st.push(input.charAt(j));
        }
        output = "";
        while(!st.isEmpty()){
            output += st.pop();
        }
        return output;
    }
}
