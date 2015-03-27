public class diamondshape {
	public static void main(String[] args) {
		
		int i=1;
		int numb=0;
		int space=3;
		while(i<=5) {
			int j = 0;
			int k=0;
			while(k <= space) {
				System.out.print(" ");
				k++;
			} 
			if(i <3 ){ 
				space = space-1;
				}
			else{
				space = space+1;
				}
			while(j <= numb) {
			System.out.print("*");
			j++;
		 }
		
		System.out.println();
		if(i<3) {
			numb = numb+2;
		} else {
		numb = numb-2;}
		i++;
	  } 
	}
}
