import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnAWT extends Frame 
{ 
	private static final long serialVersionUID = 1L;
	
	TextField tf1; 
    TextField tf2; 
    Label l1; 
    Button b;
    Button bex;
    Button bclr;
		            
       public LearnAWT()
       { 
                setTitle("Integer Calculator");
                
                tf1 = new TextField(); 
                tf1.setBounds(100, 50, 85, 20);
                
                tf2 = new TextField(); 
                tf2.setBounds(100, 100, 85, 20);
                
		        b = new Button("Add"); 
		        b.setBounds(110,170,60,40);

                        mul = new Button("Multiple"); 
		        mul.setBounds(110,220,60,40);
		        
		        bex = new Button("EXIT");
		        bex.setBounds(110, 220, 60, 40);
		        
		        bclr = new Button("CLEAR");
		        bclr.setBounds(200, 220, 60, 40);	
		        
		        l1 = new Label(""); 
		        l1.setBounds(100, 130, 100, 20);
		         
		        add(b);
                        add(mul);
		        add(bex);
		        add(bclr);
		        add(tf1); 
		        add(tf2); 
		        add(l1);
		        setLayout(null);
		        
		        setSize(300,300);
		        
		        this.setLocationRelativeTo(null);

		        b.addActionListener(new ActionListener()
		        {
		               public void actionPerformed(ActionEvent e)
		               { 
		                    int a = Integer.parseInt(tf1.getText());
		                    int b = Integer.parseInt(tf2.getText()); 
		                    int c = a + b;
		                    
		                    l1.setText("Their sum is = " + String.valueOf(c));     
		               }        
                        }); 

                        // action code for multiple click button
                        mul.addActionListener(new ActionListener()
		        {
		               public void actionPerformed(ActionEvent e)
		               { 
		                    int a = Integer.parseInt(tf1.getText());
		                    int b = Integer.parseInt(tf2.getText()); 
		                    int c = a * b;
		                    
		                    l1.setText("Their Product is = " + String.valueOf(c));     
		               }
		        }); 
		        

		        bex.addActionListener(new ActionListener()
		        {
		               public void actionPerformed(ActionEvent e)
		               {
		            	    System.exit(0);;     
		               }
		        }); 
		        
		        bclr.addActionListener(new ActionListener()
		        {
		               public void actionPerformed(ActionEvent e)
		               {
		            	   tf1.setText("");
		                   tf2.setText("");
		                   l1.setText("");     
		               }
		        }); 
        }
		                    
		public static void main(String []args)
		{ 
		        LearnAWT      frame =  new LearnAWT();
		        frame.setVisible(true);
		} 
}