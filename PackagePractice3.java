import newPackage.SuperClass;

class SubClass extends SuperClass{

    void printDefInt(){
        System.out.println("Default Value is "+defInt);
    }

    void printProInt(){
        System.out.println("Default Value is "+proInt);
    }

}

public class PackagePractice3 {
    public static void main(String[] args) {
        
        SubClass sc  = new SubClass();
        sc.printProInt();
        sc.printDefInt();
    }
}
