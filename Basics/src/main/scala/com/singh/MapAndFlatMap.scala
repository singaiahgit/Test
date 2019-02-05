package com.singh

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MapAndFlatMap extends App{
  
  val conf=new SparkConf().setMaster("local[*]").setAppName("MapAndFlatMap")
  val sc=new SparkContext(conf)
  val file=sc.textFile("C:\\Users\\mallikarjunarao\\Desktop\\input.txt")
  val res=file.map(x=>x.split(" ").toList)
  for(result<-res){
    println(result)
  }
  /*val res1=file.flatMap(x=>x.split(" ").toList)
  res1.foreach(println)*/
  
}