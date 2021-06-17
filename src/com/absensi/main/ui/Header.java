package com.absensi.main.ui;

import com.absensi.main.interfaces.UIInterface;

public class Header implements UIInterface {
	
	
	private String headerUI = "*************************************\r\n" + 
			                  "*  Selamat Datang di Input Pegawai  *\r\n" + 
			                  "*                                   *\r\n" + 
			                  "*************************************";

	@Override
	public void showUI() {
		// TODO Auto-generated method stub
		System.out.println(headerUI);
	}

}
