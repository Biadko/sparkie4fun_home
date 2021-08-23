name := "sparkie4fun_home"

version := "0.1"


// scalaVersion := "2.13.6"
scalaVersion := "2.12.8"

// spark version
val sparkVersion = "3.1.2"


// https://mvnrepository.com/artifact/org.apache.spark/spark-core
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
)


