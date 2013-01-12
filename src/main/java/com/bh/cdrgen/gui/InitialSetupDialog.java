package com.bh.cdrgen.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InitialSetupDialog extends JDialog {
	
	private static final long serialVersionUID = 1234567890126L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public InitialSetupDialog() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InitialSetupDialog.class.getResource("/com/bh/cdrgen/images/WindowTitleIcon.png")));
		setTitle("CDR Generator Initial Setup");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
