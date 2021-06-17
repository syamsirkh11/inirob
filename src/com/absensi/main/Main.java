package com.absensi.main;

import java.util.ArrayList;
import java.util.List;

import com.absensi.main.controller.Controller;
import com.absensi.main.interfaces.MenuInterface;
import com.absensi.main.module.InputDataKaryawan;
import com.absensi.main.module.InputDataKaryawanFromFile;
import com.absensi.main.module.LihatDataKaryawan;
import com.absensi.main.ui.Header;
import com.absensi.main.ui.HeaderTipeDua;
import com.absensi.main.ui.HeaderTipeTiga;
import com.absensi.main.ui.Menu;
import com.absensi.main.ui.MenuInputFromFile;
import com.absensi.main.ui.MenuLihatKaryawan;

public class Main {

	public static void main(String[] args) {
		
		//instance object header dan menu
		Header header = new Header();
		// buat menu input data karyawan
		Menu menu = new Menu();
		// Buat menu lihat data karyawan
		MenuLihatKaryawan menuLihat = new MenuLihatKaryawan();
		//buat menu input from file
		MenuInputFromFile menuFromFile = new MenuInputFromFile();
		
		//Buat instance InputDataKaryawan
		InputDataKaryawan inputDataKaryawan = new InputDataKaryawan();
		//set instance modul ke menu
		menu.setModule(inputDataKaryawan);
		
		//Buat instance LihatDataKaryawan
		LihatDataKaryawan  lihatDataKaryawan = new LihatDataKaryawan();
		menuLihat.setModule(lihatDataKaryawan);
		
		//Buat instance InputDataKaryawanFromFile
		
		InputDataKaryawanFromFile dataFromFile = new InputDataKaryawanFromFile();
		menuFromFile.setModule(dataFromFile);
		
		
	    //buat list menu
		List<MenuInterface> lstMenu = new ArrayList<MenuInterface>();
		lstMenu.add(menu);
		lstMenu.add(menuFromFile);
		lstMenu.add(menuLihat);
		
		
		
		
		
		
		Controller controller = new Controller(header, lstMenu);
		//run controllernya
		controller.run();
	}

}
