package com.robototes.logging.shuffleboard.configurables;

import com.robototes.logging.shuffleboard.AbstractReporter;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;

/**
 * A Relay Widget
 *
 * @author Eli Orona
 *
 */
public class RelayConfig extends AbstractReporter<Relay, RelayConfig> {

	/**
	 * Creates a new Relay widget
	 *
	 * @param relay   The Relay
	 * @param name    Widget name
	 * @param tabName Tab name
	 */
	public RelayConfig(Relay relay, String name, String tabName) {
		super(() -> relay, name, tabName);
	}

	@Override
	public WidgetType getType() {
		return BuiltInWidgets.kRelay;
	}

	@Override
	public void update() {
	}

}
