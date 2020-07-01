package gta;

import java.sql.*;
import java.lang.Math;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;


class SimpleTableModel extends AbstractTableModel {

  String s1 = "300";
  String s2 = "646";

  protected static int soldA = 20;

  int frm1 = 0;
  int to1 = soldA;

  int gross1 = soldA*50;
  
  int cess1 = soldA*3;
  
  double cgst1  = soldA*50*0.09;
  double sgst1  = soldA*50*0.09;

  int sc1 = soldA*2;

  double et1 = Math.floor((soldA*3.13)*100)/100;

  double fc1 = Math.floor((soldA*0.68)*100)/100;

  private Object[][] data = {};
  private String[] columnNames = {"Seats","Class","Rate","","Ticket","","Sold","Gross","Cess","SC","ET","FC","","GST",""};
  private Class[] columnClass = { Integer.class,String.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class};
  private Object[][] rowData = new Object[][] {
      {"","","","From","","To","","","","","","","CGST","","SGST"},
      {s1,"R","75",frm1,"",to1,soldA,gross1,cess1,sc1,et1,fc1,cgst1,"",sgst1},
       };

  public SimpleTableModel() {
  }

  @Override
  public int getRowCount() {
    return rowData.length;
  }

  @Override
  public int getColumnCount() {
    return columnNames.length;
  }

  @Override
  public String getColumnName(int columnIndex) {
    return columnNames[columnIndex];
  }

  @Override
  public Class getColumnClass(int columnIndex) {
    return columnClass[columnIndex];
  }

  @Override
  public boolean isCellEditable(int rowIndex, int columnIndex) {
    boolean isEditable = false;
    return isEditable;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex) {
    return rowData[rowIndex][columnIndex];
  }

  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    rowData[rowIndex][columnIndex] = aValue;
  }
}

class JTableUtilities{
  public static void setCellsAlignment(JTable table, int alignment){
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    } 
}

public class Dcr extends JFrame {

  public Dcr() {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    JTable table  = new JTable(new SimpleTableModel());

    JTableUtilities.setCellsAlignment(table, SwingConstants.CENTER);

    Container contentPane = this.getContentPane();
    contentPane.add(new JScrollPane(table), BorderLayout.CENTER);

    pack();
    setVisible(true);

  }

  public static void main(String[] args) {

  }
}