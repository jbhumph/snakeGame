package data;

import linkedList.*;

public class Snake {
    private BasicLinkedList<Cell> cells;
    private Cell head;

    // constructor
    public Snake(Cell initial) {
        cells = new BasicLinkedList<Cell>();
        head = initial;
        cells.add(head);
        cells.getFirst().setFill("snake");
    }

    // return snake head location
    public Cell getHead() {
        return head;
    }

    // method for moving snake
    public boolean move(Cell cell, Grid grid) {
        boolean test = false;
        if (cells.size() == 1) {
            test = true;
        } else if (!(cell == cells.get(cells.size() - 2))) {
            test = true;
        }
        if (test) {
            head = cell;
            if (cell.getFill().equals("empty")) {
                cells.add(head);
                cells.getFirst().setFill("empty");
                cells.getLast().setFill("snake");
                cells.removeFirst();
            } else if (cell.getFill().equals("food")) {
                cells.add(head);
                head.setFill("snake");
                grid.setCellFill();
            } else {
                return false;
            }
        }
        return true;
    }
}
