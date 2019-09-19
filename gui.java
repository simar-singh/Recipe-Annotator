import javax.swing.*;


public class gui extends JFrame{
  JPanel p=new JPanel();
  
  public static void main(String[] args) {
    new gui();
  }
  public gui(){ //constructor
    super("Ingredient Visibility GUI"); //JFrame constructor where you set app title
    setSize(500,500); //size of the window (width, height)
    setResizable(true); //can resize the window
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
}
