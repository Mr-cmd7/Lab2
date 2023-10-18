class Rectangle(var x1:Int, var y1:Int, var x2:Int, var y2:Int) {
    constructor(): this(0,0,0,0)

    fun calculateArea():Int{
        return (x2-x1)*(y2-y1)
    }
    override fun toString():String{
        return "Прямоугольник с координатами ($x1, $y1) и ($x2, $y2)"
    }
    init {
        if(x1>=x2||y1>=y2){
            throw IllegalArgumentException("Некорректные координаты прямоугольника.")
        }
    }
}