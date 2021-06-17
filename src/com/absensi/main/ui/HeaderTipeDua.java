package com.absensi.main.ui;

import com.absensi.main.interfaces.UIInterface;

public class HeaderTipeDua implements UIInterface {
    private String ui = "  *\r\n" + 
    		" * *\r\n" + 
    		"*   *\r\n" + 
    		"*************************************\r\n" + 
    		"*  Selamat Datang di Input Pegawai  *\r\n" + 
    		"*                                   *\r\n" + 
    		"*************************************";
	@Override
	public void showUI() {
		// TODO Auto-generated method stub
		System.out.println(ui);
	}

}
