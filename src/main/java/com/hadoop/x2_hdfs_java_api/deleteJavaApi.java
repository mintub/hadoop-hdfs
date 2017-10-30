package com.hadoop.x2_hdfs_java_api;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class deleteJavaApi {

	public static void main(String[] args) throws IOException {
		String uri="hdfs://localhost:54310/fromApi/deckOfCard.txt";
		Configuration conf=new Configuration();
		FileSystem fs=FileSystem.get(URI.create(uri), conf);
		fs.delete(new Path(uri),true);

	}

}
