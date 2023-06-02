import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird", "fox", "bear"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);


        //Can type in to look for
            //comboBox.setEditable(true);
        //Counts the amount of items
        System.out.println(comboBox.getItemCount());
        //add item
        comboBox.addItem("horse");
        //Insert an item in a specific place in the array
        comboBox.insertItemAt("pig",0);
        //To be currently selected
        comboBox.setSelectedIndex(0);
        //Remove an item
        comboBox.removeItem("cat");
        //Remove item at a certain index
        comboBox.removeItemAt(0);
        //Remove all items from comboBox
            //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
