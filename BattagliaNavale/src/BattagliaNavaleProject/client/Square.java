package BattagliaNavaleProject.client;

import java.awt.Color;
import javax.swing.JPanel;

import BattagliaNavaleProject.Control.DoubleGameGridControl;

public class Square extends JPanel
{
	
	public int x, y, stato;
	
	
	public Square(int x, int y, int stato)
	{
		
		setBackground(Color.white);
		this.x = x;
		this.y = y;
		this.stato = stato;
	}
	
	
	
	public int getx()
	{
		return this.x;
	}
	
	public int gety()
	{
		return this.y;
	}
	
	public int getStato()
	{
		return this.stato;
	}

	//Stato: 0 se è libero
	//		 1 se è occupato
	//		 2 se è colpito
	//		 3 se è affondato
	public void setStato(int stato) {
		this.stato = stato;
	}

	public Color getColor()
	{
		return this.getBackground();
	}
	public void setColor()
	{
		this.setBackground(Color.orange);
	}
	
	public void setColpito()
	{
		this.setBackground(Color.red);
	}
	
	public void setGrigio()
	{
		this.setBackground(Color.gray);
	}
	public void setAffondato()
	{
		this.setBackground(Color.black);
	}
	
	public void setReset()
	{
		this.setBackground(Color.white);
	}
}
