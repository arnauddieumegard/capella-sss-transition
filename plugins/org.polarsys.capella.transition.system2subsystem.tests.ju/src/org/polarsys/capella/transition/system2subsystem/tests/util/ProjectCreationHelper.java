/*******************************************************************************
 * Copyright (c) 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.tests.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.core.platform.sirius.ui.project.operations.ProjectSessionCreationHelper;

/**
 * This class allows to create a Capella skeleton semantic resource
 */
public class ProjectCreationHelper extends ProjectSessionCreationHelper {

  public ProjectCreationHelper(boolean epbsSelected_p, boolean opaSelected_p) {
    super(epbsSelected_p, opaSelected_p);
  }

  @Override
  public IFile createSemanticResource(IProject eclipseProject, IProgressMonitor monitor) {
    return super.createSemanticResource(eclipseProject, monitor);
  }

};