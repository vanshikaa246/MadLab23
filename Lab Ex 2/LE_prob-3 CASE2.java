/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother{
    void show(){
        System.out.println("Mother");
    }
}
class child extends Mother {
}
class Main {
 public static void main (String args[]){
 Mother m = new Mother ( );
 m.show( );
 Mother m1=new child();
 m1.show();
 child ch=new child ( ); 
 ch.show ( );
 }
}

