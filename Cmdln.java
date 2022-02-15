public class Cmdln {
    public static void main(String[] args) throws Exception {
        System.out.println(" The number of arguments is " + args.length);
        String[] myarray;       //declaration of string array without size
        String[] strArray = new String[args.length];
         for(int i = 0; i<args.length; i++) {
      
         strArray[i]=args[i];
        
    } //end for
          System.out.println("This is from the second for.");
  for(int i = 0; i<args.length; i++) {
       
    System.out.println("args[" + i + "]: " + strArray[i]);  
  
  }    //end for 2  
        System.out.println("Hello, World!");
    }
}
