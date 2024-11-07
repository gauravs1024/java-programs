#include<stdio.h>
int main()
{int m,n,i,j,a[10],b[10],u[10],c;
j=0;
printf("ENTER NUMBER OF ELEMENTS IN SET A");
scanf("%d",&m);
printf("ENTER ELEMENTS IN SET A\n");
for(i=0;i<m;i++)
scanf("%d",&a[i]);
printf("ENTER NUMBER OF ELEMENTS IN SET B");
scanf("%d",&n);
printf("ENTER ELEMENTS IN SET B\n");
for(i=0;i<n;i++)
scanf("%d",&b[i]);
//printf("copying the elememts\n");
for(i=0;i<m;i++)
{u[j]=a[i];
j++;
}
for(i=0;i<n;i++)
{u[j]=b[i];
j++;
}
c=m+n;
for(i=0;i<c;i++)
{for(j=i+1;j<c;j++)
{if(u[i]==u[j])
{for(int k=j;k<c;k++)
{u[k]=u[k+1];
}j--;
c--;
}
}}
printf("UNION OF SETS \n");
for(i=0;i<c;i++)
printf("%d",u[i]);
}




