class Sample
{
public static void main(String[] args)
{
String str= "JAVA";
String replace= " ";
for(int i= str.length()-1; i>=0; i--)
{
replace= replace+ str.charAt(i);
}
if(str.equals(replace))
{
System.out.println("its pallindrome");
}
else
{
System.out.println("its not a pallindrome"):
}
}
}