/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.command.toolbar.processes;


import com.google.inject.ImplementedBy;

import org.eclipse.che.api.core.model.machine.Machine;
import org.eclipse.che.api.machine.shared.dto.execagent.GetProcessesResponseDto;
import org.eclipse.che.ide.api.mvp.View;

import java.util.List;

/**
 *
 */
@ImplementedBy(ProcessesListViewImpl.class)
public interface ProcessesListView extends View<ProcessesListView.ActionDelegate> {

    void addProcess(GetProcessesResponseDto process, Machine machine);

    void clearProcesses();

    interface ActionDelegate {

        /** Called when process has been chosen. */
        void onProcessChosen();

        void onRunProcess(GetProcessesResponseDto process, Machine machine);
    }
}