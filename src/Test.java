import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
/*
 * Version v 1.4
 */
import java.awt.Dimension;

@SuppressWarnings("serial")
public class Test extends JFrame {
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl15;
	private JLabel lbl16;
	private JLabel lbl17;
	private JLabel lbl18;
	private JLabel lbl19;
	private JLabel lbl20;
	private JLabel lbl21;
	private JLabel lbl22;
	private JLabel lbl23;
	private JLabel lbl24;
	private JLabel lbl25;
	private JLabel lbl26;
	private JLabel lbl27;
	private JLabel lbl28;
	private JLabel lbl29;
	private JLabel lbl30;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl33;
	private JLabel lbl34;
	private JLabel lbl35;
	private JLabel lbl36;
	private JLabel lbl37;
	private JLabel lbl38;
	private JLabel lbl39;
	private JLabel lbl40;
	private JLabel lbl41;
	private JLabel lbl42;
	private JLabel lbl43;
	private JLabel lbl44;
	private JLabel lbl45;
	private JLabel lbl46;
	private JLabel lbl47;
	private JLabel lbl48;
	private JLabel lbl49;
	private JLabel lbl50;
	private JLabel lbl51;
	private JLabel lbl52;
	private JLabel lbl53;
	private JLabel lbl54;
	private JLabel lbl55;
	private JLabel lbl56;
	private JLabel lbl57;
	private JLabel lbl58;
	private JLabel lbl59;
	private JLabel lbl60;
	private JLabel lbl61;
	private JLabel lbl62;
	private JLabel lbl63;
	private JLabel lbl64;
	private JLabel lbl65;
	private JLabel lbl66;
	private JLabel lbl67;
	private JLabel lbl68;
	private JLabel lbl69;
	private JLabel lbl70;
	private JLabel lbl71;
	private JLabel lbl72;
	private JLabel lbl73;
	private JLabel lbl74;
	private JLabel lbl75;
	private JLabel lbl76;
	private JLabel lbl77;
	private JLabel lbl78;
	private JLabel lbl79;
	private JLabel lbl80;
	private JLabel lbl81;
	private JLabel lbl82;
	private JLabel lbl83;
	private JLabel lbl84;
	private JLabel lbl85;
	private JLabel lbl86;
	private JLabel lbl87;
	private JLabel lbl88;
	private JLabel lbl89;
	private JLabel lbl90;
	private JLabel lbl91;
	private JLabel lbl92;
	private JLabel lbl93;
	private JLabel lbl94;
	private JLabel lbl95;
	private JLabel lbl96;
	private JLabel lbl97;
	private JLabel lbl98;
	private JLabel lbl99;
	private JLabel lbl100;
	private JLabel lblDice;
	private JLabel lblBackground;
	private JLabel lblDisplay;
	private JPanel panel;
	private JLabel dsPlayer;
	private JLabel dsBtn;
	
	private int[] players;
	
	private int player=1;
	
	
	private int xPoint;
	private int won = -1;
	private String[] place = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th"};
	
	private String[] playerName;
	
	private int[] playerLocation;
	private String[] begin;
	private int PlayerPos = -1;;
			
	private int playerNo = 6;
	private int point = 0;
	
