package sec1;

public class Check08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
//		int total;
		int sum=0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
//			total+=array[i].length;
			
			for(int j=0; j<array[i].length; j++)
				sum += array[i][j];
		}
		
		avg = (double) sum/10;
//		avg = (double) sum/total;
				
		System.out.println("sum : " +sum);
		System.out.println("avg : " +avg);	
	}
}
