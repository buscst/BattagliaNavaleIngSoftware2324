package BattagliaNavaleProject.client;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class MenuPrincipale extends JFrame {
	private JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try 
				{
					MenuPrincipale frame = new MenuPrincipale();
				    frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
	}

	
	public MenuPrincipale() throws IOException 
	{
	   
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(771, 600);
final ImageIcon sfondo = new ImageIcon("../docs/resources/SfondoTest.jpeg");
		
		JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(sfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        getContentPane().add(backgroundPanel);
		backgroundPanel.setLayout(null);
		
		
        ImageIcon icon = new ImageIcon("../docs/resources/Logo.jpeg");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(60, 60, Image.SCALE_SMOOTH);

        // scaled icon
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel lblNewLabel = new JLabel(scaledIcon);
        
        
        
        lblNewLabel.setPreferredSize(new Dimension(60,60));
        lblNewLabel.setBounds(0, 0, 119, 85);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(lblNewLabel);
        
        ImageIcon icon2 = new ImageIcon("2.png");
        JLabel lblNewLabel_1 = new JLabel("foto profilo");
        lblNewLabel_1.setPreferredSize(new Dimension(icon2.getIconWidth(), icon2.getIconHeight()));
        lblNewLabel_1.setBounds(638, 0, 119, 85);
        backgroundPanel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("BATTAGLIA NAVALE ");
        lblNewLabel_2.setForeground(new Color(0, 0, 255));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 42));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(129, 0, 499, 85);
        backgroundPanel.add(lblNewLabel_2);
	    

	    JButton multiplayerbutton = new JButton("Multiplayer");
	    multiplayerbutton.setBackground(new Color(0, 0, 255));
	   // multiplayerbutton.setForeground(new Color(0, 0, 255)); senza questa linea leggiamo la scritta sul bottone
	    multiplayerbutton.setPreferredSize(new Dimension(170, 50));
	    multiplayerbutton.setBounds(258, 139, 275, 70);
	    backgroundPanel.add(multiplayerbutton);
	    
	    JButton singleplayer = new JButton("Singleplayer");
	   
        
	    singleplayer.setBackground(new Color(0, 0, 255));
	    //singleplayer.setForeground(new Color(0, 0, 255));
	    singleplayer.setPreferredSize(new Dimension(170, 50));
	    singleplayer.setBounds(258, 237, 275, 70);
	    backgroundPanel.add(singleplayer);
	    
	    JButton tutorialbutton = new JButton("Tutorial");
	    //tutorialbutton.setForeground(new Color(0, 0, 255));
	    tutorialbutton.setBackground(new Color(0, 0, 255));
	    tutorialbutton.setBounds(258, 340, 275, 70);
	    tutorialbutton.setPreferredSize(new Dimension(170, 50)); // Set the button size in pixels
	    backgroundPanel.add(tutorialbutton);
	    
	    
	    
	    ButtonGroup languageGroup = new ButtonGroup();
	    JRadioButton itaRadioButton = new JRadioButton("ITA");
	    languageGroup.add(itaRadioButton);
	    backgroundPanel.add(itaRadioButton);
	    
        JRadioButton engRadioButton = new JRadioButton("ENG");
        languageGroup.add(engRadioButton);
        backgroundPanel.add(engRadioButton);
	            
        
	}
}