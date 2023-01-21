
public class StringBufferCapavity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();
		sb.append("zfafcsdvasfaf");
		System.out.println(sb.capacity());//16 locations
		StringBuffer sb2=new StringBuffer();
		
		sb2.append("cdccfafafafd");
		System.out.println(sb2.capacity());
		
	
		
	
	}

}
