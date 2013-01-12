package com.bh.cdrgen.classes;

import java.io.File;

import com.bh.cdrgen.gui.MainAppWindow;

public class MainGUIThread implements Runnable{
	
	private final String PATH_TO_GLOBAL_CONFIGURATION_FILE = "/home/hemul/Programming/workspace/cdrgen/etc/cdrgen.xml";
	
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
		
		int indx = PATH_TO_GLOBAL_CONFIGURATION_FILE.lastIndexOf( File.separator );
		
		String path = PATH_TO_GLOBAL_CONFIGURATION_FILE.substring( 0, indx);
		String fileName = PATH_TO_GLOBAL_CONFIGURATION_FILE.substring( indx+1 );
		
		File directory = new File( path );
		
		boolean found = false;
		for( File f : directory.listFiles() )
		{
		  if( f.getName().equals( fileName ) )
		  {
		    found = true;
		    break;
		  }
		}
		return found;
	}
}
