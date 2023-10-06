    public class MajorityEle  
    {  
        // a method the looks for the majority element  
        // in the array arr  
        public int findMajorEle(int inputArr[])  
        {  
            int s = inputArr.length;  
              
            int count = 0;  
              
            // outer loop picks the element  
            for(int i = 0 ; i < s; i++)  
            {  
                // the inner loop counts the occurrence   
                // of the element input[i]  
                for(int j = 0; j < s; j++)  
                {  
                    if(inputArr[i] == inputArr[j])  
                    {  
                        count = count + 1;  
                    }  
                }  
                  
                // if count is greater than half of s,  
                // we have our answer  
                if(count > s / 2)  
                {  
                    return inputArr[i];  
                }  
                  
                // resetting the count to 0  
                count = 0;  
            }  
              
            // if the control reaches here,  
            // then it means there is no majority element   
            // in the array arr  
            return -1;  
        }  
      
        // main method  
        public static void main(String[] argvs)   
        {  
            // creating an object of the class MajorityEle  
            MajorityEle obj = new MajorityEle();  
      
            // input array  
            int arr[] = {5, 1, 1, 1, 1, 1, 4, 9, 1, 0, 1, 2};  
              
            int s = arr.length;  
            System.out.println("For the input array.");  
            for(int i = 0; i < s; i++)  
            {  
                System.out.print(arr[i] + " ");  
            }  
            System.out.println();  
            int ans = obj.findMajorEle(arr);  
            if(ans != -1)  
            {  
               System.out.println("The majority element is: " + ans);   
            }  
            else  
            {  
                System.out.println("The majority element is not found.");   
            }  
              
              
            System.out.println("\n");  
              
            // another input array  
            int arr1[] = {47, 8, 1, 6, 3, 6, 90, 52, 78, 47, 47, 47};  
              
            s = arr1.length;  
            System.out.println("For the input array.");  
            for(int i = 0; i < s; i++)  
            {  
                System.out.print(arr1[i] + " ");  
            }  
            System.out.println();  
            ans = obj.findMajorEle(arr1);  
            if(ans != -1)  
            {  
               System.out.println("The majority element is: " + ans);   
            }  
            else  
            {  
                System.out.println("The majority element is not found.");   
            }  
              
              
        }  
      
    }  
