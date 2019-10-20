#include<cstdio>
#define maxn 1000100
int a[maxn],ansmin,ansmax,L,n;
 
int MIN(int a,int b)
{
	return a<b?a:b;
}
 
int MAX(int a,int b)
{
	return a>b?a:b;
}
 
void ansMIN()
{
	int i,min;
	ansmin=-1;
	for(i=0;i<n;++i)
	{
		min=MIN(a[i],L-a[i]);
		if(min>ansmin)
			ansmin=min;
	}
	printf("%d ",ansmin);
}
 
void ansMAX()
{
	int i,max;
	ansmax=-1;
	for(i=0;i<n;++i)
	{
		max=MAX(a[i],L-a[i]);
		if(max>ansmax)
			ansmax=max;
	}
	printf("%d\n",ansmax);
}
 
int main() {
    int i, t;
    scanf("%d", &t);
    while (t--) {
        scanf("%d%d", &L, &n);
        for (i = 0; i < n; ++i)
            scanf("%d", &a[i]);
        ansMIN();//mini time
        ansMAX();//max time
    }
    return 0;

}