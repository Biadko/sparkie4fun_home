
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession


object pvApp {



  def main(args: Array[String]) = {
    println("Hello, world")

    val conf = new SparkConf()
    conf.setMaster("local[*]")
    conf.setAppName("pvLogs")

    val sc = new SparkContext(conf)
    val logRDD = sc.textFile("data/data_input.log")


    //
    val resultRDD = logRDD
    // This method has been introduced in order to create only one file as a result
    resultRDD.coalesce(1)
    resultRDD.saveAsTextFile("data/result_step_1.txt")
    println(logRDD)
    }
}
