package com.bridgelabz.Function_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Test{
public static void main(String[] args)
{
	public <T> List<T> fromArrayToList(T[] a) {   
	    return Arrays.stream(a).collect(Collectors.toList());
	}
}