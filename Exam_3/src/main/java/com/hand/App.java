package com.hand;

import java.util.Scanner;

/**
 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
 *�ӿ���̨��ȡ����,��������ĸ�ʽΪ��2015-07-26����ʽ.
 *(������ʹ��Calendar,Date,DateTime���еĺ���),�����������ʽ����:
 *����������:2015-01-01�����������Ϊ����ĵ�1��
 */
public class App 
{
    public static void main( String[] args )
    {
    	int outputDay = 0;
        System.out.println( "请输入日期：" );
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        int year = Integer.parseInt(read.substring(0, 4), 10);
        int month = Integer.parseInt(read.substring(5, 7), 10);
        int day = Integer.parseInt(read.substring(8, 10), 10);
        boolean isrn = false;
        if((year%4 ==0 && year%100 != 0) || year%400 ==0) {
        	isrn = true;
        }
        int howManyDay[] = {day,31,28,31,30,31,30,31,31,30,31,30,31}; 
        for (int i=0;i<month;i++){
        	outputDay += howManyDay[i];
        }
        if(isrn && month>2){
        	outputDay++;
        }
        System.out.println("你输入的日期为当年的第"+outputDay+"天");

    }
}
