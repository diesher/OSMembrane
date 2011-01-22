package de.osmembrane.model.pipeline;

import java.io.Serializable;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import de.osmembrane.model.xml.XMLPipe;
import de.osmembrane.model.xml.XMLTask;

/**
 * Represents a task inside of a {@link AbstractFunction}.
 * 
 * @author jakob_jarosch
 */
public abstract class AbstractTask extends Observable implements Observer,
		Serializable {

	private static final long serialVersionUID = 2011011821110001L;

	/**
	 * Returns the description of the {@link AbstractTask}.
	 * 
	 * @return description of the task
	 */
	public abstract String getDescription();

	/**
	 * Returns the name of the {@link AbstractTask}.
	 * 
	 * @return name of the task
	 */
	public abstract String getName();

	/**
	 * Returns the short name of the {@link AbstractTask}.
	 * 
	 * @return short name of the task
	 */
	public abstract String getShortName();

	/**
	 * Returns a human readable name for the {@link AbstractTask}.
	 * 
	 * @return human readable name
	 */
	public abstract String getFriendlyName();

	/**
	 * Returns the uri to the help website for the {@link AbstractTask}.
	 * 
	 * @return uri to the help website
	 */
	public abstract String getHelpURI();

	/**
	 * Returns the parameters for the {@link AbstractTask}.
	 * 
	 * @return array of parameters
	 */
	public abstract AbstractParameter[] getParameters();

	/**
	 * Returns the input pipes for the {@link XMLTask} (required for {@link AbstractFunction}).
	 * 
	 * @return input pipes of the {@link XMLTask}
	 */
	protected abstract List<XMLPipe> getInputPipe();

	/**
	 * Returns the output pipes for the {@link XMLTask} (required for {@link AbstractFunction}).
	 * 
	 * @return output pipes of the {@link XMLTask}
	 */
	protected abstract List<XMLPipe> getOutputPipe();
	
	/**
	 * Copies the task.
	 */
	public abstract AbstractTask copy(CopyType type);
	
	/**
	 * Get identifier.
	 */
	public abstract String getIdentifier();
}
