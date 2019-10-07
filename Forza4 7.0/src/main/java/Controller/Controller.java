package Controller;

import java.io.IOException;

import Model.Board;
import Model.Model;
import Player.Player;

public class Controller {
	
	private gestioneIO io;
	public Controller(gestioneIO io) {
		// TODO Auto-generated constructor stub
		this.io=io;
	}
	

	public boolean checkWinner(Model model,Player pippo) {
		if(model.checkWinner(pippo)!=null) {
			io.notifyWin(model.checkWinner(pippo));
			return true;
		}
		return false;
	}
	public void takeColumn(Model model , int c, Player player) throws IOException {
		int column;
		if(model.checkColumnFull(c)==false) {
			model.insertDisc(c , player);
		}else {
		 do{
			io.notifyColumnFull();
			column=io.askColumn(player);
			
			}while(model.checkColumnFull(column)==true);
		 model.insertDisc(column, player);
		}
		
	}
	/*public void checkColumnFull(Model model) {
		// TODO Auto-generated method stub
		return model.checkColumnFull();
	}*/
	public boolean boardIsFull(Model model) {
		if(model.boardIsFull()==true) {
			io.notifyBoardFull();
			return true;
		}
		return false;
	}

}
