import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
public static void main(String[] args) {
    ArrayList <String> arr = new ArrayList<String>();
    
    arr.add("be happy");
    arr.add("happy");
    arr.add("I am happy");
    arr.add("happy happy joy joy");
    arr.add("happy");
    
    System.out.println(countOccurrences(arr, "happy"));
    System.out.println(countOccurrences(arr, "joy"));
}
public static int countOccurrences(ArrayList arr, String str)
{

int count = 0;
 
   for(int i = 0; i < arr.size(); i++){
      if(arr.get(i).equals(str)){
          count++;
      }
   }
if(count == 0){
   return -1;
}
return count;
} 
public static void removeValue(ArrayList < Integer > aList, int val)
{
   int i;

   for(i = 0; i < aList.size(); i++)
   {
      if(aList.get(i) == val)
      {
         aList.remove(i);
      }
   }
   for(int item : aList)
{
   System.out.println(item);
}
   
}
public static int mystery(int n)
{
   if(n > 4)
   {
      return 1 + mystery(n - 1);
   }
   return n % 3;
}
public static int test(int n)
{
   if (n == 0)
      return 3;
   else
      return 2 * test(n - 1);
}
public static void propLong(int[] data){
for(int j = 0; j< data.length-1; j++){
    int m = j;
    for(int k = j+1; k< data.length; k++){
        if(data[k] < data[m]){
        m=k;
        System.out.println("value");
        }
    }
    int temp = data[m];
    data[m]=data[j];
    data[j]=temp;
    System.out.println("assign");
}
}
public static int binarySearch(int [] data, int target){
    int start = 0;
    int end = data.length-1;
    while (start<=end){
        int mid = (start+end)/2;
        System.out.println("test");

        if(target<data[mid]){
            end = mid-1;
        }
        else if (target>data[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
public static int hailstoneLength(int n){
int counter = 1;
if(n == 1){
    return counter;
}
while(n > 1){
    if (n%2 == 0){
        counter++;
        n = n/2;
    }
    else {
        counter++;
        n = (3 * n) + 1;
    }
    if (n == 1){
        return counter;
    }
}
return -1;
}
public static boolean recurMethod(String str)

{

if (str.length() <= 1)

{

return true;

}

else if (str.substring(0, 1).compareTo(str.substring(1, 2)) > 0)

{

return recurMethod(str.substring(1));

}

else

{

return false;

}

}
public static int methodOne(int a, int b)

{

int loopCount = 0;

for (int i = 0; i < a / b; i++)

{

loopCount++;

}

return loopCount;

}
public static int methodTwo(int a, int b)

{

int loopCount = 0;

int i = 0;

while (i < a)

{

loopCount++;

i += b;

}

return loopCount;

}
}
