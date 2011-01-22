package de.osmembrane.controller.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import de.osmembrane.Application;
import de.osmembrane.controller.events.ConnectingFunctionsEvent;
import de.osmembrane.exceptions.ControlledException;
import de.osmembrane.exceptions.ExceptionSeverity;
import de.osmembrane.model.pipeline.ConnectorException;
import de.osmembrane.tools.I18N;

/**
 * Action to add a connection between to functions. Receives a
 * {@link ConnectingFunctionsEvent}. Only invoked from the view, should never be
 * visible.
 * 
 * @author tobias_kuhn
 * 
 */
public class AddConnectionAction extends AbstractAction {

	private static final long serialVersionUID = -4952578414694320718L;

	/**
	 * Creates a new {@link AddConnectionAction}
	 */
	public AddConnectionAction() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ConnectingFunctionsEvent cfe = (ConnectingFunctionsEvent) e;

		try {
			cfe.getConnectionSource().addConnectionTo(
					cfe.getConnectionDestination());
		} catch (ConnectorException e1) {
			Application
					.handleException(new ControlledException(this,
							ExceptionSeverity.WARNING, I18N.getInstance()
									.getString(
											"Controller.Actions.AddConnection."
													+ e1.getType())));

		}
	}
}