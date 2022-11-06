package LearnAbstract;

abstract class Abstract_without_AbstractMethod {
    //non- abstract method in abstract class
        public void fun(){
            System.out.println("This is an abstract class with no abstract method.");
        }

    //Final method in abstract class
        public final void methodFinal(){
                   System.out.println("This is a final method within an abstract class.");
           }
     //Static method in abstract class
        public static void getStatic(){
            System.out.println("This is a static method within an abstract class.");
        }
}
