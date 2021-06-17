package com.absensi.main.ui;

import com.absensi.main.interfaces.MenuInterface;
import com.absensi.main.interfaces.ModulInterfaces;
import com.absensi.main.interfaces.UIInterface;

public class Menu implements MenuInterface {

	private String menuLabel = "Input Data Karyawan";
	private ModulInterfaces modul;
	
	@Override
	public void showMenu(int index) {
		// TODO Auto-generated method stub
		System.out.println(index + ". " +menuLabel);
	}
	@Override
	public void setModule(ModulInterfaces modul) {
		// TODO Auto-generated method stub
		this.modul=  modul;
	}
	@Override
	public ModulInterfaces getModul() {
		// TODO Auto-generated method stub
		return this.modul;
	}

	

}
