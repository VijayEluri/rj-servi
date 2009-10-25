package de.walware.rj.servi.webapp;

import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.eclipse.core.runtime.IStatus;

import de.walware.ecommons.ECommons;
import de.walware.ecommons.IDisposable;


public class EAppEnvDummy implements ServletContextListener, ECommons.IAppEnvironment {
	
	
	private final CopyOnWriteArraySet<IDisposable> stopListeners = new CopyOnWriteArraySet<IDisposable>();
	
	private ServletContext context;
	
	
	public EAppEnvDummy() {
	}
	
	
	public void contextInitialized(final ServletContextEvent sce) {
		this.context = sce.getServletContext();
		ECommons.init("de.walware.rj.servi", this);
	}
	
	public void contextDestroyed(final ServletContextEvent sce) {
		try {
			for (final IDisposable listener : this.stopListeners) {
				listener.dispose();
			}
		}
		finally {
			this.stopListeners.clear();
			this.context = null;
		}
	}
	
	public void addStoppingListener(final IDisposable listener) {
		this.stopListeners.add(listener);
	}
	
	public void removeStoppingListener(final IDisposable listener) {
		this.stopListeners.remove(listener);
	}
	
	public void log(final IStatus status) {
		final StringBuilder sb = new StringBuilder();
		switch (status.getSeverity()) {
		case IStatus.OK:
			sb.append("[OK] ");
			break;
		case IStatus.ERROR:
			sb.append("[ERROR] ");
			break;
		case IStatus.WARNING:
			sb.append("[WARNING] ");
			break;
		case IStatus.INFO:
			sb.append("[INFO] ");
			break;
		case IStatus.CANCEL:
			sb.append("[CANCEL] ");
			break;
		default:
			sb.append("[severity=");
			sb.append(status.getSeverity());
			sb.append(']');
			break;
		}
		sb.append(status.getMessage());
		
		this.context.log(sb.toString(), status.getException());
	}
	
}
