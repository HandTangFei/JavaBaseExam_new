package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {	List<Integer> lists = new ArrayList<Integer>() ;    //list             //定义List
    	List<Integer> lists_10 = new ArrayList<Integer>() ;          //实例化List
    	Map<Integer,List> num_num10 = new HashMap<Integer,List>();
    	int[] numbers = new int[50];
    	for (int i = 0; i < 50; i++) {
    		int num = (int)(Math.random() * 100);
    		lists.add(num);
    		lists_10.add(num/10);
		}
    	
    	for (int i = 0; i < lists_10.size(); i++) {
    		int key = lists_10.get(i);
			if(!num_num10.containsKey(key)){
				List<Integer> list_value = new ArrayList<Integer>();
				list_value.add(lists.get(i));
				num_num10.put(key, list_value);
			}else{
				num_num10.get(key).add(lists.get(i));
			}
		}
    	System.out.println(lists);
    	System.out.println(lists_10);
    	System.out.println(num_num10);

        
    }
}
