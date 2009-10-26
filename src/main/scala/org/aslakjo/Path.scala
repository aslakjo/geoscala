package org.aslakjo

class Path(val points:List[Point]) {
	def add(point:Point)={
	  new Path(point :: points)
	}
}
