public  static void  mergesort(int a[],int l,int h){
    int mid =(l+h)/2;

    if(l<h){

        mergesort(a,l,mid);
        mergesort(a,mid+1,h);
        merge(a,l,mid,h);
    }

}
public static void  merge(int ar[],int l,int mid,int h){
    int p1=l;
    int p2=mid+1;
  
   int temp[]=new int[h-l+1];


   int k=0;
   while(p1<=mid && p2<=h)
   {
       if(ar[p1]<ar[p2])
            temp[k++]=ar[p1++];
       else 
           temp[k++]=ar[p2++];
   }
    while (p1<=mid)
        {
            temp[k++]=ar[p1++];
        }
     while(p2<=h){
            temp[k++]=ar[p2++];
        }
    for(int i=0;i<k;i++){
            ar[i+l]=temp[i];
        }
   
   return ;

}

}
