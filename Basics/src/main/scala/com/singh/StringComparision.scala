package com.singh

object stringcomparision extends App {
    
  val list=List('a','b','c')
  val ll=list.map(x=>x).toSet
  val sList=List('a','b').toSet
  val result=list.filterNot(sList)
  result.foreach(println)
  
}