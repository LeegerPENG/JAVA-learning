package exercise;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[] array = new int[]{76,55,73,31,75,922,11,25,42,30,10,223,3243,5545,776,122,443,567};
		
		System.out.println("print original array:");
		printArray(array);
		for(int i=1;i<array.length-1;i++){//put the max number to the right
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("print sorted array");
		printArray(array);

	}

	private static void printArray(int[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			System.out.printf("%d ",array[i]);
			
		}
		System.out.println();
		
	}

}
