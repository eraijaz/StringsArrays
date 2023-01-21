
public class ArrayOutOfbounce {

	public static void main(String[] args) {
		int a[]=new int[3];
		for(int i=0;i<4;i++)  // i must be less than 3 coz 4 is outside limit
		{
			System.out.println(a[i]);
		}

	}

}/*disadvantages of arrays
can store only homogenous type of data
size of array is fixed  cannot grow or shrink
array demands contigous memory location that is continous spaces needed
collection api provides the solution to arraybounceexception
*/