package homework.markerapp.entity;

import homework.markerapp.exception.NoInkException;
import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.factory.ToolsFactory;

import java.util.Scanner;

public class Teacher {
    private ToolsFactory toolsFactory = ToolsFactory.getInstance();

    public void write(ToolType type) throws NoSuchToolException {
        WritingTool tool = toolsFactory.getTool(type);
        boolean isCancelled = false;

        Scanner sc = new Scanner(System.in);
        while (!isCancelled) {
            try {
                String text = sc.nextLine();
                if (text.equals("/q")) {
                    isCancelled = true;
                } else if (!text.isEmpty()) {
                    printText(text, tool);
                }
            } catch (NoInkException e) {
                tool = toolsFactory.getTool(type);
            }
        }
        sc.close();
    }

    private void printText(String text, WritingTool tool) throws NoInkException {
        int inkCapacity = tool.getInkCapacity();
        if (inkCapacity <= 0) {
            throw new NoInkException(tool.getClass().getSimpleName());
        }
        String toolColor = tool.getToolsColor();
        System.out.print("<" + toolColor + ">");

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar == ' ') {
                System.out.print(currentChar);
            } else if (inkCapacity > 0) {
                System.out.print(currentChar);
                inkCapacity--;
            } else {
                System.out.print("</" + toolColor + ">");
                throw new NoInkException(tool.getClass().getSimpleName());
            }
        }
        System.out.print("</" + toolColor + ">" + "\n");
    }
}
