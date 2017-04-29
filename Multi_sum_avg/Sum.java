public class Sum {
  public static void main(String[] args){
    int[] array = new int[5];
    array[0] = 4;
    array[1] = 6;
    array[2] = 3;
    array[3] = 22;
    array[4] = 3;
    System.out.println(summate(array));
  }
    public static int summate(int[] arr){
      int sum = arr[0];
      for(int i = 1; i < arr.length; i++){
        sum += arr[i];
      }
      return(sum);
    }
  }
