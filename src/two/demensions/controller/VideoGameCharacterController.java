package two.demensions.controller;

import javax.swing.JOptionPane;

import two.demensions.model.VideoGameCharacters;
import two.demensions.view.VideoGameCharacterFrame;

public class VideoGameCharacterController
{
	private VideoGameCharacters[][] myCharacter;
	
	public VideoGameCharacterController()
	{
		myCharacter = new VideoGameCharacters[3][2];
		fillMyCharacterArray();
		appFrame = new VideoGameCharacterFrame(this);
	}
	
	private void fillMyCharacterArray()
	{
		for(int row = 0; row < myCharacter.length; row ++)
		{
			for(int col = myCharacter[row].length-1; col >= 0; col --)
			{
				String name = row + col + "Mario";
				String gameSeries = row + col + "Super Mario Bros.";
				boolean isOld = true;
			}
		}
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to VideoGame land.");
	}

}
