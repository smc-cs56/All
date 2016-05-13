import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class TestMenu extends JFrame implements ActionListener{

 private JButton magicButton;
 private JButton memoryButton;
 private JButton instructButton;
 private JButton close;
 private ImageIcon mainImg;
 private JLabel mainLabel;
 
 public TestMenu(){
      JPanel p = new JPanel();
      p.setLayout(null);
      
      mainImg = new ImageIcon(getClass().getResource("newFrontImage.jpg"));
		mainLabel = new JLabel(mainImg);
		mainLabel.setBounds(150,50,480,360);
		add(mainLabel);
      
      magicButton = new JButton("magic trick");
      magicButton.setBounds(150,470,100,40);
      magicButton.addActionListener(this);
      p.add(magicButton);
      
      memoryButton = new JButton("memory");
      memoryButton.setBounds(275,470,100,40);
      magicButton.addActionListener(this);
      p.add(memoryButton);
      
      instructButton = new JButton("instructions");
      instructButton.setBounds(400,470,100,40);
      instructButton.addActionListener(this);
      p.add(instructButton);
      
      close = new JButton("close");
      close.setBounds(525,470,100,40);
      close.addActionListener(this);
      p.add(close);
      
      
      
      getContentPane().add(p);
      
      Color customColor= new Color(15,112,1);
      p.setBackground(customColor);
      //setLayout(null);
      setDefaultCloseOperation(3);
      setSize(800,600);
      setVisible(true);

     }
 
 	public void actionPerformed (ActionEvent e)
 	{
 		if(e.getSource()==magicButton)
 		{
 			//JYCardTrick();
 		}
 		else if (e.getSource()==memoryButton)
 		{
 			//memoryButton();
 		}
 		else if (e.getSource()==instructButton)
 		{
 			JFrame Instruct = new JFrame();
			Instruct instructions = new Instruct();
			//instructions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			instructions.setSize(300,200);
			instructions.setVisible(true);
 		}
 		else if(e.getSource()==close)
 		{
 			System.exit(0);
 		}
 	}
   public static void main(String[]args){
       new TestMenu();
       }
}

class Instruct extends JFrame implements ActionListener
{
	private JTextArea instructions = new JTextArea();
	private JButton back;
	
	public Instruct()
	{
		setLayout(new FlowLayout());
		//instructions area
		instructions = new JTextArea("INSTRUCTIONS INSTRUCTIONS INSTRUCTIONS \nINSTRUCTIONS INSTRUCTIONS INSTRUCTIONS \nINSTRUCTIONS INSTRUCTIONS INSTRUCTIONS \n ");
		add(instructions);
		
		back = new JButton("Back");
		back.addActionListener(this);
		add(back);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
			this.dispose();
		}
	}
}