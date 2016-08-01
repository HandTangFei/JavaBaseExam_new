package com.hand;

import java.util.Scanner;

/**
 * ���ʵ�ֹ��ʸ������˰�������
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double suishou = 0;
        System.out.println( "请输入工资：" );
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        int salary = Integer.parseInt(read, 10)-3500;
        if(salary<0){suishou =0;}
        else if(salary<1500 ){
        	suishou = salary*0.03;
        }else if(salary<4500){
        	suishou = 1500*0.03+(salary-1500)*0.1;
        }else if(salary<9000){
        	suishou = 1500*0.03+3000*0.1+(salary-4500)*0.2;
        }else if(salary<35000){
        	suishou=1500*0.03+3000*0.1+4500*0.2+(salary-9000)*0.25;
        }else if(salary<55000){
        	suishou=1500*0.03+3000*0.1+4500*0.2+26000*0.25+(salary-35000)*0.3;
        }else if(salary<80000){
        	suishou=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(salary-55000)*0.35;
        }else{
        	suishou=1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(salary-80000)*0.45;
        }
        
        System.out.println("所需要缴纳的税费为："+suishou);
    }
}
