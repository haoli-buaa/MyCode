package com.google.code.guava;

import java.util.*;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;

public class Immutable {
	public static void main(String[] args) {
		// java核心类库中的集合类，只读实际可更改
		List<String> list = new ArrayList<String>();
		list.add("a");
		//更像一面镜子，无法更改镜子中的影像，但更改物体，影像也会随之改变
		List<String> rOnly = Collections.unmodifiableList(list);
		//rOnly.add("b");
		list.add("b");
		System.out.println(rOnly.toString());
		
		//guava
		List<String> imu = ImmutableList.of("a","b");
		imu.add("c");
	}
}
