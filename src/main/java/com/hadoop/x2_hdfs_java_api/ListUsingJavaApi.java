package com.hadoop.x2_hdfs_java_api;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class ListUsingJavaApi {

	public static void main(String[] args) throws IOException {
	
		String uri="hdfs://localhost:54310/demo";
		Configuration conf=new Configuration();
		FileSystem fs= FileSystem.get(URI.create(uri),conf);
		FileStatus[] files=fs.listStatus(new Path(uri));
		for(FileStatus file:files)
		{
			System.out.println(file.getPath().getName());
		}
		

	}

}
