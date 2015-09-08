package com.danielvaughan.example.sort

import org.scalatest.FlatSpec
import org.scalatest.Matchers._

class ScalaBubbleSortSpec extends FlatSpec {

  ScalaBubbleSort.sortIterative(Array(3, 2, 1)) should contain theSameElementsInOrderAs Array(1, 2, 3)

  ScalaBubbleSort.sortRecursive(List(3, 2, 1)) should contain theSameElementsInOrderAs List(1, 2, 3)

}
