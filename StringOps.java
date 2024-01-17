public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     
    }

    public static String capVowelsLowRest (String string) {
        String neww= "";
        for(int i=0; i<string.length();i++){
            //add all upper case vowels
            if (string.charAt(i)=='A'||string.charAt(i)=='E'||string.charAt(i)=='I'||string.charAt(i)=='O'||string.charAt(i)=='U'){
                 neww+=(char)(string.charAt(i));
            }
            //add space
            else if ((int)string.charAt(i)==32){
                neww+=(char)(string.charAt(i));
            }
            //make all lowercase vowels upper
            else if (string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'){
                neww+=(char)(string.charAt(i)- 32);
            }
            //make all uppercase letter low
            else if (string.charAt(i)>=65&&string.charAt(i)<=90){
                neww+=(char)(string.charAt(i)+ 32);
            }
            //otherwise add as is
            else{
                neww+=(char)(string.charAt(i));  
            }
        }
        neww = (String)neww;
        return neww;
    }

   
    
    //provides the fist index of char that is not space/tab
    public static int firstNonSpace (String str){
        int start=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=32&&str.charAt(i)!=9){
                start = i;
                return start;
            }
        }
        return start;
    }
    //removes all the spaces/tabs bfore the 1st char
    public static String subsNoSpacebeg (String str){
        int start = firstNonSpace(str);
        String subs="";
        for(int i=start;i<str.length();i++){
           subs+= str.charAt(i);
        }
        return subs;
    }
    //create a subs with the first word all lowercap
    public static String firstWord (String string){
      int i=0;
      String str = subsNoSpacebeg(string);
      String neww="";
      //all words b4 first space lower case
      while (str.charAt(i)!=32&&str.charAt(i)!=9){
        if (str.charAt(i)>=65&&str.charAt(i)<=90){
            neww+=(char)(str.charAt(i)+ 32);
        } 
        else{
            neww+=str.charAt(i);
        }
        i++;
      }
      for (;i<str.length();i++){
        neww+=str.charAt(i);
      }
        return neww;
    }

    public static String camelCase (String string){
        String str = firstWord(string);
        String neww="";
        neww+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            //if its space dont add
            if(str.charAt(i)==9||str.charAt(i)==32){
            }
            //if the prev char is space so make this upper case
            else if (str.charAt(i-1)==9||str.charAt(i-1)==32){
                //checking if its lowercase
                if(str.charAt(i)>=97&&str.charAt(i)<=122){
                    neww+=(char)(str.charAt(i)- 32);
                }
                //keep upper if upper
                else if (str.charAt(i)>=65&&str.charAt(i)<=90){
                    neww+=(char)(str.charAt(i));
                }
            }
            //make lower case if not
            else if(str.charAt(i)>=65&&str.charAt(i)<=90){
                neww+=(char)(str.charAt(i)+ 32);
                }
            //add to new str
            else{
                neww+=str.charAt(i);    
                }
        }    
          return neww;
    }

    public static int[] allIndexOf (String string, char chr) {
        int [] arr = new int [howmany(string, chr)];
        int indexcount=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==chr){
                arr[indexcount]=i;
                indexcount++;   
            }
        }
        return arr;
    }

    public static int howmany (String str, char chr){
        int counter=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==chr){
                counter+=1;
            }
        }
        return counter;
    }

}
