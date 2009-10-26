package org.aslakjo

import org.scalatest._
import org.scalatest.matchers._

class Listing extends Spec with ShouldMatchers with BeforeAndAfter{
	describe("Listing"){
		it("should return paths"){
			var list = new Path(List(new Point("test"), new Point("neste")))
			list.points.length should be (2) 
		}
  
		it("should take new points"){
		  var list = new Path(List(new Point("test")))
		  var newList = list.add(new Point("last"))
    
		  newList.points.length should be (2)
		}
	}

}

