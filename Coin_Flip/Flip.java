public class Flip {
  public static void main(String[] args){
    for(int i = 1; i <100; i++){
      String result = flipper();
      System.out.println("You received a " + result);
    }

  }
    public static String flipper(){
      double random = Math.random() * 100 + 1;
      String result;
        if(random >= 50){
          result = "Heads";
        }
        else{
          result = "Tails";
        }

      return(result);
    }
  }
