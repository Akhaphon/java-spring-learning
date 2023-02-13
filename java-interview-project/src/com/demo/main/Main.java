package com.demo.main;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello world Interview Java Project!");

		// new Main().hello();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello world");
		map.put(2, "Test2");
		map.put(3, "test3");
		iMap(map);
	}

	public void hello() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static <K, T> void iMap(Map<K, T> map) {
		ImmutableMap<K, T> immutableMap = ImmutableMap.copyOf(map);

		System.out.println(immutableMap);

	}

}
