/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.tm4e.registry;

/**
 * TextMate definition API.
 *
 */
public interface ITMDefinition {

	/**
	 * Returns the plugin id which has registered the TextMate resource.
	 * 
	 * @return the plugin id which has registered the TextMate resource.
	 */
	String getPluginId();

}