package de.osmembrane.model;

import java.util.ArrayList;
import de.osmembrane.model.Function;

public class Connector implements IConnector {
	public ArrayList<Function> unnamed_Function_ = new ArrayList<Function>();

	public void getType() {
		throw new UnsupportedOperationException();
	}

	public void getMaxConnections() {
		throw new UnsupportedOperationException();
	}

	public void getConnections() {
		throw new UnsupportedOperationException();
	}

	public void addConnection(IFunction connection) {
		throw new UnsupportedOperationException();
	}

	public void deleteConnection(IFunction connection) {
		throw new UnsupportedOperationException();
	}
}