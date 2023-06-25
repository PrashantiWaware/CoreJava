package NineteenAprilPattern;

public class FrequencyOccurence {

	public static void main(String[] args) {
		int a[]= {11,22,11,33,33,11,44,55};
		for(int i=0;i<a.length;i++) {
			int cnt=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					cnt++;
					a[j]=0;
				}
			}
			if (a[i]!=0)
			System.out.println(a[i]+":"+cnt);
		}

	}

}
