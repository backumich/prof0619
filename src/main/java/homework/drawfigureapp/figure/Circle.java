package homework.drawfigureapp.figure;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Circle extends Oval implements Figure {
    private double radius;

    private Circle(Point point, double radius) {
        super.setCenter(point);
        super.setHeight(radius * 2);
        super.setWidth(radius * 2);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        super.setHeight(radius * 2);
        super.setWidth(radius * 2);
        this.radius = radius;
    }

    @Override
    public void setHeight(double height) {
        radius = height / 2;
    }

    @Override
    public void setWidth(double width) {
        radius = width / 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getWidth() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" +
                "radius=" + radius + ", " +
                "center=" + super.getCenter() +
                ")";
    }

    public static class CircleBuilder {
        private Circle circle;

        public CircleBuilder() {
            circle = new Circle();
        }

        public CircleBuilder withCenter(Point point) {
            circle.setCenter(point);
            return this;
        }

        public CircleBuilder withRadius(double radius) {
            circle.setRadius(radius);
            return this;
        }

        public Circle build() {
            return new Circle(circle.getCenter(), circle.getRadius());
        }
    }
}
