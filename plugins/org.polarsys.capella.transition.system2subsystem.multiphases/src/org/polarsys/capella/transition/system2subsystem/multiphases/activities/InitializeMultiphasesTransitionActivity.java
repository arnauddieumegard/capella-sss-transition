/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.multiphases.activities;

import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.CompoundTraceabilityHandler;
import org.polarsys.capella.core.transition.common.handlers.traceability.config.ITraceabilityConfiguration;
import org.polarsys.capella.transition.system2subsystem.crossphases.activities.InitializeTransitionActivity;
import org.polarsys.capella.transition.system2subsystem.multiphases.handlers.traceability.config.MultiphasesTargetConfiguration;

/**
 * 
 */
public class InitializeMultiphasesTransitionActivity extends InitializeTransitionActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.multiphases.activities.InitializeMultiphasesTransitionActivity"; //$NON-NLS-1$

  @Override
  protected String getDefaultOptionsScope() {
    return "capella.core.transition.system2subsystem"; //$NON-NLS-1$
  }

  @Override
  protected IHandler createDefaultTraceabilityTargetHandler() {
    ITraceabilityConfiguration configuration = new MultiphasesTargetConfiguration();
    return new CompoundTraceabilityHandler(configuration);
  }
}
