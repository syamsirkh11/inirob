package com.absensi.main.ui;

import com.absensi.main.interfaces.MenuInterface;
import com.absensi.main.interfaces.ModulInterfaces;

public class MenuLihatKaryawan implements MenuInterface {

	private String ui ="Lihat Data Karyawan";
	private ModulInterfaces modul;
	
	
	@Override
	public void showMenu(int index) {
		// TODO Auto-generated method stub
		System.out.println(index + ". " +ui);
	}
	@Override
	public void setModule(ModulInterfaces modul) {
		// TODO Auto-generated method stub
		this.modul = modul;
	}
	@Override
	public ModulInterfaces getModul() {
		// TODO Auto-generated method stub
		return this.modul;
	}

}
