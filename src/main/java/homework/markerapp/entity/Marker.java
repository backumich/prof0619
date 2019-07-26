package homework.markerapp.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Marker implements WritingTool {
    private MarkerModel model;
    private Color color;

    @Override
    public int getInkCapacity() {
        return model.getCapacity();
    }

    @Override
    public String getToolsColor() {
        return color.toString().toLowerCase();
    }
}
