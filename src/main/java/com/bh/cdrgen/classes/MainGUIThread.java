package com.bh.cdrgen.classes;

import com.bh.cdrgen.gui.MainAppWindow;

public class MainGUIThread implements Runnable{
	public void run() {
		try {
			MainAppWindow mainWindow = new MainAppWindow();
			mainWindow.setVisible(true);
			if (!doesGlobalConfigurationFileExist()) {
				mainWindow.openInitialSetupDialog();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private boolean doesGlobalConfigurationFileExist(){
		return false;
	}
}
