package AlgorithmPrograms;

public class Permutation {

	public static String swapString(String a, int i, int j) 
	{  
        char[] c =a.toCharArray();  
        char ch;  
        ch = c[i];  
        c[i] = c[j];  
        c[j] = ch;  
        return String.valueOf(c);  
    }  
      
    public static void main(String[] args)  
    {  
        String str = "MAMA";  
        int len = str.length();  
        System.out.println("Permutations for the given string : ");  
        generatePermutation(str, 0, len);  
    }  
      
    public static void generatePermutation(String str, int start, int end)  
    {   
        if (start == end-1)  
            System.out.println(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                str = swapString(str,start,i);     
                generatePermutation(str,start+1,end);    
                str = swapString(str,start,i);  
            }  
        }  
    }

	}


