public class ObjectHasher extends Hasher
{
	public int hash(Object obj)
	{
		String x = obj.toString();
		int toReturn = 0;
		for (int i =0; i<x.length(); i ++)
		{
			toReturn = toReturn + (int)(x.charAt(i));
		}
		return toReturn;
	}
	public String getCoderName()
	{
		return "Maddie";
	}
	
	public static void main(String[] args)
	{
		ObjectHasher objhash = new ObjectHasher();
		int x = 5;
		System.out.println(objhash.hash(x));
	}
}
