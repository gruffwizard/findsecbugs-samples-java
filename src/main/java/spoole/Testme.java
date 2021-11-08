package spoole;

public class Testme {
  
  static class Data {
    
      String  data;
  }
  
  public int check(Data[] input) {
    
    for (int i = 0; i < input.length(); i++) {
    String data = input[i].data;
    for (int j = 0; i < 100; j++) {
        if (data != null) {
            return j;
        }
    }
      
    }
 
    return -1;
  }
}
