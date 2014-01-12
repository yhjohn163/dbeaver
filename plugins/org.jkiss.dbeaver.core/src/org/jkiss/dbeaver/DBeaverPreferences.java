/*
 * Copyright (C) 2010-2013 Serge Rieder serge@jkiss.org
 * Copyright (C) 2012 Eugene Fradkin eugene.fradkin@gmail.com
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.jkiss.dbeaver;

/**
 * Preferences constants
 */
public final class DBeaverPreferences
{
    public static final String AGENT_ENABLED = "agent.enabled"; //$NON-NLS-1$
    public static final String AGENT_LONG_OPERATION_NOTIFY = "agent.long.operation.notify"; //$NON-NLS-1$
    public static final String AGENT_LONG_OPERATION_TIMEOUT = "agent.long.operation.timeout"; //$NON-NLS-1$

    public static final String NAVIGATOR_EXPAND_ON_CONNECT = "navigator.expand.on.connect"; //$NON-NLS-1$
    public static final String NAVIGATOR_SORT_ALPHABETICALLY = "navigator.sort.case.insensitive"; //$NON-NLS-1$
    public static final String NAVIGATOR_GROUP_BY_DRIVER = "navigator.group.by.driver"; //$NON-NLS-1$
    public static final String NAVIGATOR_EDITOR_FULL_NAME = "navigator.editor.full-name"; //$NON-NLS-1$

    public static final String DEFAULT_AUTO_COMMIT = "default.autocommit"; //$NON-NLS-1$
    public static final String DEFAULT_ISOLATION = "default.isolation"; //$NON-NLS-1$
    public static final String KEEP_STATEMENT_OPEN = "keep.statement.open"; //$NON-NLS-1$
    public static final String QUERY_ROLLBACK_ON_ERROR = "query.rollback-on-error"; //$NON-NLS-1$

    public static final String SCRIPT_COMMIT_TYPE = "script.commit.type"; //$NON-NLS-1$
    public static final String SCRIPT_COMMIT_LINES = "script.commit.lines"; //$NON-NLS-1$
    public static final String SCRIPT_ERROR_HANDLING = "script.error.handling"; //$NON-NLS-1$
    public static final String SCRIPT_FETCH_RESULT_SETS = "script.fetch.resultset"; //$NON-NLS-1$
    public static final String SCRIPT_AUTO_FOLDERS = "script.auto.folders"; //$NON-NLS-1$

    public static final String STATEMENT_INVALIDATE_BEFORE_EXECUTE = "statement.invalidate.before.execute"; //$NON-NLS-1$
    public static final String STATEMENT_TIMEOUT = "statement.timeout"; //$NON-NLS-1$
    public static final String MEMORY_CONTENT_MAX_SIZE = "content.memory.maxsize"; //$NON-NLS-1$
    public static final String CONTENT_HEX_ENCODING = "content.hex.encoding"; //$NON-NLS-1$
    public static final String READ_EXPENSIVE_PROPERTIES = "database.props.expensive"; //$NON-NLS-1$
    public static final String META_SEPARATE_CONNECTION = "database.meta.separate.connection"; //$NON-NLS-1$
    public static final String META_CASE_SENSITIVE = "database.meta.casesensitive"; //$NON-NLS-1$

    public static final String TEXT_EDIT_UNDO_LEVEL = "text.edit.undo.level"; //$NON-NLS-1$

    public static final String CONFIRM_EXIT = "exit"; //$NON-NLS-1$
    public static final String CONFIRM_ORDER_RESULTSET = "order_resultset"; //$NON-NLS-1$
    public static final String CONFIRM_RS_EDIT_CLOSE = "close_resultset_edit"; //$NON-NLS-1$
    public static final String CONFIRM_TXN_DISCONNECT = "disconnect_txn"; //$NON-NLS-1$
    public static final String CONFIRM_ENTITY_EDIT_CLOSE = "close_entity_edit"; //$NON-NLS-1$
    public static final String CONFIRM_ENTITY_DELETE = "entity_delete"; //$NON-NLS-1$
    public static final String CONFIRM_LOCAL_FOLDER_DELETE = "local_folder_delete"; //$NON-NLS-1$
    public static final String CONFIRM_ENTITY_REJECT = "entity_reject"; //$NON-NLS-1$
    public static final String CONFIRM_ENTITY_REVERT = "entity_revert"; //$NON-NLS-1$
    //public static final String CONFIRM_ENTITY_RENAME = "entity_rename"; //$NON-NLS-1$
    public static final String CONFIRM_EDITOR_CLOSE = "close_editor_edit"; //$NON-NLS-1$
    public static final String CONFIRM_DRIVER_DOWNLOAD = "driver_download"; //$NON-NLS-1$
    public static final String CONFIRM_VERSION_CHECK = "version_check"; //$NON-NLS-1$
    public static final String CONFIRM_KEEP_STATEMENT_OPEN = "keep_statement_open"; //$NON-NLS-1$

