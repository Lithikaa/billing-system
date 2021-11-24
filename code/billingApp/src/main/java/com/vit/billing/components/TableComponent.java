package com.vit.billing.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableComponent {
    public JTable table;
    public JScrollPane scrollPane;

    public TableComponent() {
        TableCellRenderer tableRenderer;
        table = new JTable(new JTableButtonModel());
        tableRenderer = table.getDefaultRenderer(JButton.class);
        table.setDefaultRenderer(JButton.class, new JTableButtonRenderer(tableRenderer));
        scrollPane = new JScrollPane(table);
    }

}

class JTableButtonRenderer implements TableCellRenderer {
    private TableCellRenderer defaultRenderer;

    public JTableButtonRenderer(TableCellRenderer renderer) {
        defaultRenderer = renderer;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if (value instanceof Component)
            return (Component) value;
        return defaultRenderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

class JTableButtonModel extends AbstractTableModel {
    private Object[][] rows = { { "101", "Wheat", "670000", "90", "100", new JButton("Delete") },
            { "102", "Rice", "780000", "20", "50", new JButton("Delete") },
            { "103", "Sugar", "700000", "15", "20", new JButton("Delete") } };
    private String[] columns = { "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PURCHASE PRICE", "SELLING PRICE", "EDIT" };

    public String getColumnName(int column) {
        return columns[column];
    }

    public int getRowCount() {
        return rows.length;
    }

    public int getColumnCount() {
        return columns.length;
    }

    public Object getValueAt(int row, int column) {
        return rows[row][column];
    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }

    public Class getColumnClass(int column) {
        return getValueAt(0, column).getClass();
    }
}
