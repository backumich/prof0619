package homework.markerapp.entity;

import homework.markerapp.exception.NoInkException;
import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.factory.ToolsFactory;

import java.util.Scanner;

public class Teacher {
    private WritingTool tool;
    private ToolsFactory toolsFactory = ToolsFactory.getInstance();

    public void write(ToolType type) throws NoSuchToolException {
        tool = toolsFactory.getTool(type);
        boolean isCancelled = false;
        try (Scanner sc = new Scanner(System.in)) {
            while (!isCancelled) {
                try {
                    String text = sc.nextLine();
                    if (text.equals("/q")) {
                        isCancelled = true;
                    } else if (text.isEmpty()) {
                        return;
                    }
                    writeText(text);
                } catch (NoInkException e) {
                    tool = toolsFactory.getTool(type);
                }
            }
        }
    }

    private void writeText(String text) throws NoInkException {

        int inkCapacity = tool.getInkCapacity();
        if (inkCapacity <= 0) {
            throw new NoInkException(tool.getClass().getSimpleName());
        }
        String color = tool.getToolsColor();
        System.out.print("<" + color + ">");

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (inkCapacity > 0) {
                System.out.print(currentChar);
                if (currentChar != ' ') {
                    inkCapacity--;
                }
            } else {
                System.out.println("</" + color + ">");
                throw new NoInkException(tool.getClass().getSimpleName());
            }
        }
        System.out.println("</" + color + ">");
    }
}
