package constructor;

/**
 * Базовый класс для иерархии
 */
public class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Создаём новую фигуру смещённую на (dx, dy)
     *
     * @param dx смещение по x
     * @param dy смещение по y
     * @return новая фигура
     */
    public Shape copyTo(int dx, int dy) {
        return new Shape(x + dx, y + dy);
    }
}
