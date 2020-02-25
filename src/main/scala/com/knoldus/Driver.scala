object Driver extends App {
  val rectangleLength= 4
  val rectangleBreadth= 3
  val squareSideLength= 5
  val rectangleObj= new Rectangle(rectangleLength,rectangleBreadth)
  println(rectangleObj.area)

  val squareObj= new Square(squareSideLength)
  println(squareObj.area)

}
