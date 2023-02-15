// this design principle states that keep it simple stupid, don't complete the function or method always use the effcient code requires at the particular time
public class Kiss {
    int a;
    int b;
    int c;
    int d;
    // this code is bad practice, it is very difficult to debug, and may the the debugger reach the programmer to get to know what is written, and doesn't follow the kiss principle 
    if(a){
        if(b){
            if(c){
                if(d){

                }
                else{

                }
            }
            else{

            }
        }
        else{

        }
        else{

        }
    }
    // the best way to write these types of problem is via using operators.
    if(a && b && c && d){
        // this code is a good practice and follow the kiss principle.
        System.out.println("i am in public class");
    }
}
