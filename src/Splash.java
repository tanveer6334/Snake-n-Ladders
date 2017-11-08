import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



@SuppressWarnings("serial")
public class Splash extends JFrame implements ActionListener {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void FrameinMiddle() {

		Dimension screenSize,frameSize;
		int x,y;
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frameSize=getSize();
		x=(screenSize.width-frameSize.width)/2;
		y=(screenSize.height-frameSize.height)/2;
		setLocation(x, y);
		}
	
	int time = 0;
	Timer tm = new Timer(1000,this);
	public void logic()
	{
		time++;
		//lblNewLabel1.setText(""+time);
		
		//JOptionPane.showMessageDialog(null, "Hello");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (time!=3)
		{
			FrameinMiddle();
			logic();
			
		}
		else
		{
			//JOptionPane.showMessageDialog(null, "Time UP");
			tm.stop();
			dispose();
			Main frame = new Main();
			frame.setVisible(true);
			
		}
		
		repaint();
	}

	/**
	 * Create the frame.
	 */
	public Splash() {
		
		setResizable(false);
		setEnabled(false);
		
		
		tm.start();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Splash.class.getResource("/Image/Snake0.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("");
		lbl.setIcon(new ImageIcon(Splash.class.getResource("/Image/snake.gif")));
		lbl.setBounds(38, 11, 300, 273);
		contentPane.add(lbl);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Splash.class.getResource("/Image/ludu.gif")));
		label.setBounds(59, 316, 259, 55);
		contentPane.add(label);
		
	}

	

}
