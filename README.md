# ComboBox.java
In this project, I did a YouTube video using Java. 
What is a JComboBox?
A component that is a drop-down list or editable field, which can select a value from a list. 
What I learn?
I was able to learn on how to make a JComboBox and apply some of its method.
How?
Create a String of array with animal values.
Make a new JCombo and ActionListener. 
In the ActionPerformed, I use an if statement and println to get the selected item. 
Methods of the ComboBox, I used:
-setEditable(true)-Switch to an editable field that can type in a value.
-getItemCount
-addItem
-insertItemAt
-setSelectedIndex
-removeIndex
-removeItemAt
-removeAllItems

***Important to know:
If you want to create a JComboBox with primitive data type,such as integer or double, within an array.
Then, it is important to type it in a wrapper class.
For example, 
Don't:
  int[] animals = {1,2,3};
Do:
  Integer[] animals = {1,2,3};



