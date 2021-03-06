package com.google.code.guava;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;

public class Utility {
	public static void main(String[] args){
		//Multiset类：允许键重复的set
		//可应用场景：统计
		//case: 单词出现次数统计
		String str = "Guava is a set of core libraries that includes new collection types (such as multimap and multiset), immutable collections, a graph library, functional types, an in-memory cache, and APIs/utilities for concurrency, I/O, hashing, primitives, reflection, string processing, and much more!";
		Multiset<String> mset = HashMultiset.create();
		Set<String> set = new HashSet<String>();
		//String regex = "[^A-Za-z]+";
		String regex = "[ (/!,.-]+";
		String[] words = str.split(regex);
		for(int i = 0; i < words.length; i++){
			mset.add(words[i]);
			set.add(words[i]);
		}
		for(String tmp : set){
			System.out.printf("%s:%d\n", tmp, mset.count(tmp));
		}
		//Multimap类：允许键重复的map
		//应用场景：一对多关系
		//case：输出三国时 主公和武将、谋士的关系
		Multimap<String,String> mmap = HashMultimap.create();
		mmap.put("刘备", "关羽");
		mmap.put("刘备", "张飞");	
		mmap.put("曹操", "夏侯渊");
		mmap.put("曹操", "曹进");
		mmap.put("曹操", "郭嘉");
		mmap.put("曹操", "荀彧");
		mmap.put("吕布", "张辽");
		mmap.put("吕布", "陈宫");
		Set<String> lord = mmap.keySet();
		for(String name : lord){
			System.out.printf("%s:%s\n", name, mmap.get(name).toString());
		}
		//BiMap：双向Map，键值都不可以重复
		//应用场景：双向查找
		//case: 利用邮箱找用户名，利用用户名找邮箱
		BiMap<String,String> bm = HashBiMap.create();
		bm.put("abc", "abc@gmail.com");
		//bm.put("cde", "abc@gmail.com");
		System.out.println(bm.get("abc"));
		System.out.println(bm.inverse().get("abc@gmail.com"));
		//Table:存储表结构
		//case:成绩表
		Table<String, String, Integer> tab = HashBasedTable.create();
		tab.put("Arya", "Assasin", 100);
		tab.put("Daneleys", "Ride", 100);
		tab.put("Tyrion", "Negotiation", 100);
		Set<String> rows = tab.rowKeySet();
		Set<String> cols = tab.columnKeySet();
		System.out.printf("Name\tCourse\tScore\n");
		for(String row : rows){
			for(String col : cols)
				System.out.printf("%d\t",tab.get(row, col));
			System.out.println();
		}
	}
}