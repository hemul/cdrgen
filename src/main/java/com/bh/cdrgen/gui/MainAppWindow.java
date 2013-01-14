package com.bh.cdrgen.gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class MainAppWindow extends JFrame {

	private static final long serialVersionUID = 1234567890123L;

	/**
	 * Create the frame.
	 */
	public MainAppWindow() {
		initializeGUIComponents();
	}
	
	private void initializeGUIComponents() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(
						MainAppWindow.class.getResource(
								"/com/bh/cdrgen/images/WindowTitleIcon.png"
						)
				)
		);
		setTitle("CDR Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 580);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);

		JMenu submenuNew = new JMenu("New");
		menuFile.add(submenuNew);

		JMenuItem menuItemStream = new JMenuItem("Stream");
		menuItemStream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NewStreamDialog dialog = new NewStreamDialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		submenuNew.add(menuItemStream);

		JMenuItem menuItemBackup = new JMenuItem("Backup");
		menuFile.add(menuItemBackup);

		JMenuItem menuItemRestore = new JMenuItem("Restore");
		menuFile.add(menuItemRestore);

		JMenu menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);

		JMenuItem menuItemCopy = new JMenuItem("Copy");
		menuEdit.add(menuItemCopy);

		JMenuItem menuItemPaste = new JMenuItem("Paste");
		menuEdit.add(menuItemPaste);

		JMenuItem menuItemCut = new JMenuItem("Cut");
		menuEdit.add(menuItemCut);

		JMenuItem menuItemDelete = new JMenuItem("Delete");
		menuEdit.add(menuItemDelete);

		JMenu menuStream = new JMenu("Stream");
		menuBar.add(menuStream);

		JMenuItem menuItemConfigure = new JMenuItem("Configure");
		menuStream.add(menuItemConfigure);

		JMenuItem menuItemLog = new JMenuItem("Log");
		menuStream.add(menuItemLog);

		JMenuItem menuItemAliases = new JMenuItem("Aliases");
		menuStream.add(menuItemAliases);

		JMenuItem menuItemRemove = new JMenuItem("Remove");
		menuStream.add(menuItemRemove);

		JMenu menuActions = new JMenu("Actions");
		menuBar.add(menuActions);

		JMenuItem menuItemRun = new JMenuItem("Run");
		menuActions.add(menuItemRun);

		JMenuItem menuItemStop = new JMenuItem("Stop");
		menuActions.add(menuItemStop);

		JMenuItem menuItemSchedule = new JMenuItem("Schedule");
		menuActions.add(menuItemSchedule);

		JMenu menuHelp = new JMenu("Help");
		menuBar.add(menuHelp);

		JMenuItem menuItemAbout = new JMenuItem("About");
		menuHelp.add(menuItemAbout);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		toolBar.setFloatable(false);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane
				.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		desktopPane.setBackground(Color.WHITE);

		JPanel statisticsPanel = new JPanel();
		statisticsPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null,null));
		
		GroupLayout contentPaneGroupLayout = new GroupLayout(contentPane);
		contentPaneGroupLayout.setHorizontalGroup(
				contentPaneGroupLayout.createParallelGroup(
						Alignment.LEADING
				).addComponent(
						statisticsPanel, 
						GroupLayout.DEFAULT_SIZE, 
						714,
						Short.MAX_VALUE
				).addComponent(
						desktopPane, 
						GroupLayout.DEFAULT_SIZE, 
						714,
						Short.MAX_VALUE
				).addComponent(
						toolBar, 
						Alignment.TRAILING,
						GroupLayout.DEFAULT_SIZE, 
						714, Short.MAX_VALUE
				)
		);
		contentPaneGroupLayout.setVerticalGroup(
				contentPaneGroupLayout.createParallelGroup(
						Alignment.LEADING
				).addGroup(
						contentPaneGroupLayout.createSequentialGroup().addGap(5).addComponent(
								toolBar, 
								GroupLayout.PREFERRED_SIZE, 
								40,
								GroupLayout.PREFERRED_SIZE
						).addPreferredGap(ComponentPlacement.RELATED).addComponent(
								desktopPane, 
								GroupLayout.DEFAULT_SIZE,
								317, 
								Short.MAX_VALUE
						).addPreferredGap(ComponentPlacement.RELATED).addComponent(
								statisticsPanel,
								GroupLayout.PREFERRED_SIZE, 
								137,
								GroupLayout.PREFERRED_SIZE
						)
				)
		);

		JButton runButton = new JButton("");
		runButton.setIcon(new ImageIcon(MainAppWindow.class.getResource("/com/bh/cdrgen/images/StartProcIcon.png")));
		runButton.setEnabled(false);
		toolBar.add(runButton);

		JButton stopButton = new JButton("");
		stopButton.setIcon(new ImageIcon(MainAppWindow.class.getResource("/com/bh/cdrgen/images/StopProcIcon.png")));
		stopButton.setEnabled(false);
		toolBar.add(stopButton);

		JButton cleanupButton = new JButton("");
		cleanupButton.setIcon(new ImageIcon(MainAppWindow.class.getResource("/com/bh/cdrgen/images/ClearIcon.png")));
		cleanupButton.setEnabled(false);
		toolBar.add(cleanupButton);

		JButton scheduleButton = new JButton("");
		toolBar.add(scheduleButton);
		scheduleButton.setIcon(new ImageIcon(MainAppWindow.class.getResource("/com/bh/cdrgen/images/ScheduleIcon.png")));
		scheduleButton.setEnabled(false);

		JButton configButton = new JButton("");
		configButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					StreamPropertiesDialog dialog = new StreamPropertiesDialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception exeption) {
					exeption.printStackTrace();
				}
			}
		});
		toolBar.add(configButton);
		configButton.setIcon(new ImageIcon(MainAppWindow.class.getResource("/com/bh/cdrgen/images/ConfigIcon.png")));
		configButton.setEnabled(false);
		
		contentPane.setLayout(contentPaneGroupLayout);
	}
	
	public void openInitialSetupDialog() {
		try {
			InitialSetupDialog dialog = new InitialSetupDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
