package homework.markerapp.entity;

import homework.markerapp.exception.NoInkException;
import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.util.ToolsFactory;

import java.util.Scanner;

public class Teacher {
    private WritingTool tool;
    private ToolsFactory toolsFactory = ToolsFactory.getInstance();

    public void write(Class toolsClazz) throws NoSuchToolException {
        tool = toolsFactory.getTool(toolsClazz);
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    String text = sc.nextLine();
                    writeText(text);
                } catch (NoInkException e) {
                    tool = toolsFactory.getTool(toolsClazz);
                }
            }
        }
    }

    private void writeText(String text) throws NoInkException {
        if(text.equals("/q")){
            System.exit(0);
        } else if (text.isEmpty()) {
            return;
        }

        int inkCapacity = tool.getInkCapacity();
        if (inkCapacity <= 0) {
            throw new NoInkException();
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
                throw new NoInkException();
            }
        }
        System.out.println("</" + color + ">");
    }
}