	private JLabel lblP1;
	private JLabel lblP3;
	private JLabel lblP2;
	private JLabel lblP4;
	private JLabel lblP5;
	private JLabel lblP6;
	private JLabel lP1;
	private JLabel lP2;
	private JLabel lP3;
	private JLabel lP4;
	private JLabel lP5;
	private JLabel lP6;
	private JLabel lblScoreP1;
	private JLabel lblScoreP2;
	private JLabel lblScoreP3;
	private JLabel lblScoreP4;
	private JLabel lblScoreP5;
	private JLabel lblScoreP6;
	private JLabel dsBtnNxt;
	private JLabel dsNxtPlayer;
	private JLabel label;
	private JPanel panel_1;
	private JLabel lblLoc;
	private JButton btnDice;
	private JButton btnRestart;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					//e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Main Frame error!");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Snake N Ladders v1.4\u00AE");
		/*
		 * Layout 1
		 */
		
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Layout error!");
        }
        SwingUtilities.updateComponentTreeUI(contentPane);
        
        FrameinMiddle();
        
        /*
         *	Escape code 
         */
        
        contentPane.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
        KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT"); 
        contentPane.getRootPane().getActionMap().put("EXIT", new AbstractAction(){ 
        public void actionPerformed(ActionEvent e)
        	{
        		//frmHome.dispose();
        		System.exit(0);
        	}
        });
        
        /*
         * Enter Key
         */
        
        contentPane.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "EXIT"); 
                contentPane.getRootPane().getActionMap().put("EXIT", new AbstractAction(){ 
                public void actionPerformed(ActionEvent e)
                	{
                		btnDice.doClick();
                	}
                });
        
		
		btnDice = new JButton("Dice");
		btnDice.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDice.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				GameStart();
			}
				
				
				
		});
		btnDice.setBounds(1000, 171, 153, 41);
		contentPane.add(btnDice);
		
		lbl100 = new JLabel("");
		lbl100.setHorizontalAlignment(SwingConstants.CENTER);
		lbl100.setBounds(225, 24, 60, 60);
		contentPane.add(lbl100);
		
		lbl99 = new JLabel("");
		lbl99.setHorizontalAlignment(SwingConstants.CENTER);
		lbl99.setBounds(288, 24, 60, 60);
		contentPane.add(lbl99);
		
		lbl98 = new JLabel("");
		lbl98.setHorizontalAlignment(SwingConstants.CENTER);
		lbl98.setBounds(353, 24, 60, 60);
		contentPane.add(lbl98);
		
		lbl97 = new JLabel("");
		lbl97.setHorizontalAlignment(SwingConstants.CENTER);
		lbl97.setBounds(416, 24, 60, 60);
		contentPane.add(lbl97);
		
		lbl96 = new JLabel("");
		lbl96.setHorizontalAlignment(SwingConstants.CENTER);
		lbl96.setBounds(479, 24, 60, 60);
		contentPane.add(lbl96);
		
		lbl95 = new JLabel("");
		lbl95.setHorizontalAlignment(SwingConstants.CENTER);
		lbl95.setBounds(543, 24, 60, 60);
		contentPane.add(lbl95);
		
		lbl94 = new JLabel("");
		lbl94.setHorizontalAlignment(SwingConstants.CENTER);
		lbl94.setBounds(606, 24, 60, 60);
		contentPane.add(lbl94);
		
		lbl93 = new JLabel("");
		lbl93.setHorizontalAlignment(SwingConstants.CENTER);
		lbl93.setBounds(670, 24, 60, 60);
		contentPane.add(lbl93);
		
		lbl92 = new JLabel("");
		lbl92.setHorizontalAlignment(SwingConstants.CENTER);
		lbl92.setBounds(734, 24, 60, 60);
		contentPane.add(lbl92);
		
		lbl91 = new JLabel("");
		lbl91.setHorizontalAlignment(SwingConstants.CENTER);
		lbl91.setBounds(797, 24, 60, 60);
		contentPane.add(lbl91);
		
		lbl90 = new JLabel("");
		lbl90.setHorizontalAlignment(SwingConstants.CENTER);
		lbl90.setBounds(797, 88, 60, 60);
		contentPane.add(lbl90);
		
		lbl89 = new JLabel("");
		lbl89.setHorizontalAlignment(SwingConstants.CENTER);
		lbl89.setBounds(734, 88, 60, 60);
		contentPane.add(lbl89);
		
		lbl88 = new JLabel("");
		lbl88.setHorizontalAlignment(SwingConstants.CENTER);
		lbl88.setBounds(670, 88, 60, 60);
		contentPane.add(lbl88);
		
		lbl87 = new JLabel("");
		lbl87.setHorizontalAlignment(SwingConstants.CENTER);
		lbl87.setBounds(606, 88, 60, 60);
		contentPane.add(lbl87);
		
		lbl86 = new JLabel("");
		lbl86.setHorizontalAlignment(SwingConstants.CENTER);
		lbl86.setBounds(543, 88, 60, 60);
		contentPane.add(lbl86);
		
		lbl85 = new JLabel("");
		lbl85.setHorizontalAlignment(SwingConstants.CENTER);
		lbl85.setBounds(479, 88, 60, 60);
		contentPane.add(lbl85);
		
		lbl84 = new JLabel("");
		lbl84.setHorizontalAlignment(SwingConstants.CENTER);
		lbl84.setBounds(416, 88, 60, 60);
		contentPane.add(lbl84);
		
		lbl83 = new JLabel("");
		lbl83.setHorizontalAlignment(SwingConstants.CENTER);
		lbl83.setBounds(353, 88, 60, 60);
		contentPane.add(lbl83);
		
		lbl82 = new JLabel("");
		lbl82.setHorizontalAlignment(SwingConstants.CENTER);
		lbl82.setBounds(288, 88, 60, 60);
		contentPane.add(lbl82);
		
		lbl81 = new JLabel("");
		lbl81.setHorizontalAlignment(SwingConstants.CENTER);
		lbl81.setBounds(225, 88, 60, 60);
		contentPane.add(lbl81);
		
		lbl80 = new JLabel("");
		lbl80.setHorizontalAlignment(SwingConstants.CENTER);
		lbl80.setBounds(225, 152, 60, 60);
		contentPane.add(lbl80);
		
		lbl79 = new JLabel("");
		lbl79.setHorizontalAlignment(SwingConstants.CENTER);
		lbl79.setBounds(288, 152, 60, 60);
		contentPane.add(lbl79);
		
		lbl78 = new JLabel("");
		lbl78.setHorizontalAlignment(SwingConstants.CENTER);
		lbl78.setBounds(353, 152, 60, 60);
		contentPane.add(lbl78);
		
		lbl77 = new JLabel("");
		lbl77.setHorizontalAlignment(SwingConstants.CENTER);
		lbl77.setBounds(416, 152, 60, 60);
		contentPane.add(lbl77);
		
		lbl76 = new JLabel("");
		lbl76.setHorizontalAlignment(SwingConstants.CENTER);
		lbl76.setBounds(479, 152, 60, 60);
		contentPane.add(lbl76);
		
		lbl75 = new JLabel("");
		lbl75.setHorizontalAlignment(SwingConstants.CENTER);
		lbl75.setBounds(543, 152, 60, 60);
		contentPane.add(lbl75);
		
		lbl74 = new JLabel("");
		lbl74.setHorizontalAlignment(SwingConstants.CENTER);
		lbl74.setBounds(606, 152, 60, 60);
		contentPane.add(lbl74);
		
		lbl73 = new JLabel("");
		lbl73.setHorizontalAlignment(SwingConstants.CENTER);
		lbl73.setBounds(670, 152, 60, 60);
		contentPane.add(lbl73);
		
		lbl72 = new JLabel("");
		lbl72.setHorizontalAlignment(SwingConstants.CENTER);
		lbl72.setBounds(734, 152, 60, 60);
		contentPane.add(lbl72);
		
		lbl71 = new JLabel("");
		lbl71.setHorizontalAlignment(SwingConstants.CENTER);
		lbl71.setBounds(797, 152, 60, 60);
		contentPane.add(lbl71);
		
		lbl70 = new JLabel("");
		lbl70.setHorizontalAlignment(SwingConstants.CENTER);
		lbl70.setBounds(797, 215, 60, 60);
		contentPane.add(lbl70);
		
		lbl69 = new JLabel("");
		lbl69.setHorizontalAlignment(SwingConstants.CENTER);
		lbl69.setBounds(734, 215, 60, 60);
		contentPane.add(lbl69);
		
		lbl68 = new JLabel("");
		lbl68.setHorizontalAlignment(SwingConstants.CENTER);
		lbl68.setBounds(670, 215, 60, 60);
		contentPane.add(lbl68);
		
		lbl67 = new JLabel("");
		lbl67.setHorizontalAlignment(SwingConstants.CENTER);
		lbl67.setBounds(606, 215, 60, 60);
		contentPane.add(lbl67);
		
		lbl66 = new JLabel("");
		lbl66.setHorizontalAlignment(SwingConstants.CENTER);
		lbl66.setBounds(543, 215, 60, 60);
		contentPane.add(lbl66);
		
		lbl65 = new JLabel("");
		lbl65.setHorizontalAlignment(SwingConstants.CENTER);
		lbl65.setBounds(479, 215, 60, 60);
		contentPane.add(lbl65);
		
		lbl64 = new JLabel("");
		lbl64.setHorizontalAlignment(SwingConstants.CENTER);
		lbl64.setBounds(416, 215, 60, 60);
		contentPane.add(lbl64);
		
		lbl63 = new JLabel("");
		lbl63.setHorizontalAlignment(SwingConstants.CENTER);
		lbl63.setBounds(353, 215, 60, 60);
		contentPane.add(lbl63);
		
		lbl62 = new JLabel("");
		lbl62.setHorizontalAlignment(SwingConstants.CENTER);
		lbl62.setBounds(288, 215, 60, 60);
		contentPane.add(lbl62);
		
		lbl61 = new JLabel("");
		lbl61.setHorizontalAlignment(SwingConstants.CENTER);
		lbl61.setBounds(225, 215, 60, 60);
		contentPane.add(lbl61);
		
		lbl60 = new JLabel("");
		lbl60.setHorizontalAlignment(SwingConstants.CENTER);
		lbl60.setBounds(225, 278, 60, 60);
		contentPane.add(lbl60);
		
		lbl59 = new JLabel("");
		lbl59.setHorizontalAlignment(SwingConstants.CENTER);
		lbl59.setBounds(288, 278, 60, 60);
		contentPane.add(lbl59);
		
		lbl58 = new JLabel("");
		lbl58.setHorizontalAlignment(SwingConstants.CENTER);
		lbl58.setBounds(353, 278, 60, 60);
		contentPane.add(lbl58);
		
		lbl57 = new JLabel("");
		lbl57.setHorizontalAlignment(SwingConstants.CENTER);
		lbl57.setBounds(416, 278, 60, 60);
		contentPane.add(lbl57);
		
		lbl56 = new JLabel("");
		lbl56.setHorizontalAlignment(SwingConstants.CENTER);
		lbl56.setBounds(479, 278, 60, 60);
		contentPane.add(lbl56);
		
		lbl55 = new JLabel("");
		lbl55.setHorizontalAlignment(SwingConstants.CENTER);
		lbl55.setBounds(543, 278, 60, 60);
		contentPane.add(lbl55);
		
		lbl54 = new JLabel("");
		lbl54.setHorizontalAlignment(SwingConstants.CENTER);
		lbl54.setBounds(606, 278, 60, 60);
		contentPane.add(lbl54);
		
		lbl53 = new JLabel("");
		lbl53.setHorizontalAlignment(SwingConstants.CENTER);
		lbl53.setBounds(670, 278, 60, 60);
		contentPane.add(lbl53);
		
		lbl52 = new JLabel("");
		lbl52.setHorizontalAlignment(SwingConstants.CENTER);
		lbl52.setBounds(734, 278, 60, 60);
		contentPane.add(lbl52);
		
		lbl51 = new JLabel("");
		lbl51.setHorizontalAlignment(SwingConstants.CENTER);
		lbl51.setBounds(797, 278, 60, 60);
		contentPane.add(lbl51);
		
		lbl50 = new JLabel("");
		lbl50.setHorizontalAlignment(SwingConstants.CENTER);
		lbl50.setBounds(797, 342, 60, 60);
		contentPane.add(lbl50);
		
		lbl49 = new JLabel("");
		lbl49.setHorizontalAlignment(SwingConstants.CENTER);
		lbl49.setBounds(734, 342, 60, 60);
		contentPane.add(lbl49);
		
		lbl48 = new JLabel("");
		lbl48.setHorizontalAlignment(SwingConstants.CENTER);
		lbl48.setBounds(670, 342, 60, 60);
		contentPane.add(lbl48);
		
		lbl47 = new JLabel("");
		lbl47.setHorizontalAlignment(SwingConstants.CENTER);
		lbl47.setBounds(606, 342, 60, 60);
		contentPane.add(lbl47);
		
		lbl46 = new JLabel("");
		lbl46.setHorizontalAlignment(SwingConstants.CENTER);
		lbl46.setBounds(543, 342, 60, 60);
		contentPane.add(lbl46);
		
		lbl45 = new JLabel("");
		lbl45.setHorizontalAlignment(SwingConstants.CENTER);
		lbl45.setBounds(479, 342, 60, 60);
		contentPane.add(lbl45);
		
		lbl44 = new JLabel("");
		lbl44.setHorizontalAlignment(SwingConstants.CENTER);
		lbl44.setBounds(416, 342, 60, 60);
		contentPane.add(lbl44);
		
		lbl43 = new JLabel("");
		lbl43.setHorizontalAlignment(SwingConstants.CENTER);
		lbl43.setBounds(353, 342, 60, 60);
		contentPane.add(lbl43);
		
		lbl42 = new JLabel("");
		lbl42.setHorizontalAlignment(SwingConstants.CENTER);
		lbl42.setBounds(288, 342, 60, 60);
		contentPane.add(lbl42);
		
		lbl41 = new JLabel("");
		lbl41.setHorizontalAlignment(SwingConstants.CENTER);
		lbl41.setBounds(225, 342, 60, 60);
		contentPane.add(lbl41);
		
		lbl40 = new JLabel("");
		lbl40.setHorizontalAlignment(SwingConstants.CENTER);
		lbl40.setBounds(225, 405, 60, 60);
		contentPane.add(lbl40);
		
		lbl39 = new JLabel("");
		lbl39.setHorizontalAlignment(SwingConstants.CENTER);
		lbl39.setBounds(288, 405, 60, 60);
		contentPane.add(lbl39);
		
		lbl38 = new JLabel("");
		lbl38.setHorizontalAlignment(SwingConstants.CENTER);
		lbl38.setBounds(353, 405, 60, 60);
		contentPane.add(lbl38);
		
		lbl37 = new JLabel("");
		lbl37.setHorizontalAlignment(SwingConstants.CENTER);
		lbl37.setBounds(416, 405, 60, 60);
		contentPane.add(lbl37);
		
		lbl36 = new JLabel("");
		lbl36.setHorizontalAlignment(SwingConstants.CENTER);
		lbl36.setBounds(479, 405, 60, 60);
		contentPane.add(lbl36);
		
		lbl35 = new JLabel("");
		lbl35.setHorizontalAlignment(SwingConstants.CENTER);
		lbl35.setBounds(543, 405, 60, 60);
		contentPane.add(lbl35);
		
		lbl34 = new JLabel("");
		lbl34.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34.setBounds(606, 405, 60, 60);
		contentPane.add(lbl34);
		
		lbl33 = new JLabel("");
		lbl33.setHorizontalAlignment(SwingConstants.CENTER);
		lbl33.setBounds(670, 405, 60, 60);
		contentPane.add(lbl33);
		
		lbl32 = new JLabel("");
		lbl32.setHorizontalAlignment(SwingConstants.CENTER);
		lbl32.setBounds(734, 405, 60, 60);
		contentPane.add(lbl32);
		
		lbl31 = new JLabel("");
		lbl31.setHorizontalAlignment(SwingConstants.CENTER);
		lbl31.setBounds(797, 405, 60, 60);
		contentPane.add(lbl31);
		
		lbl30 = new JLabel("");
		lbl30.setHorizontalAlignment(SwingConstants.CENTER);
		lbl30.setBounds(797, 468, 60, 60);
		contentPane.add(lbl30);
		
		lbl29 = new JLabel("");
		lbl29.setHorizontalAlignment(SwingConstants.CENTER);
		lbl29.setBounds(734, 468, 60, 60);
		contentPane.add(lbl29);
		
		lbl28 = new JLabel("");
		lbl28.setHorizontalAlignment(SwingConstants.CENTER);
		lbl28.setBounds(670, 468, 60, 60);
		contentPane.add(lbl28);
		
		lbl27 = new JLabel("");
		lbl27.setHorizontalAlignment(SwingConstants.CENTER);
		lbl27.setBounds(606, 468, 60, 60);
		contentPane.add(lbl27);
		
		lbl26 = new JLabel("");
		lbl26.setHorizontalAlignment(SwingConstants.CENTER);
		lbl26.setBounds(543, 468, 60, 60);
		contentPane.add(lbl26);
		
		lbl25 = new JLabel("");
		lbl25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl25.setBounds(479, 468, 60, 60);
		contentPane.add(lbl25);
		
		lbl24 = new JLabel("");
		lbl24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl24.setBounds(416, 468, 60, 60);
		contentPane.add(lbl24);
		
		lbl23 = new JLabel("");
		lbl23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl23.setBounds(353, 468, 60, 60);
		contentPane.add(lbl23);
		
		lbl22 = new JLabel("");
		lbl22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl22.setBounds(288, 468, 60, 60);
		contentPane.add(lbl22);
		
		lbl21 = new JLabel("");
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setBounds(225, 468, 60, 60);
		contentPane.add(lbl21);
		
		lbl20 = new JLabel("");
		lbl20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl20.setBounds(225, 532, 60, 60);
		contentPane.add(lbl20);
		
		lbl19 = new JLabel("");
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setBounds(288, 532, 60, 60);
		contentPane.add(lbl19);
		
		lbl18 = new JLabel("");
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setBounds(353, 532, 60, 60);
		contentPane.add(lbl18);
		
		lbl17 = new JLabel("");
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setBounds(416, 532, 60, 60);
		contentPane.add(lbl17);
		
		lbl16 = new JLabel("");
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setBounds(479, 532, 60, 60);
		contentPane.add(lbl16);
		
		lbl15 = new JLabel("");
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setBounds(543, 532, 60, 60);
		contentPane.add(lbl15);
		
		lbl14 = new JLabel("");
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setBounds(606, 532, 60, 60);
		contentPane.add(lbl14);
		
		lbl13 = new JLabel("");
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setBounds(670, 532, 60, 60);
		contentPane.add(lbl13);
		
		lbl12 = new JLabel("");
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setBounds(734, 532, 60, 60);
		contentPane.add(lbl12);
		
		lbl11 = new JLabel("");
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setBounds(797, 532, 60, 60);
		contentPane.add(lbl11);
		
		lbl10 = new JLabel("");
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setBounds(797, 596, 60, 60);
		contentPane.add(lbl10);
		
		lbl9 = new JLabel("");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setBounds(734, 596, 60, 60);
		contentPane.add(lbl9);
		
		lbl8 = new JLabel("");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setBounds(670, 596, 60, 60);
		contentPane.add(lbl8);
		
		lbl7 = new JLabel("");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setBounds(606, 596, 60, 60);
		contentPane.add(lbl7);
		
		lbl6 = new JLabel("");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setBounds(543, 596, 60, 60);
		contentPane.add(lbl6);
		
		lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setBounds(479, 596, 60, 60);
		contentPane.add(lbl5);
		
		lbl4 = new JLabel("");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBounds(416, 596, 60, 60);
		contentPane.add(lbl4);
		
		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(353, 596, 60, 60);
		contentPane.add(lbl3);
		
		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(288, 596, 60, 60);
		contentPane.add(lbl2);
		
		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(225, 596, 60, 60);
		contentPane.add(lbl1);
		
		lblDice = new JLabel("Dice");
		lblDice.setIcon(null);
		lblDice.setHorizontalAlignment(SwingConstants.CENTER);
		lblDice.setBounds(53, 414, 110, 110);
		contentPane.add(lblDice);
		
		lblBackground = new JLabel("");
		lblBackground.setBounds(201, 0, 681, 681);
		contentPane.add(lblBackground);
		lblBackground.setIcon(new ImageIcon(Test.class.getResource("/Image/Image 650.jpg")));
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblP1 = new JLabel("");
		lblP1.setIcon(new ImageIcon(Test.class.getResource("/Image/player 1.png")));
		lblP1.setBounds(1093, 253, 50, 50);
		contentPane.add(lblP1);
		
		lblP3 = new JLabel("");
		lblP3.setIcon(new ImageIcon(Test.class.getResource("/Image/player 3.png")));
		lblP3.setBounds(1093, 378, 50, 50);
		contentPane.add(lblP3);
		
		lblP2 = new JLabel("");
		lblP2.setIcon(new ImageIcon(Test.class.getResource("/Image/player 2.png")));
		lblP2.setBounds(1093, 314, 50, 50);
		contentPane.add(lblP2);
		
		lblP4 = new JLabel("");
		lblP4.setIcon(new ImageIcon(Test.class.getResource("/Image/player 4.png")));
		lblP4.setBounds(1093, 441, 50, 50);
		contentPane.add(lblP4);
		
		lblP5 = new JLabel("");
		lblP5.setIcon(new ImageIcon(Test.class.getResource("/Image/player 5.png")));
		lblP5.setBounds(1093, 504, 50, 50);
		contentPane.add(lblP5);
		
		lblP6 = new JLabel("");
		lblP6.setIcon(new ImageIcon(Test.class.getResource("/Image/player 6.png")));
		lblP6.setBounds(1093, 568, 50, 50);
		contentPane.add(lblP6);
		
		lP1 = new JLabel("Player 1");
		lP1.setHorizontalAlignment(SwingConstants.CENTER);
		lP1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP1.setBounds(912, 252, 133, 50);
		contentPane.add(lP1);
		
		lP2 = new JLabel("Player 2");
		lP2.setHorizontalAlignment(SwingConstants.CENTER);
		lP2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP2.setBounds(912, 315, 133, 50);
		contentPane.add(lP2);
		
		lP3 = new JLabel("Player 3");
		lP3.setHorizontalAlignment(SwingConstants.CENTER);
		lP3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP3.setBounds(912, 378, 133, 50);
		contentPane.add(lP3);
		
		lP4 = new JLabel("Player 4");
		lP4.setHorizontalAlignment(SwingConstants.CENTER);
		lP4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP4.setBounds(912, 441, 133, 50);
		contentPane.add(lP4);
		
		lP5 = new JLabel("Player 5");
		lP5.setHorizontalAlignment(SwingConstants.CENTER);
		lP5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP5.setBounds(912, 504, 133, 50);
		contentPane.add(lP5);
		
		lP6 = new JLabel("Player 6");
		lP6.setHorizontalAlignment(SwingConstants.CENTER);
		lP6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lP6.setBounds(912, 568, 133, 50);
		contentPane.add(lP6);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Display Board", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 24, 205, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblDisplay = new JLabel("");
		lblDisplay.setBounds(6, 16, 189, 142);
		panel.add(lblDisplay);
		
		dsPlayer = new JLabel("Player");
		dsPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		dsPlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		dsPlayer.setBounds(10, 65, 98, 50);
		panel.add(dsPlayer);
		
		dsBtn = new JLabel("");
		dsBtn.setBounds(118, 65, 50, 50);
		panel.add(dsBtn);
		
		lblScoreP1 = new JLabel("DUCK");
		lblScoreP1.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP1.setBounds(1153, 251, 60, 50);
		contentPane.add(lblScoreP1);
		
		lblScoreP2 = new JLabel("DUCK");
		lblScoreP2.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP2.setBounds(1153, 314, 60, 50);
		contentPane.add(lblScoreP2);
		
		lblScoreP3 = new JLabel("DUCK");
		lblScoreP3.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP3.setBounds(1153, 378, 60, 50);
		contentPane.add(lblScoreP3);
		
		lblScoreP4 = new JLabel("DUCK");
		lblScoreP4.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP4.setBounds(1153, 441, 60, 50);
		contentPane.add(lblScoreP4);
		
		lblScoreP5 = new JLabel("DUCK");
		lblScoreP5.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP5.setBounds(1153, 504, 60, 50);
		contentPane.add(lblScoreP5);
		
		lblScoreP6 = new JLabel("DUCK");
		lblScoreP6.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreP6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblScoreP6.setBounds(1151, 575, 60, 50);
		contentPane.add(lblScoreP6);
	
		
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Next Player", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(973, 33, 205, 125);
		contentPane.add(panel_1);
		
		label = new JLabel("");
		label.setBounds(6, 16, 189, 142);
		panel_1.add(label);
		
		dsNxtPlayer = new JLabel("Player 1");
		dsNxtPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		dsNxtPlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		dsNxtPlayer.setBounds(10, 65, 98, 50);
		panel_1.add(dsNxtPlayer);
		
		dsBtnNxt = new JLabel("");
		dsBtnNxt.setBounds(118, 65, 50, 50);
		panel_1.add(dsBtnNxt);
	
		dsBtnNxt.setIcon(new ImageIcon(Test.class.getResource("/Image/player 1.png")));
		
		lblLoc = new JLabel("Location");
		lblLoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoc.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoc.setBounds(21, 253, 170, 88);
		contentPane.add(lblLoc);
		
		btnRestart = new JButton("Restart");
		btnRestart.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Restart?", "Restart!!!", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					dispose();
					Test frame = new Test();
					frame.setVisible(true);
				}
			}
		});
		btnRestart.setBounds(1093, 629, 153, 41);
		contentPane.add(btnRestart);
		
		Initialization();
		
	}
	
	/*
	 * Set player
	 * 
	 * check next player who has not yet won
	 */
	public void Turn(){
		do{
			player++;
			if(player > playerNo){
				player-=playerNo;
			}
		}while(begin[player-1] == "won");
		
	}
	
	/*
	 * Game over
	 * 
	 * check if only 1 person remains
	 * 
	 */
	public void GameOver(){
		int count = 0;
		int lost = -1;
		for(int i=0; i<playerNo; i++){
			if(begin[i] != "won"){
				count++;
				if(count>1){
					break;
				}
			}
			else{
				lost = i;
			}
		}
		if(count == 1){
			JOptionPane.showMessageDialog(null, playerName[lost]+" has Lost!");
			btnDice.setEnabled(false);
		}
	}
	
	/*
	 * Random number generator
	 * 
	 * Randomize
	 * Set point
	 * show dice image
	 */
	public void Dice(){
		Random rn = new Random();
		
		point = rn.nextInt(6)+1;
		
		String dice = String.valueOf(point);
		String location = "/Image/dice "+dice+".jpg";
		lblDice.setIcon(new ImageIcon(Test.class.getResource(location)));
		
		//System.out.println("Dice: "+dice);
	}
	
	
	
	/*
	 * Displays
	 * 
	 * Running player name & button color
	 * Check next player
	 * Next player name & button color
	 */
	public void Display(){
		dsPlayer.setText(playerName[player-1]);
		dsBtn.setIcon(new ImageIcon(Test.class.getResource("/Image/player "+String.valueOf(player)+".png")));
		
		int pTurn = player;
			do{									//while next players already won, skip next player
				pTurn++;
				if(pTurn > playerNo){
					pTurn = 1;
				}
				
			}while(begin[pTurn-1] == "won");	
		
		dsNxtPlayer.setText(playerName[pTurn-1]);
		dsBtnNxt.setIcon(new ImageIcon(Test.class.getResource("/Image/player "+String.valueOf(pTurn)+".png")));
	}
	
	/*
	 * Checks if a certain block has ladder or snake
	 */
	public void SkipTest(int score){
		if(score == 1 || score == 4  || score == 9  || score == 21 || score == 28 || score == 51 || score == 71 || score == 80 ){
			System.out.println("Ladder at "+score);
			JOptionPane.showMessageDialog(null, "Climbed Ladder at "+String.valueOf(score));
		}
		else if(score == 17  ||score == 54 ||  score == 62 || score == 64  ||score == 87  || score == 93  || score == 95  || score == 98){
			System.out.println("Snake at "+score);
			JOptionPane.showMessageDialog(null, "Eaten by Snaked at "+String.valueOf(score));
		}
	}
	
	/*
	 * Skips to a certain block
	 */
	public int Skipper(int score){
		if(score == 1)
			return 38;
		else if(score == 4)
			return 14;
		else if(score == 9)
			return 31;
		else if(score == 17)
			return 7;
		
		else if(score == 21)
			return 42;
		else if(score == 28)
			return 84;
		else if(score == 51)
			return 67;
		else if(score == 54)
			return 34;
		else if(score == 62)
			return 19;
		else if(score == 64)
			return 60;
		else if(score == 71)
			return 91;
		else if(score == 80)
			return 100;
		else if(score == 87)
			return 24;
		else if(score == 93)
			return 73;
		else if(score == 95)
			return 75;
		else if(score == 98)
			return 79;
		else
			return score;
		
	}
	
	/*
	 * Set Player
	 * Previous location
	 * new location
	 * set block
	 * remove block
	 */
	public void PlayerTurn(){
		System.out.println(playerName[player-1] );
		int temp;
		
		if(Skipper(players[player-1]+point+xPoint) <= 100){
			temp = players[player-1]+point+xPoint;
			players[player-1] = Skipper(temp);
			Paint(playerLocation[player-1],temp);
			playerLocation[player-1] = players[player-1];
			lblLoc.setText("At Block "+String.valueOf(players[player-1]));
			if(player == 1)
				lblScoreP1.setText(String.valueOf(players[player-1]));
			else if(player == 2)
				lblScoreP2.setText(String.valueOf(players[player-1]));
			else if(player == 3)
				lblScoreP3.setText(String.valueOf(players[player-1]));
			else if(player == 4)
				lblScoreP4.setText(String.valueOf(players[player-1]));
			else if(player == 5)
				lblScoreP5.setText(String.valueOf(players[player-1]));
			else if(player == 6)
				lblScoreP6.setText(String.valueOf(players[player-1]));
		}
		if(players[player-1] == 100){
			begin[player-1] = "won";
			JOptionPane.showMessageDialog(null, playerName[player-1]+" has Won!");
			
			if(player == 1)
				lblScoreP1.setText(place[++won]);
			else if(player == 2)
				lblScoreP2.setText(place[++won]);
			else if(player == 3)
				lblScoreP3.setText(place[++won]);
			else if(player == 4)
				lblScoreP4.setText(place[++won]);
			else if(player == 5)
				lblScoreP5.setText(place[++won]);
			else if(player == 6)
				lblScoreP6.setText(place[++won]);
		}
		
		
	}
	

	public void RemoveImage(int x){
		//System.out.println("Remove Image at "+ String.valueOf(x));
		if(x == 1){
			lbl1.setVisible(false);
		}
		else if(x == 2){
			lbl2.setVisible(false);
		}
		else if(x == 3){
			lbl3.setVisible(false);
		}
		else if(x == 4){
			lbl4.setVisible(false);
		}
		else if(x == 5){
			lbl5.setVisible(false);
		}
		else if(x == 6){
			lbl6.setVisible(false);
		}
		else if(x == 7){
			lbl7.setVisible(false);
		}
		else if(x == 8){
			lbl8.setVisible(false);
		}
		else if(x == 9){
			lbl9.setVisible(false);
		}
		else if(x == 10){
			lbl10.setVisible(false);
		}
		else if(x == 11){
			lbl11.setVisible(false);
		}
		else if(x == 12){
			lbl12.setVisible(false);
		}
		else if(x == 13){
			lbl13.setVisible(false);
		}
		else if(x == 14){
			lbl14.setVisible(false);
		}
		else if(x == 15){
			lbl15.setVisible(false);
		}
		else if(x == 16){
			lbl16.setVisible(false);
		}
		else if(x == 17){
			lbl17.setVisible(false);
		}
		else if(x == 18){
			lbl18.setVisible(false);
		}
		else if(x == 19){
			lbl19.setVisible(false);
		}
		else if(x == 20){
			lbl20.setVisible(false);
		}
		else if(x == 21){
			lbl21.setVisible(false);
		}
		else if(x == 22){
			lbl22.setVisible(false);
		}
		else if(x == 23){
			lbl23.setVisible(false);
		}
		else if(x == 24){
			lbl24.setVisible(false);
		}
		else if(x == 25){
			lbl25.setVisible(false);
		}
		else if(x == 26){
			lbl26.setVisible(false);
		}
		else if(x == 27){
			lbl27.setVisible(false);
		}
		else if(x == 28){
			lbl28.setVisible(false);
		}
		else if(x == 29){
			lbl29.setVisible(false);
		}
		else if(x == 30){
			lbl30.setVisible(false);
		}
		else if(x == 31){
			lbl31.setVisible(false);
		}
		else if(x == 32){
			lbl32.setVisible(false);
		}
		else if(x == 33){
			lbl33.setVisible(false);
		}
		else if(x == 34){
			lbl34.setVisible(false);
		}
		else if(x == 35){
			lbl35.setVisible(false);
		}
		else if(x == 36){
			lbl36.setVisible(false);
		}
		else if(x == 37){
			lbl37.setVisible(false);
		}
		else if(x == 38){
			lbl38.setVisible(false);
		}
		else if(x == 39){
			lbl39.setVisible(false);
		}
		else if(x == 40){
			lbl40.setVisible(false);
		}
		else if(x == 41){
			lbl41.setVisible(false);
		}
		else if(x == 42){
			lbl42.setVisible(false);
		}
		else if(x == 43){
			lbl43.setVisible(false);
		}
		else if(x == 44){
			lbl44.setVisible(false);
		}
		else if(x == 45){
			lbl45.setVisible(false);
		}
		else if(x == 46){
			lbl46.setVisible(false);
		}
		else if(x == 47){
			lbl47.setVisible(false);
		}
		else if(x == 48){
			lbl48.setVisible(false);
		}
		else if(x == 49){
			lbl49.setVisible(false);
		}
		else if(x == 50){
			lbl50.setVisible(false);
		}
		
		
		else if(x == 51){
			lbl51.setVisible(false);
		}
		else if(x == 52){
			lbl52.setVisible(false);
		}
		else if(x == 53){
			lbl53.setVisible(false);
		}
		else if(x == 54){
			lbl54.setVisible(false);
		}
		else if(x == 55){
			lbl55.setVisible(false);
		}
		else if(x == 56){
			lbl56.setVisible(false);
		}
		else if(x == 57){
			lbl57.setVisible(false);
		}
		else if(x == 58){
			lbl58.setVisible(false);
		}
		else if(x == 59){
			lbl59.setVisible(false);
		}
		else if(x == 60){
			lbl60.setVisible(false);
		}
		
		else if(x == 61){
			lbl61.setVisible(false);
		}
		else if(x == 62){
			lbl62.setVisible(false);
		}
		else if(x == 63){
			lbl63.setVisible(false);
		}
		else if(x == 64){
			lbl64.setVisible(false);
		}
		else if(x == 65){
			lbl65.setVisible(false);
		}
		else if(x == 66){
			lbl66.setVisible(false);
		}
		else if(x == 67){
			lbl67.setVisible(false);
		}
		else if(x == 68){
			lbl68.setVisible(false);
		}
		else if(x == 69){
			lbl69.setVisible(false);
		}
		else if(x == 70){
			lbl70.setVisible(false);
		}
		
		else if(x == 71){
			lbl71.setVisible(false);
		}
		else if(x == 72){
			lbl72.setVisible(false);
		}
		else if(x == 73){
			lbl73.setVisible(false);
		}
		else if(x == 74){
			lbl74.setVisible(false);
		}
		else if(x == 75){
			lbl75.setVisible(false);
		}
		else if(x == 76){
			lbl76.setVisible(false);
		}
		else if(x == 77){
			lbl77.setVisible(false);
		}
		else if(x == 78){
			lbl78.setVisible(false);
		}
		else if(x == 79){
			lbl79.setVisible(false);
		}
		else if(x == 80){
			lbl80.setVisible(false);
		}
		
		else if(x == 81){
			lbl81.setVisible(false);
		}
		else if(x == 82){
			lbl82.setVisible(false);
		}
		else if(x == 83){
			lbl83.setVisible(false);
		}
		else if(x == 84){
			lbl84.setVisible(false);
		}
		else if(x == 85){
			lbl85.setVisible(false);
		}
		else if(x == 86){
			lbl86.setVisible(false);
		}
		else if(x == 87){
			lbl87.setVisible(false);
		}
		else if(x == 88){
			lbl88.setVisible(false);
		}
		else if(x == 89){
			lbl89.setVisible(false);
		}
		else if(x == 90){
			lbl90.setVisible(false);
		}
		
		else if(x == 91){
			lbl91.setVisible(false);
		}
		else if(x == 92){
			lbl92.setVisible(false);
		}
		else if(x == 93){
			lbl93.setVisible(false);
		}
		else if(x == 94){
			lbl94.setVisible(false);
		}
		else if(x == 95){
			lbl95.setVisible(false);
		}
		else if(x == 96){
			lbl96.setVisible(false);
		}
		else if(x == 97){
			lbl97.setVisible(false);
		}
		else if(x == 98){
			lbl98.setVisible(false);
		}
		else if(x == 99){
			lbl99.setVisible(false);
		}
		else if(x == 100){
			lbl100.setVisible(false);
		}
		
		BlockChecker(x);
		if(PlayerPos != -1){
			SetImage(x,PlayerPos);
		}
		
	}
	
	/*
	 * Check if a block already had another player
	 */
	public void BlockChecker(int score){
		for(int i=playerNo; i>0; i--){
			if(playerLocation[i-1] == score && player != i && playerLocation[i-1] != -1){
				PlayerPos = i;
				System.out.println("Block matched");
				return;
				
			}
		}
		PlayerPos = -1;
		
	}
	
	
	/*
	 * Set Image at a block (block no, player no);
	 */
	public void SetImage(int x,int pl){
	
		//JOptionPane.showMessageDialog(null, "Insert Image at "+ String.valueOf(x));		
		
		//System.out.println("Insert Image player "+ String.valueOf(pl));
		String location = "/Image/player "+String.valueOf(pl)+".png";	// set Player button
		
		
		
		
		if(x == 1){
			lbl1.setVisible(true);
			lbl1.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 2){
			lbl2.setVisible(true);
			lbl2.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 3){
			lbl3.setVisible(true);
			lbl3.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 4){
			lbl4.setVisible(true);
			lbl4.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 5){
			lbl5.setVisible(true);
			lbl5.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 6){
			lbl6.setVisible(true);
			lbl6.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 7){
			lbl7.setVisible(true);
			lbl7.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 8){
			lbl8.setVisible(true);
			lbl8.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 9){
			lbl9.setVisible(true);
			lbl9.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 10){
			lbl10.setVisible(true);
			lbl10.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 11){
			lbl11.setVisible(true);
			lbl11.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 12){
			lbl12.setVisible(true);
			lbl12.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 13){
			lbl13.setVisible(true);
			lbl13.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 14){
			lbl14.setVisible(true);
			lbl14.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 15){
			lbl15.setVisible(true);
			lbl15.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 16){
			lbl16.setVisible(true);
			lbl16.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 17){
			lbl17.setVisible(true);
			lbl17.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 18){
			lbl18.setVisible(true);
			lbl18.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 19){
			lbl19.setVisible(true);
			lbl19.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 20){
			lbl20.setVisible(true);
			lbl20.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 21){
			lbl21.setVisible(true);
			lbl21.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 22){
			lbl22.setVisible(true);
			lbl22.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 23){
			lbl23.setVisible(true);
			lbl23.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 24){
			lbl24.setVisible(true);
			lbl24.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 25){
			lbl25.setVisible(true);
			lbl25.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 26){
			lbl26.setVisible(true);
			lbl26.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 27){
			lbl27.setVisible(true);
			lbl27.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 28){
			lbl28.setVisible(true);
			lbl28.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 29){
			lbl29.setVisible(true);
			lbl29.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 30){
			lbl30.setVisible(true);
			lbl30.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 31){
			lbl31.setVisible(true);
			lbl31.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 32){
			lbl32.setVisible(true);
			lbl32.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 33){
			lbl33.setVisible(true);
			lbl33.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 34){
			lbl34.setVisible(true);
			lbl34.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 35){
			lbl35.setVisible(true);
			lbl35.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 36){
			lbl36.setVisible(true);
			lbl36.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 37){
			lbl37.setVisible(true);
			lbl37.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 38){
			lbl38.setVisible(true);
			lbl38.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 39){
			lbl39.setVisible(true);
			lbl39.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 40){
			lbl40.setVisible(true);
			lbl40.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 41){
			lbl41.setVisible(true);
			lbl41.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 42){
			lbl42.setVisible(true);
			lbl42.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 43){
			lbl43.setVisible(true);
			lbl43.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 44){
			lbl44.setVisible(true);
			lbl44.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 45){
			lbl45.setVisible(true);
			lbl45.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 46){
			lbl46.setVisible(true);
			lbl46.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 47){
			lbl47.setVisible(true);
			lbl47.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 48){
			lbl48.setVisible(true);
			lbl48.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 49){
			lbl49.setVisible(true);
			lbl49.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 50){
			lbl50.setVisible(true);
			lbl50.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		
		else if(x == 51){
			lbl51.setVisible(true);
			lbl51.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 52){
			lbl52.setVisible(true);
			lbl52.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 53){
			lbl53.setVisible(true);
			lbl53.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 54){
			lbl54.setVisible(true);
			lbl54.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 55){
			lbl55.setVisible(true);
			lbl55.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 56){
			lbl56.setVisible(true);
			lbl56.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 57){
			lbl57.setVisible(true);
			lbl57.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 58){
			lbl58.setVisible(true);
			lbl58.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 59){
			lbl59.setVisible(true);
			lbl59.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 60){
			lbl60.setVisible(true);
			lbl60.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		else if(x == 61){
			lbl61.setVisible(true);
			lbl61.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 62){
			lbl62.setVisible(true);
			lbl62.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 63){
			lbl63.setVisible(true);
			lbl63.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 64){
			lbl64.setVisible(true);
			lbl64.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 65){
			lbl65.setVisible(true);
			lbl65.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 66){
			lbl66.setVisible(true);
			lbl66.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 67){
			lbl67.setVisible(true);
			lbl67.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 68){
			lbl68.setVisible(true);
			lbl68.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 69){
			lbl69.setVisible(true);
			lbl69.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 70){
			lbl70.setVisible(true);
			lbl70.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		else if(x == 71){
			lbl71.setVisible(true);
			lbl71.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 72){
			lbl72.setVisible(true);
			lbl72.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 73){
			lbl73.setVisible(true);
			lbl73.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 74){
			lbl74.setVisible(true);
			lbl74.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 75){
			lbl75.setVisible(true);
			lbl75.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 76){
			lbl76.setVisible(true);
			lbl76.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 77){
			lbl77.setVisible(true);
			lbl77.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 78){
			lbl78.setVisible(true);
			lbl78.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 79){
			lbl79.setVisible(true);
			lbl79.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 80){
			lbl80.setVisible(true);
			lbl80.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		else if(x == 81){
			lbl81.setVisible(true);
			lbl81.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 82){
			lbl82.setVisible(true);
			lbl82.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 83){
			lbl83.setVisible(true);
			lbl83.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 84){
			lbl84.setVisible(true);
			lbl84.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 85){
			lbl85.setVisible(true);
			lbl85.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 86){
			lbl86.setVisible(true);
			lbl86.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 87){
			lbl87.setVisible(true);
			lbl87.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 88){
			lbl88.setVisible(true);
			lbl88.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 89){
			lbl89.setVisible(true);
			lbl89.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 90){
			lbl90.setVisible(true);
			lbl90.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		else if(x == 91){
			lbl91.setVisible(true);
			lbl91.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 92){
			lbl92.setVisible(true);
			lbl92.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 93){
			lbl93.setVisible(true);
			lbl93.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 94){
			lbl94.setVisible(true);
			lbl94.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 95){
			lbl95.setVisible(true);
			lbl95.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 96){
			lbl96.setVisible(true);
			lbl96.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 97){
			lbl97.setVisible(true);
			lbl97.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 98){
			lbl98.setVisible(true);
			lbl98.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 99){
			lbl99.setVisible(true);
			lbl99.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		else if(x == 100){
			lbl100.setVisible(true);
			lbl100.setIcon(new ImageIcon(Test.class.getResource(location)));
		}
		
		
	}
		
	/*
	 * Initialize
	 * Take input at Initialization
	 */
	public void Initialization(){
		
		// Input no of players
		
				try{
					do{
						JOptionPane.showMessageDialog(null, "Players must be between 2-6!");
						playerNo = Integer.parseInt(JOptionPane.showInputDialog("Enter No of players"));
					}while(playerNo < 2 || playerNo > 6);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Invalid players");
					System.exit(0);		// Error and exit
				}
		
		
		// Initialize variables
				playerLocation= new int[playerNo];
				begin = new String[playerNo];
				playerName = new String[playerNo];
				players = new int[playerNo];
				for(int i=0; i<playerNo; i++){
					playerLocation[i] = -1;
					begin[i] = "ready";
					playerName[i] = "Player "+String.valueOf(i+1);
					players[i] = 0;
				}
			
		
		// Input Names
				int confirm = JOptionPane.showConfirmDialog(null, "Do you want Skip Names?", "Player!", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.NO_OPTION){
					for(int i=0; i<playerNo; i++){
					
						try{
						
							do{
								playerName[i] = JOptionPane.showInputDialog("Enter Name of Player "+ String.valueOf(i+1)+" :");
								JOptionPane.showMessageDialog(null, playerName[i]);
							}while(playerName[i].equals(""));
						}catch(Exception e){
							JOptionPane.showMessageDialog(null, "Invalid name");
							playerName[i] = "Player "+ String.valueOf(i+1);
						}
					}
				}
				
		
		// Set names and and disable unwanted player Box
				lP1.setText(playerName[0]);
				lP2.setText(playerName[1]);
				
				if(playerNo == 2){
					// = Integer.parseInt(JOptionPane.showInputDialog("Enter No of players"));
					
					
					lP3.setVisible(false);
					lblP3.setVisible(false);
					lblScoreP3.setVisible(false);
					
					lP4.setVisible(false);
					lblP4.setVisible(false);
					lblScoreP4.setVisible(false);
					
					lP5.setVisible(false);
					lblP5.setVisible(false);
					lblScoreP5.setVisible(false);
					
					lP6.setVisible(false);
					lblP6.setVisible(false);
					lblScoreP6.setVisible(false);
				}
				else if(playerNo == 3){
					lP3.setText(playerName[2]);
					
					lP4.setVisible(false);
					lblP4.setVisible(false);
					lblScoreP4.setVisible(false);
					
					lP5.setVisible(false);
					lblP5.setVisible(false);
					lblScoreP5.setVisible(false);
					
					lP6.setVisible(false);
					lblP6.setVisible(false);
					lblScoreP6.setVisible(false);
				}
				else if(playerNo == 4){
					lP3.setText(playerName[2]);
					lP4.setText(playerName[3]);
					
					lP5.setVisible(false);
					lblP5.setVisible(false);
					lblScoreP5.setVisible(false);
					
					lP6.setVisible(false);
					lblP6.setVisible(false);
					lblScoreP6.setVisible(false);
				}
				else if(playerNo == 5){
					lP3.setText(playerName[2]);
					lP4.setText(playerName[3]);
					lP5.setText(playerName[4]);
					
					lP6.setVisible(false);
					lblP6.setVisible(false);
					lblScoreP6.setVisible(false);
				}
				else{
					lP3.setText(playerName[2]);
					lP4.setText(playerName[3]);
					lP5.setText(playerName[4]);
					lP6.setText(playerName[5]);
				}
				
				dsNxtPlayer.setText(playerName[0]);
	}
	
	/*
	 * Set Blocks and remove blocks from x to y
	 */
	public void Paint(int x, int y){
		System.out.println("Paint from: "+x+" to "+y);
		int p = player;
		new Thread() {
	        @Override
	        public void run() {
	            try {
	            	btnDice.setEnabled(false);
	            	btnDice.setVisible(false);
	            	Thread.sleep(500);
	            	for(int i=x; i<y; i++){
	            		//System.out.println("Paint Player after: "+p);
	            		RemoveImage(i);
	            		Thread.sleep(50);
		            	SetImage(i+1,p);
		                Thread.sleep(500);
	            	}
	            	if(Skipper(y) != y){
	            		SkipTest(y);
		            	RemoveImage(y);
		            	System.out.println("Skip removed at"+String.valueOf(y));
		            	Thread.sleep(100);
		            	SetImage(Skipper(y),p);
	            	}
	            	btnDice.setVisible(true);
	            	btnDice.setEnabled(true);
	            } catch (InterruptedException ex) {
	                Thread.currentThread().interrupt();
	                JOptionPane.showMessageDialog(null, "Paint timer error!");
	            }

	        }
	    }.start();
	    
	    
	    ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	                

	        }
	    };
	    javax.swing.Timer t = new javax.swing.Timer(1000, taskPerformer);
	    t.setRepeats(false);
	    t.start();
	}

	/*
	 * Button Action
	 * 
	 * set Location label to null
	 * 
	 * Dice
	 * Display
	 */
	public void GameStart(){
		btnDice.setEnabled(false);
		lblLoc.setText("");
		Dice();
		Display();
		
		MultiDice();
		GameOver();
		btnDice.setEnabled(true);
	}
	
	/*
	 * Checks if multi dice needed
	 * if player started -> 
	 * 		if point != 6 -> Set to player Turn, xPoint = 0 & Turn
	 * 		if point = 6 -> 
	 * 						if xPoint = 0 -> set xPoint = 6
	 * 						if xPoint = 6 -> set xPoint = 12
	 * 						if xPoint = 12 -> set xPoint = 0
	 * 
	 * else
	 * 		if point = 1 -> set 
	 */
	
	public void MultiDice(){
				if(begin[player-1] == "play"){
					
					if(point != 6){
						PlayerTurn();
						xPoint = 0;
						Turn();
					}
					
					else if(point == 6){
						if(xPoint == 0)
							xPoint = 6;
						else if(xPoint == 6)
							xPoint = 12;
						else if(xPoint == 12)
							xPoint = 0;
					}
				}
				
				else if(point == 1){
						begin[player-1] = "play";
						JOptionPane.showMessageDialog(null,playerName[player-1]+" has started the game");
					}
				
				else{
						Turn();
				}
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
}
