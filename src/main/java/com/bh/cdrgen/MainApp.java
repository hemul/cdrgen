package com.bh.cdrgen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;

public class MainApp extends JFrame {

	private static final long serialVersionUID = 1234567890123L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainApp.class.getResource("/com/bh/cdrgen/images/WindowTitleIcon.png")));
		setTitle("CDR Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 580);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menueFile = new JMenu("File");
		menuBar.add(menueFile);
		
		JMenu mnNew = new JMenu("New");
		menueFile.add(mnNew);
		
		JMenuItem mntmStream = new JMenuItem("Stream");
		mnNew.add(mntmStream);
		
		JMenuItem mntmBackup = new JMenuItem("Backup");
		menueFile.add(mntmBackup);
		
		JMenuItem mntmRestore = new JMenuItem("Restore");
		menueFile.add(mntmRestore);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnEdit.add(mntmDelete);
		
		JMenu mnStream = new JMenu("Stream");
		menuBar.add(mnStream);
		
		JMenuItem mntmConfigure = new JMenuItem("Configure");
		mnStream.add(mntmConfigure);
		
		JMenuItem mntmLog = new JMenuItem("Log");
		mnStream.add(mntmLog);
		
		JMenuItem mntmAliases = new JMenuItem("Aliases");
		mnStream.add(mntmAliases);
		
		JMenuItem mntmRemove = new JMenuItem("Remove");
		mnStream.add(mntmRemove);
		
		JMenu mnActions = new JMenu("Actions");
		menuBar.add(mnActions);
		
		JMenuItem mntmRun = new JMenuItem("Run");
		mnActions.add(mntmRun);
		
		JMenuItem mntmStop = new JMenuItem("Stop");
		mnActions.add(mntmStop);
		
		JMenuItem mntmSchedule = new JMenuItem("Schedule");
		mnActions.add(mntmSchedule);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		toolBar.setFloatable(false);
		
		JPanel statisticsPanel = new JPanel();
		statisticsPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		desktopPane.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(statisticsPanel, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
				.addComponent(toolBar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statisticsPanel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(MainApp.class.getResource("/com/bh/cdrgen/images/StartProcIcon.png")));
		button_3.setEnabled(false);
		toolBar.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(MainApp.class.getResource("/com/bh/cdrgen/images/StopProcIcon.png")));
		button_4.setEnabled(false);
		toolBar.add(button_4);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(MainApp.class.getResource("/com/bh/cdrgen/images/ClearIcon.png")));
		button.setEnabled(false);
		toolBar.add(button);
		
		JButton button_1 = new JButton("");
		toolBar.add(button_1);
		button_1.setIcon(new ImageIcon(MainApp.class.getResource("/com/bh/cdrgen/images/ScheduleIcon.png")));
		button_1.setEnabled(false);
		
		JButton button_2 = new JButton("");
		toolBar.add(button_2);
		button_2.setIcon(new ImageIcon(MainApp.class.getResource("/com/bh/cdrgen/images/ConfigIcon.png")));
		button_2.setEnabled(false);
		contentPane.setLayout(gl_contentPane);
	}
}
