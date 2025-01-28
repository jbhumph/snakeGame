package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import data.Grid;
import data.Snake;

public class GamePanel extends JPanel implements KeyListener {
    private final int TILE_SIZE = 70;
    private final int WIDTH = 10;
    private final int HEIGHT = 10;
    private final int SCREEN_WIDTH = WIDTH * TILE_SIZE;
    private final int SCREEN_HEIGHT = HEIGHT * TILE_SIZE;

    private Grid grid;
    private Snake snake;
    private Timer timer;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        // Initialize game objects
        grid = new Grid(WIDTH, HEIGHT);
        snake = new Snake(grid.getCell(5, 5));
        grid.setCellFill();

        // Start game loop
        //timer = new Timer(200, this);
        //timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                switch (grid.getCellFill(i, j)) {
                    case "empty":
                        g.setColor(Color.PINK);
                        g.fillRect(j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                        break;
                    case "food":
                        g.setColor(Color.RED);
                        g.fillOval(j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                        break;
                    case "snake":
                        g.setColor(new Color(175, 225, 175));
                        g.fillRect(j * TILE_SIZE, i * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                        break;
                }
            }
        }
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        boolean session = snake.move(cell, grid);
        if (!session) {
            timer.stop();
            System.out.println("Game Over!"); // Optional: Display a popup later
        }
        repaint();
    }*/

    @Override
    public void keyPressed(KeyEvent e) {
        GameControlInput.handleKeyPress(e, snake, grid);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