    private static final String PROPERTY_USE_ALL_COLUMNS_QUIET = "virtual-key-quiet";

    // Hex editor font identifiers
    public static final String HEX_FONT_NAME = "hex.font.name"; //$NON-NLS-1$
    public static final String HEX_FONT_SIZE = "hex.font.size"; //$NON-NLS-1$
    public static final String HEX_FONT_STYLE = "hex.font.style"; //$NON-NLS-1$

    // General UI
    public static final String UI_AUTO_UPDATE_CHECK = "ui.auto.update.check"; //$NON-NLS-1$
    public static final String UI_UPDATE_CHECK_TIME = "ui.auto.update.check.time"; //$NON-NLS-1$
    public static final String UI_DRIVERS_HOME = "ui.drivers.home"; //$NON-NLS-1$
    public static final String UI_PROXY_HOST = "ui.proxy.host"; //$NON-NLS-1$
    public static final String UI_PROXY_PORT = "ui.proxy.port"; //$NON-NLS-1$
    public static final String UI_PROXY_USER = "ui.proxy.user"; //$NON-NLS-1$
    public static final String UI_PROXY_PASSWORD = "ui.proxy.password"; //$NON-NLS-1$
    public static final String UI_DRIVERS_SOURCES = "ui.drivers.sources"; //$NON-NLS-1$

    // Resources
    public static final String RESOURCE_HANDLER_ROOT_PREFIX = "resource.root."; //$NON-NLS-1$

    // Network
    public static final String NET_TUNNEL_PORT_MIN = "net.tunnel.port.min"; //$NON-NLS-1$
    public static final String NET_TUNNEL_PORT_MAX = "net.tunnel.port.max"; //$NON-NLS-1$

    // ResultSet
    public static final String RS_EDIT_MAX_TEXT_SIZE = "resultset.edit.maxtextsize"; //$NON-NLS-1$
    public static final String RS_EDIT_LONG_AS_LOB = "resultset.edit.longaslob"; //$NON-NLS-1$
    public static final String RS_EDIT_USE_ALL_COLUMNS = "resultset.edit.key.use_all_columns";
    public static final String RS_COMMIT_ON_EDIT_APPLY = "resultset.commit.oneditapply"; //$NON-NLS-1$
    public static final String RS_COMMIT_ON_CONTENT_APPLY = "resultset.commit.oncontentapply"; //$NON-NLS-1$

    public static final String RESULT_SET_MAX_ROWS = "resultset.maxrows"; //$NON-NLS-1$
    public static final String RESULT_SET_BINARY_EDITOR_TYPE = "resultset.binary.editor"; //$NON-NLS-1$
    public static final String RESULT_SET_BINARY_SHOW_STRINGS = "resultset.binary.showStrings"; //$NON-NLS-1$
    public static final String RESULT_SET_BINARY_PRESENTATION = "resultset.binary.representation"; //$NON-NLS-1$
    public static final String RESULT_SET_BINARY_STRING_MAX_LEN = "resultset.binary.stringMaxLength"; //$NON-NLS-1$
    public static final String RESULT_SET_ORDER_SERVER_SIDE = "resultset.order.serverSide"; //$NON-NLS-1$
    public static final String RESULT_SET_SHOW_ODD_ROWS = "resultset.show.oddRows"; //$NON-NLS-1$
    public static final String RESULT_SET_SHOW_CELL_ICONS = "resultset.show.cellIcons"; //$NON-NLS-1$
    public static final String RESULT_SET_AUTO_SWITCH_MODE = "resultset.behavior.autoSwitchMode"; //$NON-NLS-1$
    public static final String RESULT_SET_DOUBLE_CLICK = "resultset.behavior.doubleClick"; //$NON-NLS-1$

}