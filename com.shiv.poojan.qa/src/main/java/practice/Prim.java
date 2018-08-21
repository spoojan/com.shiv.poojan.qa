package practice;

import static java.lang.System.*;
class Prime{
    void checkPrime(int... n){
       for(int num:n){ 
    int m=num/2;
           boolean flag=true;
           if(num<2){
               flag=false;
           }else{
    for(int i=2;i<=m;i++){
        if(num%i==0){
            flag=false; 
            break;
        } 
    }
           }
           if(flag){
               System.out.print(num+" ");
           }
       } 
        System.out.println();
 }
} 