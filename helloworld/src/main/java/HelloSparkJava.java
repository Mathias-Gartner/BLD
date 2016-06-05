import org.apache.spark.SparkContext;
import org.apache.spark.rdd.RDD;

public class HelloSparkJava {

    private static void hello(){
        SparkContext context = new SparkContext("local", "HelloSpark");
        RDD<String> helloFile = context.textFile("resources/helloworld.txt", 0);
        String[] entries = (String[])helloFile.take(10);
        for (String entry : entries)
                System.out.println(entry);
        System.out.println(helloFile.count());
    }

    public static void main(String[] args){
        hello();
    }
}
