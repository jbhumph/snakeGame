package ui;

import data.*;
import java.awt.event.KeyEvent;

public class GameControlInput {
    public static boolean handleKeyPress(KeyEvent e, Snake snake, Grid grid) {
        int x = snake.getHead().getRow();
        int y = snake.getHead().getCol();
        boolean session = true;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT, KeyEvent.VK_A: // move left
                if (y == 0) {
                    session = snake.move(grid.getCell(x, 9), grid);
                } else {
                    session = snake.move(grid.getCell(x, y - 1), grid);
                }
                break;

            case KeyEvent.VK_DOWN, KeyEvent.VK_S: // move down
                if (x == 9) {
                    session = snake.move(grid.getCell(0, y), grid);
                } else {
                    session = snake.move(grid.getCell(x + 1, y), grid);
                }
                break;
            case KeyEvent.VK_UP, KeyEvent.VK_W: // move up
                if (x == 0) {
                    session = snake.move(grid.getCell(9, y), grid);
                } else {
                    session = snake.move(grid.getCell(x - 1, y), grid);
                }
                break;
            case KeyEvent.VK_RIGHT, KeyEvent.VK_D: // move right
                if (y == 9) {
                    session = snake.move(grid.getCell(x, 0), grid);
                } else {
                    session = snake.move(grid.getCell(x, y + 1), grid);
                }
                break;
            default:
                break;
        }

        if (!session) {
            System.out.println("Game Over!");
            return false;
        }
        return true;
    }
}
