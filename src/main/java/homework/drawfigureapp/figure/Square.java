package homework.drawfigureapp.figure;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Square extends Rectangle implements Figure {
    private Square(Point point, double width) {
        super.setPoint(point);
        setWidth(width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" +
                "width=" + super.getWidth() + ", " +
                "leftCornerPoint=" + super.getPoint() +
                ")";
    }


    public static class SquareBuilder {
        private Square square;

        public SquareBuilder() {
            square = new Square();
        }

        public SquareBuilder withLeftCorner(Point point) {
            this.square.setPoint(point);
            return this;
        }

        public SquareBuilder withWidth(double width) {
            square.setWidth(width);
            square.setHeight(width);
            return this;
        }

        public Square build() {
            return new Square(square.getPoint(), square.getWidth());
        }
    }
}
