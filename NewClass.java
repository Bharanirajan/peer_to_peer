/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastversion;


public class NewClass {
    public static void main(String args[])
    {
        NewClass nc=new NewClass();
        nc.BinaryToDecimal();
    }
    void BinaryToDecimal()
    {
        String binary1="0000101000000000";
        String binary2;
        int decimal=0;
        int power=0;
        int t =binary1.length()-1;
        
        for(int i=t;i>=0;i--)
        {
            System.out.print(binary1.charAt(i));
            int tmp=Integer.parseInt(String.valueOf((binary1.charAt(i))));
                decimal+=tmp*Math.pow(2,power);
                
                power++;
            
        }
//        int binary=Integer.parseInt(binary1);
//        int decimal=0;
//        int power=0;
//        while(true)
//        {
//            if(binary==0)
//                break;
//            else{
//                int tmp=binary%10;
//                decimal+=tmp*Math.pow(2,power);
//                binary=binary/10;
//                power++;
//            }
//        }
        System.out.println("decimal"+decimal);
    }
}
