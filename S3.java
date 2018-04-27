package chen.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class S3 {
		  
	    private static int MAX=6;  
	    private static double[][] result = null;
	    public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        double[][] r = printProbabilityOfDice(n);
//	        System.out.println(result);
	        System.out.print("[");
	        for(int i = 0; i < r.length; i++) {
	        	BigDecimal r0 = new BigDecimal(r[i][1]);
	        	r0 = r0.setScale(5,BigDecimal.ROUND_HALF_UP);
	        	System.out.print("["+(int)r[i][0]+", "+r0+"]");
	        	if(i == r.length-1)
	        		System.out.print("");
	        	else 
	        		System.out.print(",");        		
	        }
	        System.out.println("]");
	    }  
	  
	    public static double[][] printProbabilityOfDice(int n){  
	        if(n<1){  
	            return result;  
	        }  
	        double total=Math.pow(MAX, n);   
	        int len=n*MAX-n*1+1;//the sum of n dices is from n*1 to n*MAX  
	        result = new double[len][2];
	        int[] times=new int[len];  
	        for(int i=1;i<=MAX;i++){//initial the first dice.  
	            probabilityOfDice(n,i,n,0,times);//count the times of each possible sum  
	        }  
	        for(int i=0;i<len;i++){  
	        	result[i][0] = i+n;
	        	result[i][1] = times[i]/total; 
	        }  
	        return result;
	          
	    }  
	    public static void probabilityOfDice(int n,int curDiceValue,int numOfDices,int curSum,int[] times){  
	        if(numOfDices==1){  
	            int sum=curSum+curDiceValue;  
	            times[sum-n]++;//n*1 to n*MAX <---> 0 to len  
	        }else{  
	            int sum=curSum+curDiceValue;  
	            for(int i=1;i<=MAX;i++){  
	                probabilityOfDice(n,i,numOfDices-1,sum,times);  
	            }  
	        }  
	    }  
	      
	}  
