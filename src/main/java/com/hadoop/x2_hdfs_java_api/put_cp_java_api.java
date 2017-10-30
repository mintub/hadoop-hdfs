package com.hadoop.x2_hdfs_java_api;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class put_cp_java_api {

	public static void main(String[] args) throws IOException {
		String uri="hdfs://localhost:54310";
		String localpath="/home/biswas/Desktop/deckOfCard.txt";
		String hdfspath="hdfs://localhost:54310/fromApi";
		String hdfsto="hdfs://localhost:54310/netflix/data.csv";
		String localfrom="data/dataset.csv";
		Configuration conf=new Configuration();
		FileSystem fs=FileSystem.get(URI.create(uri),conf);
		fs.copyFromLocalFile(new Path(localpath), new Path(hdfspath));
		fs.copyToLocalFile(new Path(hdfsto), new Path(localfrom));

	}

}
