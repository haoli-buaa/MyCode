package com.google.code.guava;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

public class SetOperation {
	public static void main(String[] args) {
		// 集合操作
		Set<String> a = new HashSet<String>();
		a.add("a");
		a.add("d");
		Set<String> b = new HashSet<String>();
		b.add("a");
		b.add("b");
		b.add("c");
		// 交集
		Set<String> inter = Sets.intersection(a, b);
		System.out.println(inter.toString());
		// 并集
		Set<String> union = Sets.union(a, b);
		System.out.println(union.toString());
		// 差集
		Set<String> diffa = Sets.difference(a, b);
		System.out.println(diffa.toString());
		Set<String> diffb = Sets.difference(b, a);
		System.out.println(diffb.toString());
	}
}
