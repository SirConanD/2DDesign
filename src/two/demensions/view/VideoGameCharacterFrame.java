package two.demensions.view;

import javax.swing.JFrame;

import two.demensions.controller.VideoGameCharacterController;

public class VideoGameCharacterFrame extends JFrame
{
	private VideoGameCharacterPanel basePanel;
	
	public VideoGameCharacterFrame(VideoGameCharacterController baseController)
	{
		basePanel = new VideoGameCharacterPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}
}
