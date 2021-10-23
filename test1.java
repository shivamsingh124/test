// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse-of-an-array-official/ojquestion
import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "");
    }
    System.out.println(sb);
  }
public static int[] inverse(int[] a){
    // write your code here
    int n=a.length;
   int val=a[0],idx=0;
    while(n>0){
        int tval=val,tidx=a[val];
        a[val]=idx;
        n--;
        val=tidx;
        idx=tval;
        System.out.println(tval+" "+tidx);
        display(a);
    }
    return a;
  }


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    // display(inv);
  }

}


// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-to-any-base-official/ojquestion

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     System.out.println(anybase(n,sourceBase,destBase));
     
   } 
   public static int anybase(int num, int src, int des ){
       int numb=decimal(num,src);
       return (base(numb,des));
    }
       public static int decimal(int num, int src){
           int res=0, pow=0;
           while(num>0){
               int rem=num%10;
               res+=rem*Math.pow(src,pow);
               num/=10;
               pow++;
           }
           return res;
       }
        public static int base(int num, int src ){
            int res=0,pos=1;
            while(num>0){
                int rem=num%src;
                res+=rem*pos;
                num/=src;
                pos*=10;
            }
            return res;
        }
  }


// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/any-base-multiplication-official/ojquestion

  import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int p=1;
    int sum1=0;
    while ( n2>0){
        int d2=n2%10;
        sum1 =getSum(b,sum1,p*( getProduct(b, n1, d2)));
        n2=n2/10;
        p=p*10;
        
    }
   // int d = getProduct(b, n1, n2);
    System.out.println(sum1);
 }

 public static int getProduct(int b, int n1, int d2){
     // write your code here
     int carry=0,p=1,sum=0,res=0;
     while(n1>0||carry>0){
         int dig=n1%10;
         sum=(d2*dig)+carry;
         n1=n1/10;
         carry=sum/b;
         res=res+(sum%b)*p;
         p*=10;
     }
     return res;
     
 }
 public static int getSum(int b, int n1, int n2){
       int res=0,pow=1,carry=0;
       
       while ( n1>0||n2>0||carry>0){
           int ans1= n1%10;
           int ans2= n2%10;
           int add=ans1+ans2+carry;
           res=res+(add%b)*pow;
           carry=add/b;
          n1= n1/10;
          n2= n2/10;
           pow*=10;
           
       }
    return res;   // write ur code here
   }

}


// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion



import java.io.*;
import java.util.*;

public class Main{


public static int binary(int num){
     int res=0,pos=1;
     while(num>0){
        int rem=num%2;
        res+=pos*rem;
        pos*=10;
        num/=2;
     }
     return res;
}
public static void main(String[] args) throws Exception {
    // write your code here
     
    Scanner sc = new Scanner ( System.in);
    int le = sc.nextInt();
    int arr[]= new int [le];
    //int idx=0;
    for ( int i=0 ; i < le ; i ++){
        arr[i]=sc.nextInt();
    }
    
    for ( int i=0;i<Math.pow(2,le);i++){
        int bin=binary(i);
        // System.out.println(bin);
        int length=le;
        int tbin=bin;
            int tn=le-1;
        while(length>0){
            int rem=tbin%10;
            System.out.print((rem==1)?arr[tn]+" ":"- ");
            tn--;
            tbin/=10;
            length--;
        }
        System.out.println();
    }
    // int d=(int)Math.pow(2,le);
    // for ( int i=0;i<d;i++){
    //     int temp=1,re=0,n=i;
    //      while(n>0){
    //       re=re+(n%2)*temp;
    //       n=n/2;
    //       temp*=10;}
    //      // System.out.println(re);
    
       
    //   String ans="";
    //   int bre = re;
    //   int idx=le-1,m=le-1;
    //   while(m>=0){
    //       int yes=bre%10;
    //       bre=bre/10;
        
    //     if ( yes==0){
    //         ans="-	"+ans;
    //     }
    //     else{
    //         ans=arr[idx]+"	"+ ans;
    //     }
    //     idx--;m--;
        
    // }
    // System.out.println(ans);
    // }
 
    }
    
}






