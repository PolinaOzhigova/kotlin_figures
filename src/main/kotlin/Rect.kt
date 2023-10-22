class Rect(var x: Int, var y: Int, var width: Int, var height: Int) : Figure(0), Movable, Transforming {
    //var color: Int = -1 // при объявлении каждое поле нужно инициализировать

    //    lateinit var name: String // значение на момент определения неизвестно (только для объектных типов)
    //    // дополнительный конструктор вызывает основной
    //    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun area(): Float {
        return (width*height).toFloat()
    }

    override fun resize(zoom: Int) {
        height *= zoom
        width *= zoom
    }
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        if (centerX == x && centerY == y) return

        var d1 = 0
        var d2 = 0

        if (direction == RotateDirection.Clockwise) {
            d1 = y - centerY
            d2 = centerX - x

        }
        else if (direction == RotateDirection.CounterClockwise) {
            d1 = centerY - y
            d2 = x - centerX
        }

        x = d1 + centerX
        y = d2 + centerY

        var с = width
        width = height
        height = с
    }

    override fun toString(): String {
        return "x: $x, y: $y, width: $width, height: $height"
    }
}