package two.demensions.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import two.demensions.controller.VideoGameCharacterController;

public class VideoGameCharacterPanel extends JPanel
{
	private VideoGameCharacterController baseController;
	private JTable characterTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JScrollPane tablePane;
	
	public VideoGameCharacterPanel(VideoGameCharacterController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Videogame Characters ");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String [] colNames = {"Characters Col 1", "Characters Col 2"};
		DefaultTableModel characterModel = new DefaultTableModel(baseController.getMyCharacter(), colNames);
		characterTable = new JTable(characterModel);
		tablePane = new JScrollPane(characterTable);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(tablePane);
		this.add(titleLabel);
		this.setBackground(Color.BLUE);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 43, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 148, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, tablePane, 120, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, tablePane, 150, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
