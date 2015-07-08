package com.bran

import org.apache.hadoop.hive.ql.io.orc.OrcFile

/**
 * @author ${user.name}
 */
object App {
  
//  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    val path = args(0)
    val fs = new FileSystem
    val reader = org.apache.hadoop.hive.ql.io.orc.OrcFile.createReader(null, path)
  }

}
