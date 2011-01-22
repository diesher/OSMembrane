package de.osmembrane.controller.actions;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

import de.osmembrane.tools.IconLoader;
import de.osmembrane.tools.IconLoader.Size;

/**
 * Action to directly execute the created pipeline on the local shell.
 * 
 * @author tobias_kuhn
 * 
 */
public class ExecutePipelineAction extends AbstractAction {

	private static final long serialVersionUID = -173334958831335922L;

	/**
	 * Creates a new {@link ExecutePipelineAction}
	 */
	public ExecutePipelineAction() {
		putValue(Action.NAME, "Execute Pipeline");
		putValue(Action.SMALL_ICON, new IconLoader("execute_pipeline.png",
				Size.SMALL).get());
		putValue(Action.LARGE_ICON_KEY, new IconLoader("execute_pipeline.png",
				Size.NORMAL).get());
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_X,
				Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO implement
		throw new UnsupportedOperationException();
	}
}