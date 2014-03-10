/*=============================================================================#
 # Copyright (c) 2009-2014 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.rj.servi.pool;

import java.util.Collection;
import java.util.Properties;


public interface PropertiesBean {
	
	
	class ValidationMessage {
		
		
		private final String propertyId;
		private final String message;
		
		
		public ValidationMessage(final String message) {
			this(null, message);
		}
		
		public ValidationMessage(final String propertyId, final String message) {
			this.propertyId = propertyId;
			this.message = message;
		}
		
		
		public String getPropertyId() {
			return this.propertyId;
		}
		
		public String getMessage() {
			return this.message;
		}
		
	}
	
	
	String getBeanId();
	void load(Properties map);
	void save(Properties map);
	
	boolean validate(Collection<ValidationMessage> messages);
	
}
