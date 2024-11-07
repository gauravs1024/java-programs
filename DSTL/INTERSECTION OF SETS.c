
#include<stdio.h>
int main()
{
	int a[10],b[10],uni[10],n1,n2,k=0,i,j;
	printf("enter number of element of set 1\n");
	scanf("%d",&n1);
	printf("enter the element of set 1\n");
	for(i=0;i<n1;i++)
	scanf("%d",&a[i]);
	printf("enter number of element of set 2\n");
	scanf("%d",&n2);
	printf("enter the element of set 2\n");
	for(i=0;i<n2;i++)
	scanf("%d",&b[i]);
	
	for(i=0;i<n1;i++)
	{
		for(j=0;j<k;j++)
		{
		if(uni[j]==a[i])
		break;
		}
		if(j==k)
		{
			uni[k]=a[i];
			k++;
		}
	}
for(i=0;i<n2;i++)
	{
		for(j=0;j<k;j++)
		{
			if(uni[j]==b[i])
			break;
		}
		if(j==k)
		{
			uni[k]=b[i];
			k++;
		}
	}
	printf("union of set 1 and set 2 is:\n");
	for(i=0;i<k;i++)
	printf("\n%d",uni[i]);
}
