package de.osmembrane.model;

import de.osmembrane.model.xml.XMLHasDescription.Description;
import de.osmembrane.model.xml.XMLPipe;
import de.osmembrane.model.xml.XMLTask;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import de.osmembrane.model.Connector;
import de.osmembrane.model.xml.XMLFunction;

/**
 * This represents the implementation of a simple Function for the XML-Functions.
 * 
 * @author jakob_jarosch
 */
public class Function extends AbstractFunction {
	
	private static final long serialVersionUID = 2010123022380001L;
	
	private XMLFunction xmlFunction;
	private FunctionGroup parent;
	private Point coordinate = new Point();
	private XMLTask activeTask;
	
	private List<Connector> inConnectors = new ArrayList<Connector>();;
	private List<Connector> outConnectors = new ArrayList<Connector>();;

	private final String comparator;
	
	/**
	 * Creates a new Function with given parent and XMLFunction.
	 * 
	 * @param parent parent of the Function
	 * @param xmlFunction XMLFunction belongs to this Function
	 */
	public Function(FunctionGroup parent, XMLFunction xmlFunction) {
		this.xmlFunction = xmlFunction;
		this.parent = parent;
		
		/* set the first task as default */
		activeTask = xmlFunction.getTask().get(0);
		
		/* create the connectors */
		createConnectors();
		
		/* create a simple comparator */
		comparator = this.xmlFunction.getId();
	}

	@Override
	public AbstractFunctionGroup getParent() {
		return parent;
	}

	@Override
	public String getId() {
		return xmlFunction.getId();
	}

	@Override
	public String getFriendlyName() {
		return xmlFunction.getFriendlyName();
	}

	@Override
	public List<Description> getDescription() {
		return xmlFunction.getDescription();
	}

	@Override
	public XMLTask[] getAvailableTasks() {
		XMLTask[] returnTasks = new XMLTask[xmlFunction.getTask().size()]; 
		return xmlFunction.getTask().toArray(returnTasks);
	}

	@Override
	public XMLTask getActiveTask() {
		return activeTask;
	}

	@Override
	public void setActiveTask(XMLTask task) {
		/* only allow a correct task to be set as active */
		for(XMLTask forTask : xmlFunction.getTask()) {
			if (forTask == task) {
				activeTask = task;
				return;
			}
		}
	}
	
	@Override
	public Point getCoordinate() {
		return coordinate;
	}

	@Override
	public Connector[] getInConnectors() {
		return (Connector[]) inConnectors.toArray();
	}

	@Override
	public Connector[] getOutConnectors() {
		return (Connector[]) outConnectors.toArray();
	}

	@Override
	public boolean same(AbstractFunction function) {
		if (function instanceof Function) {
			Function oFG = (Function) function;
			return (oFG.getComparatorString().equals(this.getComparatorString()));
		}
		
		return false;
	}

	protected String getComparatorString() {
		return comparator;
	}
	
	/**
	 * Creates the connectors for the active XMLTask.
	 */
	private void createConnectors() {
		/* In-Connectors */
		for(XMLPipe pipe : activeTask.getInputXMLPipe()) {
			// TODO Implement in-connector generation
		}
		
		/* Out-Connectors */
		for(XMLPipe pipe : activeTask.getOutputXMLPipe()) {
			// TODO Implement out-connector generation
		}
	}
}