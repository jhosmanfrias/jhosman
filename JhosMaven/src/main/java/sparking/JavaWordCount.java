package sparking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.spark.api.java.*;
import org.apache.spark.api.java.function.*;
import org.apache.spark.SparkConf;
import scala.Tuple2;

public class JavaWordCount {
  public static void main(String[] args) {

    // create Spark context with Spark configuration
    JavaSparkContext sc = new JavaSparkContext(new SparkConf().setAppName("Spark Count").setMaster("spark://192.168.32.130:4712"));
    
    List<Integer> l = new ArrayList(5);
    for (int i = 0; i < 5; i++) {
      l.add(i);
    }

    long count = sc.parallelize(l).filter(i -> {
      double x = Math.random();
      double y = Math.random();
      return x*x + y*y < 1;
    }).count();
    System.out.println("Pi is roughly " + 4.0 * count / 5);


  }
}
