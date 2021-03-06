package sec1;

public class Array4 {

	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"}; 
        //5명의 3과목 점수 선언 jum[][] -> 2차원 배열 행(줄),열(칸)
        int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
        int hap = 0;
        float py = 0.0f;
        int[] tot = new int[3];
        float[] avg = new float[3];

		for(int i=0; i<3; i++) {
			avg[i]=(float) tot[i] / names.length;
		}
		
		System.out.println("************************************");		
		System.out.println("성명\t국어\t영어\t수학");
		System.out.println("************************************");

		for(int i=0; i<names.length;i++) {
			System.out.print(names[i]+"\t");	//이름 출력

			
			for(int j=0; j<3;j++) {
				System.out.print(jum[i][j]+"\t");
				tot[j]+=jum[i][j];
				hap+=jum[i][j];
			}
			System.out.println("");
		}
		
		for(int i=0; i<3; i++) {
			avg[i]=tot[i]/names.length;
		}
			
		py = hap/(names.length)/ 3.0f;
		
		System.out.println("************************************");
		System.out.print("과목총점 | ");
		for(int i=0; i<3; i++) {
			System.out.print(tot[i]+"\t");
		}
		
		System.out.println("");
		System.out.print("과목평균 | ");
		for(int i=0; i<3; i++) {
			System.out.print(avg[i]+"\t");
		}
		System.out.println("");
		System.out.println("************************************");
		System.out.println("전체총점 : "+hap+"\t전체평균 :"+py+"");
	}
}