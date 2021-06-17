package com.absensi.main.controller;

import java.util.List;
import java.util.Scanner;

import com.absensi.main.interfaces.MenuInterface;
import com.absensi.main.interfaces.UIInterface;
import com.absensi.main.ui.Header;
import com.absensi.main.ui.Menu;

public class Controller {

	private UIInterface header;
	private List<MenuInterface> menu;
	
	public Controller(UIInterface header , List<MenuInterface> menu) {
		// TODO Auto-generated constructor stub
		
		this.header = header;
		this.menu = menu;
		
	}
	
	
	/**
	 * Fungsi yang akan dipanggil untuk menjalankan program
	 * 
	 * @return void
	 */
	
	public void run () {
	
		paint();
		pilihMenu();
		
	}
	
	/**
	 * Memilih menu
	 * @return void
	 */
	public void pilihMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Pilih Menu : (1 -"+(menu.size())+"):");
		int jawab = scan.nextInt()-1;
		
		runModule(jawab);
	}
	
	/**
	 * Menjalankan modul dari moduleinterface
	 * @param index
	 */
	public void runModule(int index) {
		
		this.menu.get(index).getModul().run();
		
	}
	

	/**
	 * Fungsi untuk menggambar UI Component
	 * 
	 * @return void
	 */
	private void paint() {
		// TODO Auto-generated method stub
		this.header.showUI();
		
		for(int x = 0 ; x < menu.size();x++) {
			MenuInterface menus = menu.get(x);
			menus.showMenu(x+1);
		}
		
		//memakai foreach
//		for (MenuInterface menuInterface : menu) {
//			menuInterface.showMenu();
//		}
		
		//menampilkan input menu
		
		
	}
	
	
	
	
}
