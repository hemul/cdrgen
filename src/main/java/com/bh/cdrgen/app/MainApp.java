package com.bh.cdrgen.app;

import java.awt.EventQueue;

import com.bh.cdrgen.classes.MainGUIThread;

public class MainApp {

	public static void main(String[] args) {
		MainGUIThread mainGUIThread = new MainGUIThread();
		EventQueue.invokeLater(mainGUIThread);
	}
}
