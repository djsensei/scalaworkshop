package org.scalaworkshop.examples

import java.util

//import org.junit.runner.RunWith
//import org.nd4j.api.linalg.DSL._
import org.nd4j.linalg.api.ndarray.INDArray
import org.nd4j.linalg.factory.Nd4j

/**
 * Created by daniel on 4/28/15.
 */
object scalaexample {

  def main (args: Array[String]): Unit = {
    val arr = Nd4j.create(5)
    println(util.Arrays.toString(arr.shape))
  }

}