// https://leetcode.com/problems/long-pressed-name/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // if (name.length() > typed.length()) {
    //   return false;
    // }

    // int i = 0;
    // int j = 0;

    // while (i < name.length() && j < typed.length()) {
    //   if (name.charAt(i) == typed.charAt(j)) {
    //     i++;
    //     j++;
    //   }
    //   else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
    //     j++;
    //   }
    //   else {
    //     return false;
    //   }
    // }

    // while (j < typed.length()) {
    //   if (name.charAt(i - 1) != typed.charAt(j)) {
    //     return false;
    //   }
    //   j++;
    // }

    // if (i < name.length()) {
    //   return false;
    // }
    // else {
    //   return true;
    // }
    
    
    if (name.length() > typed.length()) {
      return false;
    }

    int i = 0;
    int j = 0;
    int count1 = 1;
    int count2 = 1;

    for (; i < name.length() - 1 ; i++) {
      if (name.charAt(i) == name.charAt(i + 1)) {
        count1++;
      }
      else {
          int flag=0;
        for (; j < typed.length() - 1 ; j++) {
            flag=1;
          if (typed.charAt(j) == typed.charAt(j + 1)) {
            count2++;
          }
          else {
              System.out.println(i+" "+j);
                // System.out.println(count1 + " " + count2);
            if (count1 > count2 || name.charAt(i) != typed.charAt(j)) {
              return false;
            }
            else {
              count1 = 1;
              count2 = 1;
            }
              j++;
              break;
          }
        }
          if(flag==0)break;
      }
    }
    System.out.println(i+" "+j);
    if (name.charAt(i) != typed.charAt(j)) {
      return false;
    }
    if(j<typed.length()-1){
        while(j<=typed.length()-1){
            if(name.charAt(i) != typed.charAt(j))return false;
            j++;
        }
        
    }
        if(i<name.length()-1){
            while(i<=name.length()-1){
            if(name.charAt(i) != typed.charAt(j))return false;
            i++;
        }
            
        }
    return true;
    }
}


class Solution {
  
   
        public int check(String s1, String s2) {
        // String[] s1Arr = s1.split(" ");
        // String[] s2Arr = s2.split(" ");
            int flag=0;
            String ss1="",ss2="";
            for(int i=0;i<s1.length();i++){
                char c= s1.charAt(i);
                if(c==' '&& flag==0){
                    flag=1;
                    continue;
                }
                if(flag==1){
                    ss1+=c;
                }
            }
            for(int i=0;i<s2.length();i++){
                char c= s2.charAt(i);
                if(c==' '&& flag==0){
                    flag=1;
                    continue;
                }
                if(flag==1){
                    ss1+=c;
                }
            }
        return (ss1.compareTo(ss2) >0 )?1:(ss1.compareTo(ss2) ==0)?0:-1;
    }

    
    // public static void swap(ArrayList <String> s, int i, int j){
    //     String s1=s.get(i);
    //     s.set(i,s.get(j));
    //     s.set(j,s1);
    // }
    

    // https://leetcode.com/problems/reorder-data-in-log-files/submissions/
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String>letter=new ArrayList<String>();
        ArrayList<String>digit=new ArrayList<String>();
        for (int i=0;i<logs.length;i++){
            String temp = logs[i];
            int flag=0;
            for(int j=0;j<temp.length();j++){
                char c=temp.charAt(j);
                if(c==' '){
                    if('a'<=temp.charAt(j+1) && temp.charAt(j+1)<='z'){
                        letter.add(temp);
                    }
                    else{
                        digit.add(temp);
                    }
                    break;
                }
            }
        }

          int i, j;
         for (i = 0; i < letter.size()-1; i++)
         for (j = 0; j < letter.size()-i-1; j++)
         if (check(letter.get(j),letter.get(j+1))==1)   //>>
             // swap()
            Collections.swap(letter,j,j+1);
        // else if(check(letter.get(j),letter.get(j+1))==0){
        //     String[] s1Arr = letter.get(j).split(" ");
        //     String[] s2Arr = letter.get(j+1).split(" ");
        //        if ((s1Arr[0].compareTo(s2Arr[0]))>0)
        //             Collections.swap(letter,j,j+1);
        //        else
        //            Collections.swap(letter,j+1,j);
        // }

        for(int k=0;k<digit.size();k++)
            letter.add(digit.get(k));
        System.out.println(letter);
       
        String [] ans=new String[letter.size()];
        int k=0;
        for(int l=0;l<letter.size();l++){
            String s=letter.get(l);
            ans[k]=s;
            k++;
        }
        return ans;
    }
}

// https://classroom.pepcoding.com/resources/online-java-foundation/2d-arrays/wakanda-1-official/ojquestion

 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner ( System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
         int arr[][]=new int [n][m];
    for(int k=0;k<n;k++){
        for(int l=0;l<m;l++)
        {
            arr[k][l]=sc.nextInt();
        }
    }
    
        for ( int i=0;i<m; i++ ){
            if(i%2==0){
            for ( int j=0 ; j<n;j++){
                 System.out.println(arr[j][i]);
                
            }}
                
            else if(i%2!=0){
            for ( int j=n-1 ; j>=0;j--){
                
                System.out.println(arr[j][i]);
            
        }}
    }

}}



// https://classroom.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int a[]= new int [n];
for ( int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
int f=sc.nextInt();
int lo=0,hi=n-1,mid=0,floor=0,ceil=0;
while(lo<=hi){
    mid=(lo+hi)/2;
    if(f==a[mid]){
        ceil=floor=a[mid];
        break;
    }
    
    else if(f<a[mid]){
        hi=mid-1;
        ceil=a[mid];
        
    }
    else if(f>a[mid]){
        lo=mid+1;
        floor=a[mid];
    }
    
    
    
}
System.out.println(ceil+"
"+floor);



 }

}

