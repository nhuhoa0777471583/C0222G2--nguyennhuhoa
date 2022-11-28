import java.io.IOException;

public class OCA_1 {
    public void printFileContent() throws IOException {
        int a = 1;
      if(a == 1){
          throw new IOException();
      }
    }
}
 class TestOCA {
     public static void main(String[] args) {
         OCA_1 oca_1 = new OCA_1();
         try {
             oca_1.printFileContent();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}


