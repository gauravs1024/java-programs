import java.util.Scanner;

class W08_P4 {
   public static int removeDuplicates(int arr[]){

int i,j,size=arr.length;
  for(i=0;i<size-1;i++){
    for(j=i+1;j<size;j++){
      if(arr[i]==arr[j]){
        shift(arr,j,size);
      size--;
      }
    }
    
  }
  return size;

}

public static void shift(int arr[], int i,int size){

  int j;
  for(j=i;j<size-1;j++){
  
  arr[j]=arr[j+1];
  }
	

}

    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        int index = removeDuplicates(array);
        for (i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
