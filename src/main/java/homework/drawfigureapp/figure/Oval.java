package homework.drawfigureapp.figure;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor

//todo: add getter to the fields
public class Oval implements Figure {
    private double height;
    private double width;
    private Point center;

    private Oval(Point center, double height, double width) {
        this.center = center;
        this.height = height;
        this.width = width;
    }

    public void setPoint(Point point) {
        center = point;
    }

    public Point getPoint() {
        return center;
    }

    public static class OvalBuilder{
        private Oval oval;

        public OvalBuilder() {
            oval = new Oval();
        }

        public OvalBuilder withCenter(Point point){
            oval.setPoint(point);
            return this;
        }

        public OvalBuilder withHeight(double height){
            oval.height = height;
            return this;
        }

        public OvalBuilder withWidth(double width){
            oval.width = width;
            return this;
        }

        public Oval build(){
            return new Oval(oval.center, oval.height, oval.width);
        }
    }
}
