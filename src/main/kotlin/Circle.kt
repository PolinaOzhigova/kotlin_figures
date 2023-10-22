import kotlin.math.PI

class Circle(var x: Int, var y: Int, var radius: Int) : Figure(0), Transforming, Movable {
    override fun area(): Float {
        return (radius * radius * PI).toFloat();
    }
    override fun move(dx: Int, dy: Int) {
        x += dx; y += dy
    }

    override fun resize(zoom: Int) {
        radius *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val d1 = x - centerX
        val d2 = y - centerY

        x = centerX
        y = centerY

        if (direction == RotateDirection.Clockwise) {
            x += d2
            y -= d1
        } else if (direction == RotateDirection.CounterClockwise){
            x -= d2
            y += d1
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, radius: $radius"
    }
}