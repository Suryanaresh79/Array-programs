//Demo  on two dimentional arrays
public class Demo10 {

	public static void main(String[] args) {
    int a[][] = {{1,2},{3,4}};
    int i,j;
    System.out.println("array elements are given below:");
    for(i=0; i<2; i++)
    {
    for(j=0; j<2; j++)
    {
    System.out.print(a[i][j]+ "\t");
    }
    System.out.println();  
    }
  }
}
