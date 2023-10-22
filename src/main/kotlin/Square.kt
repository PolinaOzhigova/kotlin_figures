class Square(var x: Int, var y: Int, var side: Int) :Figure(0), Transforming, Movable{
    override fun area(): Float {
        return (side * side).toFloat()
    }
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }
    override fun resize(zoom: Int) {
        side *= zoom
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
    }

    override fun toString(): String {
        return "x: $x, y: $y, side: $side"
    }
}