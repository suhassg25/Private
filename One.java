class One
{
public static void main(String [] args){
int sum=0;
for(int i=0;i<args.length;i++)
{
try
{sum+=Integer.parseInt(args[i]);
}
catch(Exception e)
{
System.out.println("Invalid input");
}
}
System.out.println(sum);
}}