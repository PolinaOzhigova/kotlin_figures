fun main() {
    println("Square:")
    var square = Square(1,2,2)
    println("Изначальные координаты и размер: $square")

    square.rotate(RotateDirection.Clockwise, 2, -2)
    println("Поворот по часовой стрелке в точку (2, -2): $square")
    square = Square(1,2,2)
    square.rotate(RotateDirection.CounterClockwise, 2, -2)
    println("Поворот против часовой стрелке в точку (2, -2): $square")

    square.resize(5)
    println("Увеличение в 5 раз: $square")

    square.move(2, 7)
    println("Смещение на 2 по х и 7 по у: $square")



    println("Circle:")
    var circle = Circle(1,2,3)
    println("Изначальные координаты и размер: $circle")

    circle.rotate(RotateDirection.Clockwise, 2, -2)
    println("Поворот по часовой стрелке в точку (2, -2): $circle")
    circle = Circle(1,2,3)
    circle.rotate(RotateDirection.CounterClockwise, 2, -2)
    println("Поворот против часовой стрелке в точку (2, -2): $circle")

    circle.resize(5)
    println("Увеличение в 5 раз: $circle")

    circle.move(2, 7)
    println("Смещение на 2 по х и 7 по у: $circle")



    println("Rect:")
    var rect = Rect(2,3,5,3)
    println("Изначальные координаты и размер: $rect")

    rect.rotate(RotateDirection.Clockwise, 2, -2)
    println("Поворот по часовой стрелке в точку (2, -2): $rect")
    rect = Rect(2,3,5,3)
    rect.rotate(RotateDirection.CounterClockwise, 2, -2)
    println("Поворот против часовой стрелке в точку (2, -2): $rect")

    rect.resize(5)
    println("Увеличение в 5 раз: $rect")

    rect.move(2, 7)
    println("Смещение на 2 по х и 7 по у: $rect")
}