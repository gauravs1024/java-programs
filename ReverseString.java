class ReverseString{
    
   
    public static void main(String []args){
       ReverseString obj=new ReverseString();
        String str="i.am.mayank.badal";
        char[] arr= str.toCharArray();
        int end=str.length(),start=0;
        for(int i=str.length()-1;i>=0;i--){
            if(arr[i]=='.'){
                start=i+1;
                obj.disp(start,end,arr);
                System.out.printf(".");
                end=start-1;
            }
            else if(i==0){
                start=0;
                  obj.disp(start,end,arr);
            }

        //System.out.println(arr[i]);
        //System.out.println(arr);
        }
        
    }


    void disp(int start, int end,char[] arr){
        int j;
        for(j=start;j<end;j++){
            System.out.print(arr[j]);
        }
    }
}