package com.bh.cdrgen.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StreamPropertiesDialog extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1234567890125L;
	private JTabbedPane tabbedPane;
	private JPanel buttonPane;

	/**
	 * Create the dialog.
	 */
	public StreamPropertiesDialog() {
		setTitle("Stream Properties");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StreamPropertiesDialog.class.getResource("/com/bh/cdrgen/images/ConfigIcon.png")));
		setBounds(100, 100, 700, 500);
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton applyButton = new JButton("Apply");
				buttonPane.add(applyButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
						.addComponent(buttonPane, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
					.addGap(0))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		{
			JPanel recordPanel = new JPanel();
			tabbedPane.addTab("Record", null, recordPanel, null);
		}
		{
			JPanel pathPanel = new JPanel();
			tabbedPane.addTab("Paths", null, pathPanel, null);
		}
		{
			JPanel schedulePanel = new JPanel();
			tabbedPane.addTab("Schedule", null, schedulePanel, null);
		}
		getContentPane().setLayout(groupLayout);
	}

}
