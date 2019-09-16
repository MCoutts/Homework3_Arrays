public class Arrays
{

      public static void main(String[]args)
      {
         // declaring the array       
         int [] numbers; 
         //memory needed for the array
         numbers = new int[8]; 
         
         //gave array first set of values 1 - 10
         for(int i = 0; i < 8; i++)
            {
               numbers[i] = i;
            }
         
        
          
           // here we check if the array has 10 and if it does we 
           // copy the array to another 
           // new array1
         int [] newNumbers1; 
         newNumbers1 = new int [10];
         
         //value were going to add to index[0] 
         int BeginPos = 0; 
         int beginVal = 90; 
           
         //value were going to add to index[6]  
         int MiddlePos = 6;
         int midValue  = 20;  
       
       //this copies the first half of the array to the newNumbers array
       //(array, atarting point, array copied to, spot its copied to, how many items)  
       System.arraycopy(numbers, 0, newNumbers1, 1, 5);
      
       //these are the int values put into place 
       newNumbers1[BeginPos] = beginVal; 
      
       newNumbers1[MiddlePos] = midValue; 
       
       // copying the second half of the array 
       System.arraycopy(numbers, 5, newNumbers1, 7, 3);
      
      
        //original print numbers    
        for(int t = 0; t < numbers.length; t++)
        {
          System.out.print(numbers[t] + ","); 
        }
        //splitting the array's up for clarity 
        System.out.print("\n" + "\n" ); 
         
        
        //copied array newNumbers1 Print
         for(int p = 0; p < newNumbers1.length; p++)
        {
          System.out.print(newNumbers1[p] + ", "); 
        }    
      }

}