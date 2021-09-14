package com.test.training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) throws IOException {
		
		List<String> stream = Files.lines(Paths.get("StreamData2.txt"))
		.sorted()
		.filter(x->x.length()>5)
		.collect(Collectors.toList());
		stream.forEach(x->System.out.println(x));
		
		
				

	}

}


