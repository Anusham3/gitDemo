class Break1
{
public static void main ( String args[])
{
int i=1;
do
{
if (i%7==0&&i%2==0&&i%4==0)
{
break;
}
System.out.println(i);
i++;
}
while(i<=100);
}
}

