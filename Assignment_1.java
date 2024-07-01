// 1. How to create a class, object, method and its signature
class ClassCreateObjectMethod{
    void Method1(){
        System.out.println("this is add method from the ClassCreateObjectMethod class");
    }
}


// 2. Write a program to print your name.
class PrintNameProgram{
    void PrintName(){
        System.out.println("My Name Is Vikas");
    }
}

//3.Write a program for a Single line comment, multi-line and documentation comments
class Comments{
    void SingleLineComment(){
        System.out.println("This used for Single line comments:'//' ");
    }
    void MultiLineComment(){
        System.out.println("This used for Multi line comments:'/* ---*/' ");
    }
}
//4. Define variables for different Data Types int, Boolean, char, float, double and print on the Console
class DataTypes{
    void datatypes(){
        int num = 10;
        boolean  bool = true;
        char ch = 'A';
        float deci = 3;
        double largedeci = 3.33;
        System.out.println("integer:"+num+"\n"+
                          "char:"+ch+"\n"+
                          "float:"+deci+"\n"+
                          "double:"+largedeci+"\n"
                          );

    }
}

/*5.Define the local and Global variables with the same name and print both variables and
understand the scope of the variables*/

class LocalGlobalVariables{
    int Num = 10;
    void ScopeVariable_1(){
        int Num2 = 20;
        System.out.println("Global Variable:"+Num+"\n"+"Local VAriable:"+Num2);
    }
    void ScopeVariable_2(){
        int Num3 = 30;
    }
}

//6. Write a function to print your name and call the function from main method
class FunctionPrintName{
   void functionPrint(){
    System.out.println("Vikas");
   }
}


class Assignment_1{
    public static void main(String args[]){
        
        //Question 1 Object Creation
        ClassCreateObjectMethod obj = new ClassCreateObjectMethod();
        obj.Method1();

        //Question 2 Ojbect Creation 
        PrintNameProgram obj2 = new PrintNameProgram();
        obj2.PrintName();

        //Question 3 Ojbect Creation 
        Comments obj3 = new Comments();
        obj3.SingleLineComment();
        obj3.MultiLineComment();

        //Question 4 Ojbect Creation 
        DataTypes obj4 = new DataTypes();
        obj4.datatypes();
        
        //Question 5 Ojbect Creation 
        LocalGlobalVariables obj5  = new LocalGlobalVariables();
        obj5.ScopeVariable_1();

        //Question 5 Ojbect Creation 
        FunctionPrintName obj6 = new FunctionPrintName();
        obj6.functionPrint();

    }
}