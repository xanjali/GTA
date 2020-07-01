package gta;

import java.lang.Math;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import javafx.geometry.Dimension2D;


class SimpleTableModel extends AbstractTableModel {

  String s1 = "300";

  protected static int soldA = 20;
  protected static int soldB = 20;
  protected static int soldC = 20;
  protected static int soldD = 20;

  int frm1                   = 0;
  int to1                    = soldA;
  int to2                    = soldB;
  int to3                    = soldC;
  int to4                    = soldD;

  int gross1                 = soldA*50;
  int gross2                 = soldB*50;
  int gross3                 = soldC*50;
  int gross4                 = soldD*50;
  
  int cess1                  = soldA*3;
  int cess2                  = soldB*3;
  int cess3                  = soldC*3;
  int cess4                  = soldD*3;
  
  int sc1                    = soldA*2;
  int sc2                    = soldB*2;
  int sc3                    = soldC*2;
  int sc4                    = soldD*2;

  double et1                 = Math.floor((soldA*3.13)*100)/100;
  double et2                 = Math.floor((soldB*3.13)*100)/100;
  double et3                 = Math.floor((soldC*3.13)*100)/100;
  double et4                 = Math.floor((soldD*3.13)*100)/100;

  double fc1                 = Math.floor((soldA*0.68)*100)/100;
  double fc2                 = Math.floor((soldB*0.68)*100)/100;
  double fc3                 = Math.floor((soldC*0.68)*100)/100;
  double fc4                 = Math.floor((soldD*0.68)*100)/100;

  double cgst1               = Math.floor((soldA*50*0.09)*100)/100;
  double sgst1               = Math.floor((soldA*50*0.09)*100)/100;
  double cgst2               = Math.floor((soldB*50*0.09)*100)/100;
  double sgst2               = Math.floor((soldB*50*0.09)*100)/100;
  double cgst3               = Math.floor((soldC*50*0.09)*100)/100;
  double sgst3               = Math.floor((soldC*50*0.09)*100)/100;
  double cgst4               = Math.floor((soldD*50*0.09)*100)/100;
  double sgst4               = Math.floor((soldD*50*0.09)*100)/100;

  private Object[][] data = {};
  private String[] columnNames = {"Seats","Class","Rate","","Ticket","","Sold","Gross","Cess","SC","ET","FC","","GST",""};
  private Class[] columnClass = { Integer.class,String.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class,Integer.class};
  private Object[][] rowData = new Object[][] {
      {"","","","From","","To","","","","","","","CGST","","SGST"},
      {s1,"R","75",frm1,"",to1,soldA,gross1,cess1,sc1,et1,fc1,cgst1,"",sgst1},
      {s1,"R","75",to1,"",to2,soldB,gross2,cess2,sc2,et2,fc2,cgst2,"",sgst2},
      {s1,"R","75",to2,"",to3,soldC,gross3,cess3,sc3,et3,fc3,cgst3,"",sgst3},
      {s1,"R","75",to3,"",to4,soldD,gross4,cess4,sc4,et4,fc4,cgst4,"",sgst4},
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

    table.setPreferredScrollableViewportSize(new Dimension(800,500));

    pack();
    setVisible(true);

  }

  public static void main(String[] args) {
  }
}