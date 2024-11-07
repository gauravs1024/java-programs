class ThreadExampleDryRun{
    public static void method() throws Exception{
       try{
        throw new Exception();
       }
       finally{
        System.out.println("finally");
       }
    }

    
public static void main(String args[]) {
//float[]=new float(3);  X
// float f1[]=new float[]; X
 float[] f2=new float[3];
float f3[]=new float[3];
float f4[]={1.0f,2.0f,2.0f};
float f5[]=new float[]{1.0f,2.0f,3.0f};
String str1="hello";
String str2="hello";
String str3=new String("hello");

try {
method();
}

catch (Exception e) {

System.out.print("exception ");

}

System.out.print(str1==str2);
System.out.print(str1==str3);

}
}





