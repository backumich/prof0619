package homework.markerapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class Marker implements WritingTool {
    private final MarkerModel model;
    private final Color color;

    @Override
    public int getInkCapacity() {
        return model.getCapacity();
    }

    @Override
    public String getToolsColor() {
        return color.toString().toLowerCase();
    }
}
