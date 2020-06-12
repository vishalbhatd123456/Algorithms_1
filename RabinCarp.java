//uses hashing to find a match between pattern & array of characters
//uses a rolling a hash function to recalculate 
public class RabinKarp {
	
	private final int prime = 3;
	
	public int search(char [] array, char[] pattern)
	{
		int n = array.length;
		int m = pattern.length;
		
		int lastCharacter = (n-m);
		long patternHash = calculateHash(pattern, m);
		long arrayHash = calculateHash(array,m);
		
		for(int i = 0;i <= lastCharacter; i++)
		{
			if(patternHash == arrayHash && match(array, pattern, i))
			{
				//brute force
				return i;
			}
			
			if(i < lastCharacter)
			{
				//recalculate the hash
				arrayHash = recalculateHash(arrayHash, array[i],array[i+m],m);
			}
		}
		return -1;
	}
	
	public boolean match(char[] array, char[] pattern, int index)
	{
		for(int i =0;i<pattern.length;i++)
		{
			if(array[index+i] != pattern[0])return false;
		}
		return true;
		
	}
	public long calculateHash(char[] text, int hashSize)
	{
		long hash = 0;
		for(int i =0;i<hashSize;i++)
		{
			hash+= charVal(text[i])*Math.pow(prime, i);
		}
		return hash;
		
	}
	public int charVal(char val)
	{
		//a - 1
		//b - 2
		//c - 3
		//d-4
		return val- 96; //ascii val
	}



public long recalculateHash(long oldHash, char oldChar, char newChar, int hashSize)
{
	long hash = oldHash - charVal(oldChar);
	hash = hash/prime;
	hash += charVal(newChar) * Math.pow(prime, hashSize-1);
	return hash;
}
}
