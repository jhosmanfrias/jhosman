package word_count;

import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;

public class counting {
 public static void main(String[] args) {

   String logFile = "/Applications/spark-1.2.0-bin-hadoop2.4/README.md"; 
   
  // new SparkConf().isExecutorStartupConf(arg0)
   
   SparkConf conf = new SparkConf().setAppName("Simple Application");
   JavaSparkContext sc = new JavaSparkContext(conf);
  
}
}