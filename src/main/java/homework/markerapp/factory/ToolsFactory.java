package homework.markerapp.factory;

import homework.markerapp.entity.*;
import homework.markerapp.exception.NoSuchToolException;

import java.util.Random;

public class ToolsFactory {
    private static ToolsFactory instance;
    private Color[] colors = Color.values();
    private MarkerModel[] markerModels = MarkerModel.values();

    private ToolsFactory() {
    }

    public static ToolsFactory getInstance(){
        if (instance == null){
            synchronized (ToolsFactory.class){
                if (instance == null){
                    instance = new ToolsFactory();
                }
            }
        }
        return instance;
    }

    public WritingTool getTool(ToolType type) throws NoSuchToolException {
        if (type == null){
            throw new IllegalArgumentException();
        }
        if (type == ToolType.MARKER) {
            Color color = colors[new Random().nextInt(colors.length)];
            MarkerModel model = markerModels[new Random().nextInt(markerModels.length)];
            return new Marker(model, color);
        }
        throw new NoSuchToolException(type.toString());
    }
}
