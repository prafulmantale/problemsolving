package problems;
import java.util.ArrayList;


public class SpiralOrderMatrix {
	
	public static ArrayList<Integer>  printSpiralArray(int [][]matrix){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(matrix == null){
			return list;
		}
		
		if(matrix.length == 0){
			return list;
		}
		
		
		int top = 0;
		int right = matrix[0].length - 1;
		int bottom = matrix.length - 1;
		int left = 0;
		
		while(top <= bottom && left <= right){
			
			for(int i = left; i <= right; i ++){				
				list.add(matrix[top][i]);				
			}
			top++;
			
			if(matrix.length - 1 == 0){
				break;
			}
			
			if(top > bottom){
				break;
			}
			
			if(matrix[top].length -1 != matrix[0].length - 1){
				return new ArrayList<Integer>();
			}
			
			for(int i = top ; i <= bottom; i ++){
				list.add(matrix[i][right]);				
			}
			
			right --;
			
			if(left > right )
				break;
			
			
			for(int i = right; i >=left; i --){
				list.add(matrix[bottom][i]);
			}
			
			bottom --;		
			
			if(matrix[0].length - 1 == 0){
				break;
			}
			
			
			for(int i = bottom; i >= top ; i -- ){
				list.add(matrix[i][left]);
			}
			
		
			left++;
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		int [][]arr = {{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}/*,
		{13,14,15,16}*/
		};
		
//		int [][]arr = {{1,2},{3,4}};
		
		ArrayList<Integer> list = printSpiralArray(arr);
		for(Integer i : list){
			System.out.print(i + " ");
		}
	}

}
