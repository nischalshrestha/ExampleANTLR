package org.apache.spark.examples;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
/* SimpleApp.java */
import org.apache.spark.sql.SparkSession;

public class SimpleApp {
  public static void main(String[] args) {
    String logFile = "test.txt"; // Should be some file on your system
    SparkConf conf = new SparkConf().setMaster("local");
    SparkSession spark = SparkSession.builder().appName("Simple Application").config(conf).getOrCreate();
    Dataset<String> logData = spark.read().textFile(logFile).cache();

    long numAs = logData.filter(s -> s.contains("a")).count();
    long numBs = logData.filter(s -> s.contains("b")).count();

    System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);

    spark.stop();
  }
}