package de.osmembrane.view.frames;

import java.awt.Point;

import de.osmembrane.view.IView;

/**
 * Interface for {@link MainFrame}
 * 
 * @author tobias_kuhn
 * 
 */
public interface IMainFrame extends IView {

	/**
	 * @return the currently selected object on the pipeline of the main frame.
	 */
	public Object getSelected();

	/**
	 * Sets the explanation hint in the inspector panel to hint
	 * 
	 * @param hint
	 *            the hint to display
	 */
	public void setHint(String hint);

	/**
	 * @return the glass pane in front of the {@link MainFrame}'s contents that
	 *         can display data there (mainly Library-to-Pipeline drag & drop)
	 */
	public MainFrameGlassPane getMainGlassPane();
		
	/**
	 * Finds out whether drag & drop can be finished at at. 
	 * @param at {@link Point} to check for
	 * @return whether or not the point is valid drag and drop target
	 */
	public boolean isDragAndDropTarget(Point at); 

}