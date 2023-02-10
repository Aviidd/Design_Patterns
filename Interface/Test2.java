// import javax.swing.plaf.synth.SynthScrollBarUI;
public class Test2{
// in interface we can only write the abstract method
   interface avid{
      void print();
   }

   interface aviidd{
      void show();
   }

   class Prashant implements avid, aviidd{
      public void print(){
         System.out.println(" hello i am in avid interface");
      }
      
      public void show(){
         System.out.println(" hello i am in aviidd interface");
      }
      
      public static void main(String[] args) {
         Prashant ob = new Prashant();
         ob.show();
         ob.print();
      }
   }
}