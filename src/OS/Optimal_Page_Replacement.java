package OS;

import java.util.Scanner;

public class Optimal_Page_Replacement {
	public static void main(String[] args){
		int [] pagelist={0,2,1,6,4,0,1,0,3,1,2,1};
		int [] time;
		time=new int[4];
		float n=11;
		Scanner in = new Scanner(System.in);
		time[0]=pagelist[0];
		time[1]=pagelist[1];
		time[2]=pagelist[2];
		time[3]=pagelist[3];
		float pagefault=4;
		int index=0;
		for(int i=4;i<n;i++)
		{
			int count=0;
			
			for(int j=0;j<4;j++)
			{
				if(pagelist[i]!=time[j])
				{
					count++;			
				}
				else
				{
					//time[j]=pagelist[i];
				//	System.out.println(time[j]);
					break;
				}
			}
			if(count==4)
			{
				pagefault++;
				int [] freq;
				freq=new int[4];
				for(int k=0;k<4;k++)
					freq[k]=0;
				for(int k=0;k<4;k++)
				{
					for(int l=i+1;l<n;l++)
					{
						if(time[k]==pagelist[l])
							freq[k]=freq[k]+1;
					}
				}
				int min=freq[0];
				int ind=0;
				for(int k=0;k<4;k++)
				{
					if(min>freq[k])
					{
						ind=k;
						min=freq[k];
					}
				}
				time[ind]=pagelist[i];
				System.out.println(pagefault);
			}
			
		}
		System.out.println(pagefault/(n+1));
		
	}
	
}