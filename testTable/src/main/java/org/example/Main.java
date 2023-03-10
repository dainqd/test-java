package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String[] columnNames = {"ID", "Name"};
        Object[][] data = {
                {"ID","Name"},
                {"Ken", 5},
                {"Tom", 3},
                {"Susam", 2},
                {"Mark", 20},
                {"Joe", 10}
        };
        JTable table = new JTable(data, columnNames);

        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}