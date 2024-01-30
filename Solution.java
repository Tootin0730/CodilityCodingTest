class Solution {
    public int solution(String S) {    
      int result = 0;    
      char[] charArray=S.toCharArray();
      char[] stack=new char[charArray.length];      
      int stackSize=0;

      for(int i=0;i<charArray.length;i++){
          if(charArray[i]=='{' ||charArray[i]=='(' || charArray[i]=='['){                
              stack[stackSize++]=charArray[i];                                
          }else{
              if(stackSize==0){
               result=0;
               break;
              }
              char ch=stack[--stackSize];   
              if((charArray[i]=='}' && ch=='{') || (charArray[i]==']' && ch=='[') ||(charArray[i]==')' && ch=='(')){                     
                  continue;
              }else{
                  result=0;
                  break;
              }                   
          }
      }
      return stackSize==0?result:0;
  }
}