package com.hadoop.x2_hdfs_java_api;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class MkdirUsingJavaApi {

	public static void main(String[] args) throws IOException {
		String uri="hdfs://localhost:54310/fromApi";
		Configuration conf=new Configuration();
		FileSystem fs=FileSystem.get(URI.create(uri),conf);
		boolean result=fs.mkdirs(new Path(uri));
		System.out.println(" directory created or not   " +result);

	}

}
