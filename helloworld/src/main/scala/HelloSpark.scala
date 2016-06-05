import org.apache.spark.SparkContext

class HelloSpark {
  def hello(): Unit ={
    val context = new SparkContext("local", "HelloSpark")
    val helloFile = context.textFile("resources/helloworld.txt")
    helloFile.take(10).foreach(println)
    println(helloFile.count())
  }
}

object HelloSpark {
  def main(args: Array[String]): Unit ={
    val helloSpark = new HelloSpark()
    helloSpark.hello()
  }
}