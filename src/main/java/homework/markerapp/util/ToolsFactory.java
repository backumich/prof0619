package homework.markerapp.util;

import homework.markerapp.entity.Color;
import homework.markerapp.entity.Marker;
import homework.markerapp.entity.MarkerModel;
import homework.markerapp.entity.WritingTool;
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

    public WritingTool getTool(Class clazz) throws NoSuchToolException {
        if (clazz == null){
            throw new IllegalArgumentException();
        }
        if (clazz.equals(Marker.class)){
            Marker marker = new Marker();
            marker.setColor(colors[new Random().nextInt(colors.length)]);
            marker.setModel(markerModels[new Random().nextInt(markerModels.length)]);
            return marker;
        }
        throw new NoSuchToolException(clazz.getSimpleName());
    }
}
