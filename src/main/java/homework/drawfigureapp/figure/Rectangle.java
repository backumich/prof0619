package homework.drawfigureapp.figure;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@NoArgsConstructor
public class Rectangle implements Figure {
    @Getter
    private double height;
    @Getter
    private double width;
    private Point leftCornerPoint;

    private Rectangle(Point point, double height, double width) {
        this.leftCornerPoint = point;
        this.height = height;
        this.width = width;
    }

    public void setPoint(Point point) {
        leftCornerPoint = point;
    }

    public Point getPoint() {
        return leftCornerPoint;
    }

    public static class RectangleBuilder {
        private Rectangle rectangle;

        public RectangleBuilder() {
            rectangle = new Rectangle();
        }

        public RectangleBuilder withLeftCorner(Point point) {
            rectangle.setPoint(point);
            return this;
        }

        public RectangleBuilder withHeight(double height) {
            rectangle.height = height;
            return this;
        }

        public RectangleBuilder withWidth(double width) {
            rectangle.width = width;
            return this;
        }

        public Rectangle build() {
            return new Rectangle(rectangle.leftCornerPoint, rectangle.height, rectangle.width);
        }
    }
}
