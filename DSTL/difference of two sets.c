  #include<stdio.h>
int main()
  { 
int n1,n2,m=0,i,j,l,k=0;
int a[10];
int b[10];
int c[10];	
int d[10];
printf("enter the no. of element in set 1\n");
scanf("%d",&n1);
printf("enter the element\n");
for(i=0;i<n1;i++)
scanf("%d",&a[i]);
printf("enter the no. of element in set 2\n");
scanf("%d",&n2);
printf("enter the element\n");
for(i=0;i<n2;i++)
scanf("%d",&b[i]); 
for(i=0;i<n1;i++)
     {
for(j=0;j<n2;j++)
        {
if(b[j]==a[i])
	break;
	}
	if(j==n2)
	      {
	for(i=0;i<k;i++)
	{
						if(c[i]==a[j])
		break;
		}
		if(l==k)
		{
		c[k]=a[i];
		k++;
		}
	         }
	 } 
	for(i=0;i<n2;i++)
	 {
	for(j=0;j<n1;j++)
{
	if(b[i]==a[j])
	break;
	 }
	if(j==n1)
                    {
	for(l=0;l<m;l++)
	          {
	if(d[l]==b[i])
	break;
	 }
	if(l==m)
	   {
	d[m]=b[i];
	m++;
	   }
                        }
	 }
	printf("Diffrence of A-B is \n");
	for(i=0;i<k;i++)
{			 {
	printf("%d",c[i]);
	 }
	printf("\n");
	printf("Diffrence of B-A is \n");
	for(i=0;i<m;i++)
	 {
	printf("%d",d[i]);
	 }
} }
