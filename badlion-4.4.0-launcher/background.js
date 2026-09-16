(function () {'use strict';

var http = require('http');
var express = require('express');
var fileCacheMiddleware = require('express-asset-file-cache-middleware');
var logger = require('electron-log');
var electron = require('electron');
var Rollbar = require('rollbar');
var isObjectLike = require('lodash/isObjectLike');
var path = require('path');
var electronUpdater = require('electron-updater');
var jetpack = require('fs-jetpack');
var events = require('events');
var ElectronStore = require('electron-store');
var fs = require('fs');
var nbt = require('prismarine-nbt');

function _interopDefaultLegacy (e) { return e && typeof e === 'object' && 'default' in e ? e : { 'default': e }; }

var express__default = /*#__PURE__*/_interopDefaultLegacy(express);
var fileCacheMiddleware__default = /*#__PURE__*/_interopDefaultLegacy(fileCacheMiddleware);
var logger__default = /*#__PURE__*/_interopDefaultLegacy(logger);
var electron__default = /*#__PURE__*/_interopDefaultLegacy(electron);
var Rollbar__default = /*#__PURE__*/_interopDefaultLegacy(Rollbar);
var isObjectLike__default = /*#__PURE__*/_interopDefaultLegacy(isObjectLike);
var path__default = /*#__PURE__*/_interopDefaultLegacy(path);
var jetpack__default = /*#__PURE__*/_interopDefaultLegacy(jetpack);
var ElectronStore__default = /*#__PURE__*/_interopDefaultLegacy(ElectronStore);
var fs__default = /*#__PURE__*/_interopDefaultLegacy(fs);
var nbt__default = /*#__PURE__*/_interopDefaultLegacy(nbt);

const config = {
    isDev: false,
    updaterEnabled: true,
    enableAutoupdaterLogger: true,
    // options: error, warn, info, verbose, debug, silly
    // whichever is set will include all options to the left as well.
    logLevel: 'silly',
};

// This helper remembers the size and position of your windows (and restores
function createWindow (name, options) {
    const userDataDir = jetpack__default['default'].cwd(electron.app.getPath('userData'));
    const stateStoreFile = 'window-state-' + name + '.json';
    const defaultSize = {
        width: options.width,
        height: options.height
    };
    let state = {};
    let win;
    const restore = function () {
        let restoredState = null;
        try {
            restoredState = userDataDir.read(stateStoreFile, 'json');
            if (restoredState) {
                // In case they are under our requirements
                if (restoredState.width && options.minWidth && restoredState.width < options.minWidth) {
                    restoredState.width = options.minWidth;
                }
                if (restoredState.height && options.minHeight && restoredState.height < options.minHeight) {
                    restoredState.height = options.minHeight;
                }
            }
        }
        catch (err) {
            // For some reason json can't be read (might be corrupted).
            // No worries, we have defaults.
        }
        // if (!options.resizable) {
        //   restoredState = Object.assign({}, restoredState, defaultSize);
        // }
        if (restoredState) {
            return Object.assign({}, defaultSize, restoredState);
        }
        else {
            return {};
        }
    };
    const getCurrentPosition = function () {
        const position = win.getPosition();
        const size = win.getSize();
        return {
            x: position[0],
            y: position[1],
            width: size[0],
            height: size[1]
        };
    };
    const windowWithinBounds = function (windowState, bounds) {
        if (windowState.x && windowState.y && windowState.width && windowState.height) {
            return windowState.x >= bounds.x &&
                windowState.y >= bounds.y &&
                windowState.x + windowState.width <= bounds.x + bounds.width &&
                windowState.y + windowState.height <= bounds.y + bounds.height;
        }
        else {
            return false;
        }
    };
    const resetToDefaults = function (windowState) {
        const bounds = electron.screen.getPrimaryDisplay().bounds;
        if (defaultSize && defaultSize.width && defaultSize.height) {
            return Object.assign({}, defaultSize, {
                x: (bounds.width - defaultSize.width) / 2,
                y: (bounds.height - defaultSize.height) / 2
            });
        }
        else {
            return {};
        }
    };
    const ensureVisibleOnSomeDisplay = function (windowState) {
        const visible = electron.screen.getAllDisplays().some(function (display) {
            return windowWithinBounds(windowState, display.bounds);
        });
        if (!visible) {
            // Window is partially or fully not visible now.
            // Reset it to safe defaults.
            return resetToDefaults();
        }
        return windowState;
    };
    const saveState = function () {
        if (!win.isMinimized() && !win.isMaximized()) {
            Object.assign(state, getCurrentPosition());
        }
        try {
            userDataDir.write(stateStoreFile, state, { atomic: true });
        }
        catch (e) {
            logger__default['default'].error('failed to save state', e);
        }
    };
    state = ensureVisibleOnSomeDisplay(restore());
    win = new electron.BrowserWindow(Object.assign({}, options, state));
    win.on('close', saveState);
    return win;
}

class CustomEventEmitter extends events.EventEmitter {
}
const nativeEventHandler = new CustomEventEmitter();
const registerMessageBroker = (launchApp, window) => {
    if (launchApp) {
        // listen to events from the dll
        launchApp.messageBroker((data) => {
            logger__default['default'].silly('messagebroker received data', data);
            try {
                const obj = JSON.parse(data);
                if (obj.event) {
                    // Send to renderer
                    if (window) {
                        window.webContents.send(obj.event, data);
                    }
                    // Send to background
                    nativeEventHandler.emit(obj.event, data);
                }
                else {
                    logger__default['default'].silly(`Invalid event JSON string: ${data}`);
                }
            }
            catch (ex) {
                logger__default['default'].silly('Event manager caught exception', ex);
            }
        }, () => { });
    }
};

const uuid = () => 
// @ts-ignore
([1e7] + -1e3 + -4e3 + -8e3 + -1e11).replace(/[018]/g, 
// @ts-ignore
a => (a ^ ((Math.random() * 16) >> (a / 4))).toString(16));

class StreamsEventEmitter extends events.EventEmitter {
}
const streamsEventHandler = new StreamsEventEmitter();
const SEND_MESSAGE_ERROR_CODES = {
    '-1': 'INVALID_ARGUMENTS',
    '-2': 'NOT_LOGGED_IN',
    '-3': 'RATE_LIMITED',
    '-4': 'INVALID_REQUEST_JSON',
    '-5': 'PROTECTED_FIELDS_USED',
    '-6': 'INTERNAL_ERROR',
};
const SUCCESS_CODE = 0;
const RECEIVE_MESSAGE_EVENT_NAME = 'receiveMessage';
const RESPONSE_TIMEOUT = 30000; // 30 secs
let callbackHandlerRegistered = false;
const registerStreamsMessageBroker = ({ launchApp, ipcMain, logger, mainWindow, }) => {
    if (!launchApp)
        return;
    // Register IPC proxy to handle stream requests here (on the main thread) via the renderer thread.
    ipcMain.handle('send-streams-request', (event, service, data, awaitResponse = true) => streamsRequest({ launchApp, logger, service, data, awaitResponse }));
    // Listen for messages from C++ streams service.
    const callbackSetterResponseCode = launchApp.setStreamsCallback(data => {
        // Emit the event on main thread
        streamsEventHandler.emit(RECEIVE_MESSAGE_EVENT_NAME, data);
        // Emit the event on the renderer thread.
        if (mainWindow) {
            mainWindow.webContents.send('receive-streams-message', data);
        }
    });
    if (callbackSetterResponseCode === SUCCESS_CODE) {
        callbackHandlerRegistered = true;
        logger.info('Registered streams message broker.');
    }
    else {
        logger.error(`Could not register streams callback. Received response code ${callbackSetterResponseCode}.`);
    }
};
/**
 * Sends a request via the stream service and awaits its response.
 */
const streamsRequest = ({ launchApp, logger, data, service, awaitResponse = true, }) => new Promise((resolve, reject) => {
    if (!launchApp) {
        return reject(new Error('Could not send stream request as launchApp was not available.'));
    }
    if (!callbackHandlerRegistered) {
        return reject(new Error('Could not send stream request as the callback handler was not registered.'));
    }
    let requestTimeoutTimer = null;
    const streamsMessageId = uuid();
    /**
     * Called on receiving a stream message.
     * It will resolve the request when a response is received with the corresponding `streamsMessageId`.
     */
    const responseListener = (data) => {
        if (!data)
            return;
        try {
            const response = JSON.parse(data);
            if (response?.streamsMessageId === streamsMessageId) {
                if (requestTimeoutTimer)
                    clearTimeout(requestTimeoutTimer);
                streamsEventHandler.removeListener(RECEIVE_MESSAGE_EVENT_NAME, responseListener);
                resolve(response);
            }
        }
        catch (e) {
            // Malformed JSON from incoming message, but don't reject.
            // We don't know if the incoming message is the response to our request.
            logger.error('Streams service received an invalid JSON payload:', data);
        }
    };
    if (awaitResponse) {
        // Get ready to listen for the response
        streamsEventHandler.addListener(RECEIVE_MESSAGE_EVENT_NAME, responseListener);
    }
    // Send the request
    const requestResponseCode = launchApp.sendStreamsMessage(JSON.stringify({
        service,
        streamsMessageId,
        data,
    }));
    if (requestResponseCode === SUCCESS_CODE) {
        if (awaitResponse) {
            // Set timeout timer
            requestTimeoutTimer = setTimeout(() => {
                logger.error(`Streams request with ID ${streamsMessageId} timed out.`);
                streamsEventHandler.removeListener(RECEIVE_MESSAGE_EVENT_NAME, responseListener);
                reject(new Error('Stream request timed out.'));
            }, RESPONSE_TIMEOUT);
        }
        else {
            // Not awaiting a response for this request. Resolve immediately.
            resolve({ success: true });
        }
    }
    else {
        // Request failed
        if (awaitResponse) {
            streamsEventHandler.removeListener(RECEIVE_MESSAGE_EVENT_NAME, responseListener);
        }
        const errMessage = requestResponseCode.toString() in SEND_MESSAGE_ERROR_CODES
            ? SEND_MESSAGE_ERROR_CODES[requestResponseCode.toString()]
            : 'UNKNOWN_ERROR';
        reject(new Error(`Could not send streams request: ${errMessage} (${requestResponseCode})`));
    }
});

const schema = {
    converted: {
        type: 'boolean',
        default: true,
    },
    optifine: {
        type: 'boolean',
        default: true,
    },
    testJar: {
        type: 'boolean',
        default: false,
    },
    client_backup_java: {
        type: 'boolean',
        default: false,
    },
    always_shutdown_when_mc_is_running: {
        type: 'boolean',
        default: false,
    },
    client_minimize_mc_running: {
        type: 'boolean',
        default: false,
    },
    client_debug_mode: {
        type: 'boolean',
        default: false,
    },
    blc3: {
        type: 'boolean',
        default: false,
    },
    blcVersion: {
        type: 'number',
        default: 4,
    },
    client_offline_mode: {
        type: 'boolean',
        default: true,
    },
    client_windows_start: {
        type: 'boolean',
        default: false,
    },
    client_hide_jar_patching: {
        type: 'boolean',
        default: false,
    },
    client_close_mc_quit: {
        type: 'boolean',
        default: false,
    },
    betaJar: {
        type: 'boolean',
        default: false,
    },
    client_show_servers: {
        type: 'boolean',
        default: true,
    },
    client_show_blc_in_discord: {
        type: 'boolean',
        default: true,
    },
    launcher_play_animation: {
        type: 'boolean',
        default: true,
    },
    launcher_bac_animation: {
        type: 'boolean',
        default: true,
    },
    client_hide_bac_install: {
        type: 'boolean',
        default: false,
    },
    client_memory: {
        type: 'number',
        minimum: 1024,
        default: 2048,
    },
    client_resolution_width: {
        type: 'number',
        minimum: 854,
        default: 1280,
    },
    client_resolution_height: {
        type: 'number',
        minimum: 480,
        default: 720,
    },
    mcVersion: {
        type: 'string',
        default: '1.8.9',
    },
    client_blc_log_retention: {
        type: 'string',
        default: 'forever',
        enum: [
            '1d',
            '3d',
            '7d',
            '14d',
            '30d',
            '60d',
            '91d',
            '182d',
            '365d',
            '730d',
            'forever',
        ],
    },
    client_mc_log_retention: {
        type: 'string',
        default: 'forever',
        enum: [
            '1d',
            '3d',
            '7d',
            '14d',
            '30d',
            '60d',
            '91d',
            '182d',
            '365d',
            '730d',
            'forever',
        ],
    },
    client_mc_path: {
        type: 'string',
        default: '',
    },
    client_java_path: {
        type: 'string',
        default: '',
    },
    client_language: {
        type: 'string',
        default: '',
    },
    jwt: {
        type: 'string',
        default: '',
    },
    tutorial_blc3: {
        type: 'boolean',
        default: false,
    },
    latestReleaseSelected: {
        type: 'boolean',
        default: false,
    },
    seen_legacy_warning: {
        type: 'boolean',
        default: false,
    },
    seen_loyal_player_modal: {
        type: 'boolean',
        default: false,
    },
    client_enable_garbage_collector: {
        type: 'boolean',
        default: true,
    },
    seen_garbage_collector_modal: {
        type: 'boolean',
        default: false,
    },
    config_version: {
        type: 'number',
        default: 1,
    },
    client_windows_startup_behaviour: {
        type: 'string',
        default: '',
    },
    launcher_sidebar_expanded: {
        type: 'boolean',
        default: true,
    },
    client_custom_colour: {
        type: 'string',
        default: '',
    },
    seen_blc4_tutorial: {
        type: 'boolean',
        default: false,
    },
};
class JsonDatabase {
    database;
    loaded;
    constructor() {
        this.database = undefined;
        this.loaded = false;
    }
    loadDatabase = () => {
        try {
            logger__default['default'].info('creating database');
            // @ts-ignore
            this.database = new ElectronStore__default['default']({ schema });
            logger__default['default'].info('database created');
        }
        catch (e) {
            logger__default['default'].error('error when loading database, resetting', e);
            // Force DB to reset
            this.database = new ElectronStore__default['default']();
            this.database.clear();
            // Now we can load our defaults safely
            // @ts-ignore
            this.database = new ElectronStore__default['default']({ schema });
            logger__default['default'].info('database created');
        }
    };
    getDatabase = () => this.database;
    registerListeners = () => {
        electron.ipcMain.on('json-storage-get-database', event => {
            event.returnValue = this.database
                ? {
                    ...this.database.store,
                }
                : null;
        });
        electron.ipcMain.handle('json-storage-set-value', (event, key, value) => {
            if (this.database) {
                if (value === undefined) {
                    this.database.delete(key);
                }
                else {
                    this.database.set(key, value);
                }
            }
        });
    };
}
var jsonDatabase = new JsonDatabase();

logger__default['default'].silly('background.js loaded.');
// Log more information
// @ts-ignore
logger__default['default'].transports.file.level = config.logLevel;
logger__default['default'].transports.file.format = '{y}/{m}/{d} {h}:{i}:{s}:{ms} {text}';
logger__default['default'].transports.file.sync = true;
logger__default['default'].silly('loglevel set:', config.logLevel);
logger__default['default'].catchErrors();
const rollbar = Rollbar__default['default'].init({
    accessToken: '6a77e2b992b141bf87a983f42abda455',
    environment: 'production',
    captureUncaught: true,
    captureUnhandledRejections: true,
    version: electron.app.getVersion(),
    codeVersion: electron.app.getVersion(),
    payload: {
        platform: 'client',
    },
});
logger__default['default'].debug('Electron main thread initializing...', {
    versions: {
        app: electron.app.getVersion(),
        electron: process.versions.electron,
        node: process.versions.node,
        chrome: process.versions.chrome,
    },
});
const isWindows = process.platform === 'win32';
const isMac = process.platform === 'darwin';
const isLinux = process.platform === 'linux';
const MAIN_WINDOW_MIN_WIDTH = 1260;
const MAIN_WINDOW_MIN_HEIGHT = isMac ? 720 : 725;
// default app window settings.
const windowSettings = {
    title: 'Badlion Client',
    backgroundColor: '#38434d',
    resizable: true,
    maximizable: true,
    fullscreenable: true,
    minWidth: MAIN_WINDOW_MIN_WIDTH,
    minHeight: MAIN_WINDOW_MIN_HEIGHT,
    show: false,
    frame: isMac,
    titleBarStyle: isMac ? 'hidden' : 'default',
    // Disable the middle click properly - https://github.com/electron/electron/issues/10315
    // 2019-07-25 disabled later in chromium https://chromium-review.googlesource.com/c/chromium/src/+/661697/
    webPreferences: {
        devTools: config.isDev,
        preload: path__default['default'].join(__dirname, 'preload.js'),
        sandbox: false,
    },
};
// updater window settings.
const updaterWindowSettings = {
    title: 'Badlion Client Updater',
    backgroundColor: '#38434d',
    resizable: false,
    minWidth: 350,
    minHeight: 350,
    maxWidth: 350,
    maxHeight: 350,
    width: 350,
    height: 350,
    frame: false,
    show: false,
    // Disable the middle click properly - https://github.com/electron/electron/issues/10315
    webPreferences: {
        devTools: config.isDev,
        preload: path__default['default'].join(__dirname, 'preload.js'),
        sandbox: false,
    },
};
// microsoft window settings (log into Minecraft account Microsoft).
const microsoftWindowSettings = {
    title: 'Sign in to your Microsoft account',
    resizable: true,
    minWidth: 750,
    minHeight: 550,
    width: 1000,
    height: 650,
    show: true,
    // Disable the middle click properly - https://github.com/electron/electron/issues/10315
    webPreferences: {
        nodeIntegration: false,
        devTools: config.isDev,
    },
};
// New microsoft window settings (Logging into Badlion account with Microsoft).
const newMicrosoftWindowSettings = {
    title: 'Sign in to your Microsoft account',
    resizable: true,
    minWidth: 750,
    minHeight: 550,
    width: 750,
    height: 550,
    show: true,
    // Disable the middle click properly - https://github.com/electron/electron/issues/10315
    webPreferences: {
        nodeIntegration: false,
        devTools: config.isDev,
    },
};
// Build custom menu
const menu = electron.Menu.buildFromTemplate([
    ...(isMac
        ? [
            {
                label: electron.app.name,
                submenu: [
                    { role: 'about' },
                    { type: 'separator' },
                    { role: 'services' },
                    { type: 'separator' },
                    { role: 'hide' },
                    { role: 'hideOthers' },
                    { role: 'unhide' },
                    { type: 'separator' },
                    { role: 'quit' },
                ],
            },
        ]
        : []),
    {
        label: 'File',
        submenu: [isMac ? { role: 'close' } : { role: 'quit' }],
    },
    {
        label: 'Edit',
        submenu: [
            { role: 'undo' },
            { role: 'redo' },
            { type: 'separator' },
            { role: 'cut' },
            { role: 'copy' },
            { role: 'paste' },
            ...(isMac
                ? [
                    {
                        role: 'pasteAndMatchStyle',
                    },
                    { role: 'delete' },
                    { role: 'selectAll' },
                    { type: 'separator' },
                    {
                        label: 'Speech',
                        submenu: [
                            { role: 'startSpeaking' },
                            { role: 'stopSpeaking' },
                        ],
                    },
                ]
                : [
                    { role: 'delete' },
                    { type: 'separator' },
                    { role: 'selectAll' },
                ]),
        ],
    },
    {
        label: 'View',
        // Disable zooming
        submenu: [
            { role: 'resetZoom', enabled: false },
            { role: 'zoomIn', enabled: false },
            { role: 'zoomOut', enabled: false },
        ],
    },
]);
electron.Menu.setApplicationMenu(menu);
// If we are Linux, we need to set the icon path to make it work
if (isLinux) {
    windowSettings.icon = path__default['default'].join(__dirname, '64x64.png');
    updaterWindowSettings.icon = path__default['default'].join(__dirname, '64x64.png');
    microsoftWindowSettings.icon = path__default['default'].join(__dirname, '64x64.png');
    path__default['default'].join(__dirname, '64x64.png');
}
let launchApp;
let loadError;
let opensMinimized = false;
let updaterFinished = false;
let updaterMounted = false;
let updateMessageQueueTimers = {
    'checking-for-update': null,
    'update-available': null,
    'update-not-available': null,
    'download-progress': null,
    'update-downloaded': null,
    error: null,
};
// Load the database
logger__default['default'].info('loading database');
jsonDatabase.loadDatabase();
jsonDatabase.registerListeners();
logger__default['default'].info('database loaded');
// move udpate files.
try {
    // these files need to be moved before the nodes are loaded
    /* logger.info('Attempting to move files...');
  
    if (fs.existsSync('native-modules/launcher.node.update')) {
      logger.verbose('Found new file for launcher.node, moving...');
      fs.renameSync('native-modules/launcher.node.update', 'native-modules/launcher.node');
    }
  
    if (fs.existsSync('native-modules/badlion_electron.dll.update')) {
      logger.verbose('Found new file for badlion_electron.dll, moving...');
      fs.renameSync(
        'native-modules/badlion_electron.dll.update',
        'native-modules/badlion_electron.dll',
      );
    }
  
    logger.info('Files all updated and moved.'); */
    /** @type BadlionNativeLauncher */
    launchApp = require('../../../native-modules/launcher.node');
    logger__default['default'].info('loaded launcher.node');
}
catch (err) {
    // @ts-ignore
    loadError = err;
    logger__default['default'].error('couldnt load them pesky nodes', err);
}
// GPU hardware acceleration can be disabled by passing the `--disable-gpu` flag to the executable.
// Alternatively, the `disable_electron_gpu` flag in `config.json` can be set to `true`.
if (jsonDatabase.getDatabase()?.get('disable_electron_gpu')) {
    logger__default['default'].info('disable_electron_gpu flag is present. Disabling GPU hardware acceleration.');
    electron.app.disableHardwareAcceleration();
}
// Try to address app crash on load, see: https://github.com/electron/electron/issues/32074
electron.app.commandLine.appendSwitch('disable-gpu-sandbox');
// Try to make it so that the video autoplays no matter what
electron.app.commandLine.appendSwitch('autoplay-policy', 'no-user-gesture-required');
electron.app.commandLine.appendSwitch('disable-http-cache'); // trying to fix white screen issues for microsoft login
// save the window.
let updaterWindow;
let mainWindow;
let microsoftWindow;
let newMicrosoftWindow;
// save if the main window is loaded
let updaterWindowLoaded = false;
let mainWindowLoaded = false;
let mainWindowPrompted = false;
let mainWindowVisible = false;
let lastMainWindowVisible = false;
// Save the tray
let tray;
// Port for us to run our own web servers
const PORT = 6465;
// get the visible window.
const getActiveWindow = () => {
    if (mainWindow && !mainWindow.isDestroyed() && mainWindow.isVisible())
        return mainWindow;
    if (updaterWindow && !updaterWindow.isDestroyed())
        return updaterWindow;
    return null;
};
/*
function badlionProtocolHandler(){
  let URL: string | undefined;
  let re = new RegExp('badlion:\/\/skin\/download\/[0-9a-f]{16}');
  // In order for the protcol to work it must have: 'badlion://skin/download/NAMEMC_ID
  // NAMEMC_ID: A hexadecimal number (with lowercase a-f) and 16 characters long.
  if(deeplinkingUrl.constructor === Array)
    deeplinkingUrl.forEach((element: string) => {
      if (element.match(re)){
        // Link should only be 40 characters long!
        if(element.length === 40){
          URL = element;
        }
      }
  });

  if (URL !== undefined) {
    logger.silly("A URL was found.");
    if (URL.substring(0,10) === 'badlion://') {
      logger.silly("The URL was a Badlion Protocol.");
      let paramString = URL.substring(10)
      let paramArray = paramString.split('/')
      if (paramArray[0] === 'skin') {
        if (paramArray[1] === 'download') {
          logger.silly('Setting Skin URL: ' + paramArray[2])
          launchApp!.skinURL = paramArray[2];
          if (mainWindow) {
            mainWindow.webContents.send('skin-url-received', paramArray[2]);
          }
        }
      }
    }
  } else {
    launchApp!.skinURL = "No link found.";
  }
}*/
// Create instance and check to see if a second one is spawned
const acquiredLock = electron.app.requestSingleInstanceLock();
electron.app.on('second-instance', (e, argv) => {
    logger__default['default'].silly('SECOND INSTANCE FOUND');
    /*
    // Protocol handler for win32
    // argv: An array of the second instance’s (command line / deep linked) arguments
    if (isWindows || isLinux) {
      // Keep only command line / deep linked arguments
      deeplinkingUrl = argv.slice(1)
    }
  
    badlionProtocolHandler();*/
    logger__default['default'].info('second-instance event received', {
        updaterFinished,
    });
    if (updaterFinished && mainWindow && !mainWindow.isDestroyed()) {
        mainWindow.show();
        mainWindow.restore();
        mainWindow.focus();
    }
});
/**
 * Fixes an issue where WebSocket requests to our load-balanced server wouldn't connect reliably,
 * due to the `AWSALB` sticky sessions cookie being blocked by Chromium.
 */
const fixWebsocketCookiesOnSession = (session) => {
    logger__default['default'].info('Setting websocket headers modifier for session', session);
    session.webRequest.onHeadersReceived({ urls: ['https://owlmessenger.badlion.net/*/*'] }, (details, callback) => {
        const cookies = details.responseHeaders
            ? details.responseHeaders['set-cookie']
            : null;
        if (cookies) {
            const newCookie = Array.from(cookies).map(cookie => cookie.concat('; SameSite=None; Secure'));
            if (details.responseHeaders)
                details.responseHeaders['set-cookie'] = [...newCookie];
            callback({
                responseHeaders: details.responseHeaders,
            });
        }
        else {
            callback({ cancel: false });
        }
    });
};
const initMainWindow = () => {
    logger__default['default'].info('initializing main window.');
    // create the window.
    logger__default['default'].verbose('creating main window with settings', windowSettings);
    mainWindow = createWindow('main', windowSettings);
    logger__default['default'].verbose('main window created');
    mainWindow.webContents.once('did-finish-load', function () {
        // NameMC integration webserver setup
        try {
            var server = http.createServer(function (req, res) {
                let re = new RegExp('/skin/[0-9a-f]{16}');
                // In order for the protcol to work it must have: 'http://skin/NAMEMC_ID
                // NAMEMC_ID: A hexadecimal number (with lowercase a-f) and 16 characters long.
                logger__default['default'].info('incoming url', req.url);
                // Set headers to allow for CORS
                res.setHeader('Access-Control-Allow-Origin', '*');
                res.setHeader('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept');
                if (mainWindow) {
                    let URL;
                    if (req.url === undefined) {
                        res.end(`Empty URL!`);
                    }
                    else {
                        URL = req.url;
                        if (URL.match(re)) {
                            // Link should only be 22 characters long! (Valid Link)
                            if (URL.length === 22) {
                                let paramArray = URL.split('/');
                                let id = paramArray[2];
                                logger__default['default'].info('parsed skin', id);
                                mainWindow.webContents.send('skin-url-received', id);
                                forceWindowToShow(mainWindow);
                                res.end(`Searching up skin: ${id}`);
                            }
                            else {
                                // Root / Invalid Link
                                res.end(`Badlion server found!`);
                            }
                        }
                    }
                }
            });
            server.listen(PORT).on('error', err => {
                logger__default['default'].error('local skin server failed to startup', err);
            });
        }
        catch (e) {
            logger__default['default'].error('error when making local server', e);
        }
    });
    // Remove menu (new API in Electron 5.X) to render our custom titlebar
    mainWindow.removeMenu();
    // get the default UA string.
    const UA = mainWindow.webContents.getUserAgent();
    // run eg `MAIN_URL="http://local.badlion.net:3000" npm start`.
    // useful for development, uses the react server directly without having to build.
    logger__default['default'].verbose('loading main window url', path__default['default'].join(__dirname, 'app.html'));
    mainWindow.loadFile(path__default['default'].join(__dirname, 'app.html')).catch(e => {
        logger__default['default'].info('error loading url for mainWindow', e);
    });
    logger__default['default'].verbose('main window url loaded.');
    // for all outgoing requests, restore the default UA.
    electron.session.defaultSession.webRequest.onBeforeSendHeaders((details, callback) => {
        callback({
            cancel: false,
            requestHeaders: {
                ...details.requestHeaders,
                'User-Agent': UA,
            },
        });
    });
    fixWebsocketCookiesOnSession(electron.session.defaultSession);
    mainWindow.webContents.on('dom-ready', () => {
        logger__default['default'].silly('main window web contents dom ready');
        if (!mainWindowLoaded) {
            mainWindowLoaded = true;
            // Setup message brokers
            registerMessageBroker(launchApp, mainWindow);
            registerStreamsMessageBroker({ launchApp, ipcMain: electron.ipcMain, logger: logger__default['default'], mainWindow });
        }
    });
    mainWindow.webContents.on('did-fail-load', (event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId) => {
        logger__default['default'].error('mainWindow did-fail-load', event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId);
    });
    mainWindow.on('ready-to-show', () => {
        logger__default['default'].silly('main window web contents ready to show');
        if (!mainWindowLoaded) {
            mainWindowLoaded = true;
            // Setup message brokers
            registerMessageBroker(launchApp, mainWindow);
            registerStreamsMessageBroker({ launchApp, ipcMain: electron.ipcMain, logger: logger__default['default'], mainWindow });
        }
    });
    logger__default['default'].info('main window initialized.');
};
// Helper util to force windows to show up properly (not always working otherwise on Windows)
const forceWindowToShow = (win) => {
    win.minimize();
    win.focus();
};
const showMainWindow = () => {
    if (!mainWindow) {
        return;
    }
    // Grow main window if it gets smaller than the minimum allowed dimensions
    const mainWindowBounds = mainWindow.getBounds();
    if (mainWindowBounds.width < MAIN_WINDOW_MIN_WIDTH ||
        mainWindowBounds.height < MAIN_WINDOW_MIN_HEIGHT) {
        mainWindow.setBounds({
            width: MAIN_WINDOW_MIN_WIDTH,
            height: MAIN_WINDOW_MIN_HEIGHT,
        });
    }
    // To make sure we can close updater and shut down the app still
    mainWindowPrompted = true;
    // Fire off events to know when we are focused or not
    mainWindow.on('blur', () => {
        logger__default['default'].silly('main window lost focus');
        if (mainWindow) {
            mainWindow.webContents.send('window-focus', 'lost-focus');
        }
        // Flag analytics
        mainWindowVisible = false;
    });
    mainWindow.on('focus', () => {
        logger__default['default'].silly('main window gained focus');
        if (mainWindow) {
            mainWindow.webContents.send('window-focus', 'gain-focus');
        }
        // Flag analytics
        mainWindowVisible = true;
    });
    // close all windows when main window is closed.
    mainWindow.on('closed', () => {
        logger__default['default'].silly('main window closed, nulling.');
        mainWindow = null;
        logger__default['default'].silly('main window nulled.');
        if (microsoftWindow) {
            microsoftWindow.close();
        }
        if (newMicrosoftWindow) {
            newMicrosoftWindow.close();
        }
    });
    // close the updater window if it still exists.
    if (updaterWindow) {
        logger__default['default'].silly('updater window still open, closing.');
        updaterWindow.close();
        updaterWindow = null;
    }
    if (!opensMinimized) {
        mainWindow.show();
        logger__default['default'].silly('main window shown, focusing.');
        mainWindow.focus();
        logger__default['default'].silly('main window focused.');
    }
    else {
        logger__default['default'].silly('Not showing main window as `opensMinimized` was true.');
    }
    const contextMenu = electron.Menu.buildFromTemplate([
        // Probably safer to have both show/minimize visible at all times and don't recreate context menu
        {
            label: 'Show Badlion Client',
            click: () => {
                if (mainWindow) {
                    mainWindow.show();
                }
            },
        },
        {
            label: 'Minimize to Tray',
            click: () => {
                if (mainWindow) {
                    mainWindow.hide();
                }
            },
        },
        { type: 'separator' },
        {
            label: 'Quit',
            click: () => {
                // Triggers our 'close' callback event above to shut down tray/C++ properly
                if (mainWindow) {
                    mainWindow.close();
                }
            },
        },
    ]);
    let iconpath;
    // Windows uses .ico
    if (isWindows) {
        iconpath = path__default['default'].join(__dirname, 'icon.ico');
    }
    else {
        iconpath = path__default['default'].join(__dirname, 'small', 'small.png');
    }
    logger__default['default'].info('path to icon', iconpath);
    if (iconpath) {
        tray = new electron.Tray(electron.nativeImage.createFromPath(iconpath));
        tray.setToolTip('Badlion Client');
        tray.setContextMenu(contextMenu);
        // Show window on tray icon click
        tray.on('double-click', () => {
            if (mainWindow) {
                mainWindow.show();
            }
        });
    }
    else {
        logger__default['default'].error('something went wrong when trying to set the icon path');
    }
    logger__default['default'].info('main window shown.');
    setInterval(() => {
        if (mainWindow && launchApp) {
            if (mainWindowVisible !== lastMainWindowVisible) {
                lastMainWindowVisible = mainWindowVisible;
                const data = JSON.stringify({
                    isVisible: lastMainWindowVisible,
                });
                launchApp.sendAnalyticStats(data, json => {
                    // not doing anything atm
                });
            }
        }
    }, 1000);
    // Create a store instance (testing only)
    // createStoreWindow();
};
const handleShutdown = () => {
    logger__default['default'].info('handleShutdown called');
    // Destroy tray if present
    if (tray) {
        tray.destroy();
    }
    if (updaterWindow) {
        updaterWindow.destroy();
    }
    if (mainWindow) {
        mainWindow.destroy();
    }
    if (microsoftWindow) {
        microsoftWindow.destroy();
    }
    if (newMicrosoftWindow) {
        newMicrosoftWindow.destroy();
    }
};
// https://github.com/electron/electron/issues/25626#issuecomment-737242452
// https://github.com/electron-userland/electron-builder/issues/1604#issuecomment-372091881
const ensureSafeQuitAndInstall = () => {
    logger__default['default'].info('removing listeners for installation');
    electron.app.removeAllListeners('window-all-closed');
    const browserWindows = electron.BrowserWindow.getAllWindows();
    browserWindows.forEach((browserWindow) => {
        browserWindow.removeAllListeners('close');
        browserWindow.removeAllListeners('closed');
    });
    logger__default['default'].info('removed listeners for installation');
};
/**
 * Sends or queues an IPC message for the updater window, waiting for the updater component to be mounted before sending the message.
 */
const queueUpdaterMessage = (message, ...args) => {
    const sendMessage = () => {
        logger__default['default'].info(`Updater is mounted. Sending "${message}"...`);
        const activeWindow = getActiveWindow();
        if (activeWindow) {
            activeWindow.webContents.send(message, ...args);
        }
        else {
            logger__default['default'].info(`Updater: Could not send "${message}" to updater as there was no active window.`);
        }
    };
    if (updaterMounted) {
        sendMessage();
        return;
    }
    logger__default['default'].info(`Updater: Did not send "${message}" message as the updater component was not yet mounted.`);
    if (updateMessageQueueTimers[message]) {
        clearInterval(updateMessageQueueTimers[message]);
    }
    updateMessageQueueTimers[message] = setInterval(() => {
        if (updaterMounted) {
            if (updateMessageQueueTimers[message]) {
                clearInterval(updateMessageQueueTimers[message]);
            }
            sendMessage();
        }
        else {
            logger__default['default'].info(`Updater has not yet mounted. Message "${message}" queued...`);
        }
    }, 500);
};
const initAutoUpdater = () => {
    logger__default['default'].info('initializing autoupdater.');
    // Force installs to only happen when the client is being opened
    electronUpdater.autoUpdater.autoInstallOnAppQuit = false;
    // @todo: does this even do anything?
    {
        logger__default['default'].silly('enableAutoupdaterLogger true, adding logger.');
        electronUpdater.autoUpdater.logger = logger__default['default'];
        logger__default['default'].silly('autoupdater logger added.');
    }
    electronUpdater.autoUpdater.on('checking-for-update', () => {
        logger__default['default'].verbose('autoUpdater checking-for-update received, sending checking-for-update to active window.');
        queueUpdaterMessage('checking-for-update');
    });
    electronUpdater.autoUpdater.on('update-available', () => {
        logger__default['default'].verbose('autoUpdater update-available received, sending update-available to active window.');
        queueUpdaterMessage('update-available');
    });
    electronUpdater.autoUpdater.on('update-not-available', () => {
        logger__default['default'].verbose('autoUpdater update-not-available received, sending update-not-available to active window.');
        queueUpdaterMessage('update-not-available');
    });
    electronUpdater.autoUpdater.on('download-progress', data => {
        logger__default['default'].verbose('autoUpdater download-progress received, sending download-progress to active window.', data);
        queueUpdaterMessage('download-progress', data);
    });
    electronUpdater.autoUpdater.on('update-downloaded', () => {
        logger__default['default'].verbose('autoUpdater update-downloaded received, sending update-downloaded to active window.');
        queueUpdaterMessage('update-downloaded');
        if (getActiveWindow() === updaterWindow) {
            logger__default['default'].verbose('updater is the active window, quitting and installing.');
            // Prevent hanging on macOS in newer versions
            ensureSafeQuitAndInstall();
            logger__default['default'].info('calling quitAndInstall');
            if (isMac) {
                setImmediate(() => {
                    electronUpdater.autoUpdater.quitAndInstall(true, true);
                    logger__default['default'].info('mac app quit & install was called');
                });
            }
            else {
                // This sequence must remain unchanged or the bloody processes do not terminate and so the install fails...
                setTimeout(() => {
                    launchApp?.suicide(() => {
                        electronUpdater.autoUpdater.quitAndInstall(true, true);
                        logger__default['default'].info('app quit & install was called');
                        handleShutdown();
                        electron.app.exit();
                    });
                }, 1000);
            }
        }
    });
    electronUpdater.autoUpdater.on('error', e => {
        logger__default['default'].verbose('autoUpdater error received', e);
        logger__default['default'].verbose('sending error to active window.');
        queueUpdaterMessage('error');
    });
    // See: https://github.com/electron-userland/electron-builder/issues/2398#issuecomment-413117520
    const isNetworkError = (errorObject) => {
        return (errorObject.message === 'net::ERR_INTERNET_DISCONNECTED' ||
            errorObject.message === 'net::ERR_PROXY_CONNECTION_FAILED' ||
            errorObject.message === 'net::ERR_CONNECTION_RESET' ||
            errorObject.message === 'net::ERR_CONNECTION_CLOSE' ||
            errorObject.message === 'net::ERR_NAME_NOT_RESOLVED' ||
            errorObject.message === 'net::ERR_CONNECTION_TIMED_OUT');
    };
    const downloadUpdate = (cancellationToken) => {
        electronUpdater.autoUpdater
            .downloadUpdate(cancellationToken)
            .then(file => {
            // Do nothing, let the other handlers deal with it
            logger__default['default'].info('update downloaded to', file);
        })
            .catch(error => {
            if (isNetworkError(error)) {
                logger__default['default'].error('Network Error when checking downloading update', error);
            }
            else {
                logger__default['default'].error('Unknown Error when checking downloading update');
                logger__default['default'].error(error == null ? 'unknown' : (error.stack || error).toString());
            }
            queueUpdaterMessage('error');
        });
    };
    // disable autodownload...we trigger it instead
    electronUpdater.autoUpdater.autoDownload = false;
    // check for updates once when we startup.
    logger__default['default'].info('check for updates');
    electronUpdater.autoUpdater
        .checkForUpdates()
        .then(info => {
        logger__default['default'].info('finish check for updates', info);
        // If we have a cancellation token, that means we have something to download
        if (info?.cancellationToken) {
            downloadUpdate(info.cancellationToken);
        }
        else {
            logger__default['default'].info('no update available at this time');
        }
    })
        .catch(error => {
        // See: https://github.com/electron-userland/electron-builder/issues/2398#issuecomment-413117520
        if (isNetworkError(error)) {
            logger__default['default'].error('Network Error when checking for updates', error);
        }
        else {
            logger__default['default'].error('Unknown Error when checking for updates');
            logger__default['default'].error(error == null ? 'unknown' : (error.stack || error).toString());
        }
        queueUpdaterMessage('error');
    });
    logger__default['default'].info('autoupdater initialized.');
};
/**
 * IPC Handler to invoke `launchApp` methods.
 */
electron.ipcMain.handle('launch-app-invoke-method', (event, method, invocationHash, ...args) => {
    if (loadError || !launchApp) {
        logger__default['default'].error(`Could not invoke launchApp method '${method}' because launchApp was not available`);
        return;
    }
    // This handles any callback arguments by invoking the callback (referenced by its hash) back in the originating renderer thread.
    const callbackHandler = (index) => (...callbackArgs) => {
        event.sender.send('launch-app-invoke-callback-response', invocationHash, { index, callbackArgs });
    };
    const argsParsed = args.map((arg, index) => arg === '__invokeLaunchAppMethod__callback__'
        ? callbackHandler(index)
        : arg);
    try {
        // Invoke the method
        return launchApp[method].apply(null, argsParsed);
    }
    catch (e) {
        logger__default['default'].error(`Could not invoke launchApp method '${method}'`, e);
    }
});
electron.ipcMain.handle('get-app-loaded', () => !loadError && !!launchApp);
electron.ipcMain.handle('get-app-load-error', () => loadError);
electron.ipcMain.handle('get-app-version', () => electron.app.getVersion());
electron.ipcMain.handle('open-main-window', () => {
    showMainWindow();
    updaterFinished = true;
});
// kill the app
electron.ipcMain.handle('kill-application', () => {
    electron.app.quit();
});
// restart the app
electron.ipcMain.handle('restart-application', () => {
    logger__default['default'].silly('restart-application received.');
    if (electron.app) {
        electron.app.relaunch();
        if (mainWindow) {
            // No idea why, but this is the only way to get the app to properly terminate here.
            // Calling `handleShutdown`, `app.quit`, or even `app.exit` leaves processes hanging and the application
            // doesn't fully terminate, and therefore does not restart....
            logger__default['default'].silly('restart-application - mainWindow exists - invoking .close().');
            mainWindow.close();
        }
        else {
            logger__default['default'].silly('restart-application - mainWindow does not exist - invoking handleShutdown().');
            handleShutdown();
        }
    }
});
// minimize the main window.
electron.ipcMain.handle('main-window-hide', () => {
    logger__default['default'].silly('main-window-hide received.');
    if (mainWindow) {
        mainWindow.hide();
    }
});
// maximize the main window.
electron.ipcMain.handle('main-window-show', () => {
    logger__default['default'].silly('main-window-show received.');
    if (mainWindow) {
        mainWindow.show();
    }
});
// close app on title bar close event
electron.ipcMain.handle('titlebar-close', () => {
    logger__default['default'].silly('titlebar-close received. closing window.');
    // Triggers our 'close' callback event above to shut down tray/C++ properly
    if (mainWindow) {
        mainWindow.close();
    }
});
// maximize/resize app on title bar resize event
electron.ipcMain.handle('titlebar-resize', () => {
    if (mainWindow) {
        if (mainWindow.isMaximized()) {
            mainWindow.unmaximize();
        }
        else {
            mainWindow.maximize();
        }
    }
});
// minimize app on title bar minimize event
electron.ipcMain.handle('titlebar-minimize', () => {
    if (mainWindow) {
        mainWindow.minimize();
    }
});
// Set if the application should start on boot or not
electron.ipcMain.handle('start-on-system-boot', (event, val) => {
    // TODO: Talk about race conditions here with yqt and figure out best solution
    logger__default['default'].silly('start-on-system-boot received with value', val);
    if (typeof val === 'string' && isWindows) {
        if (launchApp) {
            launchApp.launchBLCOnBoot(val, result => {
                logger__default['default'].silly('start-on-system-boot result:', result);
            });
        }
    }
    else if (typeof val === 'boolean' && isMac) {
        electron.app.setLoginItemSettings({
            openAtLogin: val,
        });
    }
});
// Echo messages back to renderer
electron.ipcMain.handle('echo', (event, channel, ...args) => {
    logger__default['default'].info('received echo request', channel, args);
    if (mainWindow) {
        mainWindow.webContents.send(channel, args);
    }
});
electron.ipcMain.handle('check-for-updates', () => {
    electronUpdater.autoUpdater.checkForUpdates();
});
electron.ipcMain.handle('updater-mounted', () => {
    logger__default['default'].info('Received updater-mounted event.');
    updaterMounted = true;
});
electron.ipcMain.on('remove-skin', (event, channel, ...args) => {
    let key = channel.key;
    let minecraftPath = channel.minecraftPath;
    if (minecraftPath !== undefined && key !== undefined) {
        if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'launcher_skins.json'))) {
            logger__default['default'].silly(`Found launcher skins file. Reading....`);
            fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), 'utf8', (err, data) => {
                logger__default['default'].silly('Reading launcher skins JSON. (remove-skin)');
                try {
                    const result = JSON.parse(data);
                    delete result[key];
                    logger__default['default'].silly(`deleting skin with key: ${key}.`);
                    fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), JSON.stringify(result), (err) => {
                        if (mainWindow) {
                            mainWindow.webContents.send('remove-skin-complete', err);
                            if (err === null) {
                                logger__default['default'].silly(`skin deleted succesfully: ${key}.`);
                            }
                            else {
                                logger__default['default'].silly(`skin deleted failure. Error: ${err}`);
                            }
                        }
                    });
                }
                catch (err) {
                    logger__default['default'].silly(`skin deleted failure. Error: ${err}`);
                    const result = 'Your launcher skins settings are corrupt or empty.';
                    if (mainWindow) {
                        mainWindow.webContents.send('skin-error', result);
                    }
                }
            });
        }
    }
});
electron.ipcMain.on('edit-skin', (event, channel, ...args) => {
    let skin = channel.skin;
    let minecraftPath = channel.minecraftPath;
    if (minecraftPath !== undefined && skin !== undefined) {
        if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'launcher_skins.json'))) {
            logger__default['default'].silly(`Found launcher skins file. Reading....`);
            fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), 'utf8', (err, data) => {
                logger__default['default'].silly('Reading launcher skins JSON. (edit-skin)');
                try {
                    const result = JSON.parse(data);
                    result[skin.id] = skin;
                    logger__default['default'].silly(`editing skin with key: ${skin.id}.`);
                    fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), JSON.stringify(result), (err) => {
                        if (mainWindow) {
                            mainWindow.webContents.send('edit-skin-complete', err);
                            if (err === null) {
                                logger__default['default'].silly(`skin edited succesfully: ${skin.id}.`);
                            }
                            else {
                                logger__default['default'].silly(`skin edited failure. Error: ${err}`);
                            }
                        }
                    });
                }
                catch (err) {
                    logger__default['default'].silly(`skin edited failure. Error: ${err}`);
                    const result = 'Your launcher skins settings are corrupt or empty.';
                    if (mainWindow) {
                        mainWindow.webContents.send('skin-error', result);
                    }
                }
            });
        }
    }
});
electron.ipcMain.on('add-skin', (event, channel, ...args) => {
    let skin = channel.skin;
    let minecraftPath = channel.minecraftPath;
    if (minecraftPath !== undefined && skin !== undefined) {
        if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'launcher_skins.json'))) {
            logger__default['default'].silly(`Found launcher skins file. Reading....`);
            fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), 'utf8', (err, data) => {
                logger__default['default'].silly('Reading launcher skins JSON. (add-skin)');
                try {
                    const result = JSON.parse(data);
                    const newObject = {};
                    let i = 1;
                    Object.keys(result).forEach(function (key) {
                        let skinId = 'skin_' + i.toString();
                        result[key].id = skinId;
                        newObject[skinId] = result[key];
                        i++;
                    });
                    const newSkinId = 'skin_' + i.toString();
                    logger__default['default'].silly(`Adding skin with key: ${newSkinId}.`);
                    skin.id = newSkinId;
                    result[newSkinId] = skin;
                    fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), JSON.stringify(result), (err) => {
                        if (mainWindow) {
                            mainWindow.webContents.send('add-skin-complete', err);
                            if (err === null) {
                                logger__default['default'].silly(`skin added succesfully: ${skin.id}.`);
                            }
                            else {
                                logger__default['default'].silly(`skin added failure. Error: ${err}`);
                            }
                        }
                    });
                }
                catch (err) {
                    logger__default['default'].silly(`skin added failure. Error: ${err}`);
                    const result = 'Your launcher skins settings are corrupt or empty.';
                    if (mainWindow) {
                        mainWindow.webContents.send('skin-error', result);
                    }
                }
            });
        }
    }
});
electron.ipcMain.on('clear-skin-json', (event, channel, ...args) => {
    let minecraftPath = channel;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'launcher_skins.json'))) {
                logger__default['default'].silly(`Found launcher skins file. Reading....`);
                fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json').toString(), '{}', err => {
                    try {
                        if (mainWindow) {
                            mainWindow.webContents.send('clear-skin-json-complete');
                        }
                    }
                    catch (err) {
                        const result = 'Error setting launcher skin settings.';
                        if (mainWindow) {
                            mainWindow.webContents.send('skin-error', result);
                        }
                    }
                });
            }
            else {
                if (fs__default['default'].existsSync(minecraftPath)) {
                    const result = 'Your launcher skins settings are corrupt or empty.';
                    fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json').toString(), '{}', err => {
                        if (err) {
                            if (mainWindow) {
                                mainWindow.webContents.send('clear-skin-json-complete');
                            }
                        }
                        else {
                            logger__default['default'].silly(`clear skins failure. Error: ${err}`);
                            if (mainWindow) {
                                mainWindow.webContents.send('skin-error', result);
                            }
                        }
                    });
                }
                else {
                    const result = `Your minecraft path isn't set correctly or missing.`;
                    if (mainWindow) {
                        mainWindow.webContents.send('skin-error', result);
                    }
                }
            }
        }
        else {
            const result = 'Your Minecraft path is unset.';
            if (mainWindow) {
                mainWindow.webContents.send('skin-error', result);
            }
        }
    }
});
electron.ipcMain.on('get-skin-json', (event, channel, ...args) => {
    let minecraftPath = channel;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'launcher_skins.json'))) {
                fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'launcher_skins.json'), 'utf8', (err, data) => {
                    try {
                        const result = JSON.parse(data);
                        if (mainWindow) {
                            mainWindow.webContents.send('skin-json-received', result);
                        }
                    }
                    catch (err) {
                        if (data === '') {
                            fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json').toString(), '{}', err => {
                                try {
                                    if (mainWindow) {
                                        mainWindow.webContents.send('skin-json-received', {});
                                    }
                                }
                                catch (err) {
                                    const result = 'Your launcher skins file does not exist. Unable to create a launcher skins file.';
                                    logger__default['default'].silly(`launcher skin create failure. Error: ${err}`);
                                    if (mainWindow) {
                                        mainWindow.webContents.send('skin-error', result);
                                    }
                                }
                            });
                            logger__default['default'].silly(`get skin failure. Error: ${err}`);
                            const result = 'Your launcher skins settings are corrupt or empty.';
                            if (mainWindow) {
                                mainWindow.webContents.send('skin-error', result);
                            }
                        }
                    }
                });
            }
            else {
                if (fs__default['default'].existsSync(minecraftPath)) {
                    fs__default['default'].writeFile(path__default['default'].join(minecraftPath, 'launcher_skins.json').toString(), '{}', err => {
                        try {
                            if (mainWindow) {
                                mainWindow.webContents.send('skin-json-received', {});
                            }
                        }
                        catch (err) {
                            const result = 'Your launcher skins file does not exist. Unable to create a launcher skins file.';
                            logger__default['default'].silly(`skin added failure. Error: ${err}`);
                            if (mainWindow) {
                                mainWindow.webContents.send('skin-error', result);
                            }
                        }
                    });
                }
                else {
                    const result = `Your minecraft path isn't set correctly or missing.`;
                    if (mainWindow) {
                        mainWindow.webContents.send('skin-error', result);
                    }
                }
            }
        }
        else {
            const result = 'Your Minecraft path is unset.';
            if (mainWindow) {
                mainWindow.webContents.send('skin-error', result);
            }
        }
    }
});
// Quick Launch get server list file.
electron.ipcMain.handle('get-server-list-file', (event, channel) => {
    let minecraftPath = channel;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'servers.dat'))) {
                fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'servers.dat'), (err, data) => {
                    if (!data || err || !isObjectLike__default['default'](data)) {
                        const result = 'Error parsing servers.dat' + err;
                        logger__default['default'].error(result);
                        mainWindow.webContents.send('server-list-error', result);
                        return;
                    }
                    if (data.length === 0) {
                        const result = 'servers.dat file is empty';
                        logger__default['default'].error(result);
                        mainWindow.webContents.send('server-list-error', result);
                        return;
                    }
                    // Parse servers.dat with nbt lib
                    try {
                        nbt__default['default'].parse(data, (error, nbtData) => {
                            if (!nbtData ||
                                nbtData.type !== 'compound' ||
                                !nbtData.value.servers) {
                                const result = 'servers.dat file is corrupt or empty';
                                logger__default['default'].error(result);
                                mainWindow.webContents.send('server-list-error', result);
                                return;
                            }
                            // No error, all good we can parse the file.
                            mainWindow.webContents.send('server-list-received', nbtData);
                        });
                    }
                    catch (err) {
                        const result = 'Error getting servers.dat to import default servers.';
                        logger__default['default'].error(result);
                        mainWindow.webContents.send('server-list-error', result);
                    }
                });
            }
            else {
                const result = `Your servers.dat file isn't set correctly or missing.`;
                mainWindow.webContents.send('server-list-error', result);
                return;
            }
        }
        else {
            const result = `Your minecraft path isn't set correctly or missing.`;
            mainWindow.webContents.send('server-list-error', result);
            return;
        }
    }
    else {
        logger__default['default'].error('No main window during get-server-list-file call.');
    }
});
// Helper function to read in World PNG file.
function readPngFile(filePath) {
    return new Promise((resolve, reject) => {
        fs__default['default'].readFile(filePath, (err, data) => {
            if (err) {
                reject(err);
            }
            else {
                // Convert binary data to base64-encoded string
                const base64Data = Buffer.from(data).toString('base64');
                const dataString = `data:image/png;base64,${base64Data}`;
                resolve(dataString);
            }
        });
    });
}
// Helper function to read in level.dat file.
function readLevelFile(filePath) {
    return new Promise((resolve, reject) => {
        fs__default['default'].readFile(path__default['default'].join(`${filePath}`, 'level.dat'), (err, data) => {
            if (err) {
                if (err.code === 'ENOENT')
                    resolve('SKIP_FOLDER'); // level.dat does not exist in this folder
                reject(`Error parsing level.dat ${filePath}: ${err.message}`);
            }
            // Data object is wrong
            if (!data || !isObjectLike__default['default'](data)) {
                const result = 'One or more level.dat files are corrupt or empty. Path: ' + filePath;
                logger__default['default'].error(result);
                return;
            }
            // Parse level.dat with nbt lib
            try {
                nbt__default['default'].parse(data, (error, nbtData) => {
                    if (!nbtData || nbtData.type !== 'compound') {
                        const result = 'File is corrupt or empty';
                        logger__default['default'].error(result);
                        mainWindow.webContents.send('single-player-list-error', result);
                        return;
                    }
                    // Successful data read, pass the file contents through
                    resolve(nbtData);
                });
            }
            catch (err) {
                reject(`Error parsing level.dat ${filePath}: ${err.message}`);
            }
        });
    });
}
// Function to process each folder in a directory
async function processFoldersInDirectory(minecraftPath) {
    let index = 0;
    try {
        await fs__default['default'].promises
            .readdir(`${minecraftPath}/saves`, { withFileTypes: true })
            .then(async (folders) => {
            if (folders.length === 0) {
                // Saves folder is empty, clear their quick launch json file.
                fs__default['default'].writeFile(path__default['default']
                    .join(minecraftPath, 'badlion_quick_launch_worlds_v2.json')
                    .toString(), '{[]}', err => {
                    try {
                        mainWindow.webContents.send('get-single-player-json-received', '{[]}');
                    }
                    catch (err) {
                        logger__default['default'].silly(`launcher quick launch worlds create failure. Error: ${err}`);
                    }
                });
                return;
            }
            for (const folder of folders) {
                const worldObject = {
                    levelInfo: {},
                    image: '',
                    index: index,
                    folderName: '',
                };
                const folderPath = path__default['default'].join(`${minecraftPath}/saves`, folder.name);
                const filePath = path__default['default'].join(folderPath, 'icon.png');
                if (folder.name[0] === '.')
                    continue; // Ignore folders that start with a period, like .DS_STORE
                if (!folder.isDirectory())
                    continue; // Ignore files
                try {
                    // Read level.dat for filename
                    if (folderPath) {
                        await readLevelFile(folderPath).then(async (levelFileObject) => {
                            if (levelFileObject === 'SKIP_FOLDER')
                                return; // level.dat does not exist in this folder, it is just some random folder we skip
                            worldObject.levelInfo = levelFileObject;
                            // Look for icon.png, if nothing that's fine.
                            if (fs__default['default'].existsSync(filePath)) {
                                await readPngFile(filePath).then(pngDataString => {
                                    worldObject.image = pngDataString;
                                    worldObject.folderName = folder.name;
                                    // Built the object, send it out to app.
                                    mainWindow.webContents.send('single-player-list-received', worldObject);
                                    index += 1; // Next folder in /saves directory
                                });
                            }
                            else {
                                worldObject.image = '';
                                worldObject.folderName = folder.name;
                                // Built the object, send it out to app.
                                mainWindow.webContents.send('single-player-list-received', worldObject);
                                index += 1; // Next folder in /saves directory
                            }
                        });
                    }
                }
                catch (err) {
                    logger__default['default'].error(`Error reading directory ${folderPath}: ${err}`);
                    mainWindow.webContents.send('single-player-list-error', `Error reading directory ${folderPath}: ${err}`);
                }
            }
        });
    }
    catch (err) {
        logger__default['default'].error(`Error reading directory ${minecraftPath}/saves: ${err}`);
        mainWindow.webContents.send('single-player-list-error', `Error reading directory ${minecraftPath}/saves: ${err}`);
    }
}
// Quick Launch get single-player list file.
electron.ipcMain.handle('get-single-player-list-file', (event, channel) => {
    let minecraftPath = channel;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            if (fs__default['default'].existsSync(`${minecraftPath}/saves`)) {
                processFoldersInDirectory(`${minecraftPath}`);
            }
            else {
                // No saves folder, clear their quick launch json file.
                fs__default['default'].writeFile(path__default['default']
                    .join(minecraftPath, 'badlion_quick_launch_worlds_v2.json')
                    .toString(), '{[]}', err => {
                    try {
                        mainWindow.webContents.send('get-single-player-json-received', '{[]}');
                    }
                    catch (err) {
                        logger__default['default'].silly(`launcher quick launch worlds create failure. Error: ${err}`);
                    }
                });
            }
        }
        else {
            const result = `Your minecraft path isn't set correctly or missing.`;
            mainWindow.webContents.send('single-player-list-error', result);
            return;
        }
    }
    else {
        logger__default['default'].error('No main window during get-single-player-list-file call.');
    }
});
// Quick Launch read badlion_quick_launch_worlds_v2.json to get the user's files
electron.ipcMain.handle('get-single-player-worlds-json', (event, channel) => {
    let minecraftPath = channel;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            if (fs__default['default'].existsSync(path__default['default'].join(minecraftPath, 'badlion_quick_launch_worlds_v2.json'))) {
                fs__default['default'].readFile(path__default['default'].join(minecraftPath, 'badlion_quick_launch_worlds_v2.json'), 'utf8', (err, data) => {
                    try {
                        mainWindow.webContents.send('get-single-player-json-received', JSON.parse(data));
                    }
                    catch (err) {
                        if (data === '') {
                            fs__default['default'].writeFile(path__default['default']
                                .join(minecraftPath, 'badlion_quick_launch_worlds_v2.json')
                                .toString(), '{[]}', err => {
                                try {
                                    mainWindow.webContents.send('get-single-player-json-received', '{[]}');
                                }
                                catch (err) {
                                    const result = 'Your launcher quick launch worlds file does not exist. Unable to create a launcher quick launch worlds file.';
                                    logger__default['default'].silly(`launcher quick launch worlds create failure. Error: ${err}`);
                                    mainWindow.webContents.send('single-player-list-error', result);
                                }
                            });
                            logger__default['default'].silly(`get quick launch worlds failure. Error: ${err}`);
                        }
                        else {
                            // data is empty somehow, send them an empty file.
                            mainWindow.webContents.send('get-single-player-json-received', '{[]}');
                        }
                    }
                });
            }
            else {
                // Write to the file an empty file
                fs__default['default'].writeFileSync(path__default['default'].join(minecraftPath, 'badlion_quick_launch_worlds_v2.json'), '{[]}');
                // Send empty file to frontend
                mainWindow.webContents.send('get-single-player-json-received', '{[]}');
            }
        }
        else {
            const result = `Your minecraft path isn't set correctly or missing.`;
            mainWindow.webContents.send('single-player-list-error', result);
            return;
        }
    }
    else {
        logger__default['default'].error('No main window during get-single-player-worlds-file call.');
    }
});
// Quick launch write to badlion_quick_launch_worlds_v2.json because they changed something in frontend
electron.ipcMain.handle('set-single-player-worlds-json', (event, channel) => {
    let minecraftPath = channel.minecraftPath;
    let newData = channel.newData;
    if (mainWindow) {
        if (minecraftPath !== undefined) {
            fs__default['default'].writeFileSync(path__default['default'].join(minecraftPath, 'badlion_quick_launch_worlds_v2.json'), JSON.stringify(newData));
        }
        else {
            const result = `Your minecraft path isn't set correctly or missing.`;
            mainWindow.webContents.send('single-player-list-error', result);
            return;
        }
    }
    else {
        logger__default['default'].error('No main window during set-single-player-worlds-file call.');
    }
});
electron.app.whenReady().then(() => {
    const args = process.argv.slice(1);
    // Rerun and prompt for admin access if --setlogin no
    const loginIndex = args.indexOf('--setlogin'); // can be no / yes / minimized
    if (launchApp && isWindows) {
        if (args.includes('--setlogin')) {
            logger__default['default'].silly('--setlogin was found. sending arg to native method');
        }
        if (loginIndex !== -1 && args[loginIndex + 1]) {
            launchApp.launchBLCOnBoot(args[loginIndex + 1], result => {
                logger__default['default'].silly('start-on-system-boot result:', result);
                electron.app.quit(); // kill the instance
            });
        }
    }
    // We didn't get the lock, which means we are a secondary instance trying to start
    if (!acquiredLock) {
        logger__default['default'].info("quitting since we didn't get the lock");
        electron.app.quit();
        return;
    }
    const appDataPath = electron.app.getPath('appData');
    // New Badlion Protocol:
    if (!electron.app.isDefaultProtocolClient('badlion')) {
        // Define custom protocol handler. Deep linking works on packaged versions of the application!
        logger__default['default'].silly('Default protocol set.');
        electron.app.setAsDefaultProtocolClient('badlion');
    }
    electron.protocol.registerFileProtocol('badlion', (request, callback) => {
        const url = request.url.substring(7); // Remove 'badlion://'
        callback({ path: path__default['default'].join(__dirname, url) });
    });
    // Check command-line arguments if C++ set --login to true
    if (launchApp) {
        if (args.includes('--login')) {
            logger__default['default'].silly('--login was found, starting minimized.');
            opensMinimized = true;
        }
    }
    logger__default['default'].info('electron ready');
    // Asset cache webserver setup
    try {
        const app = express__default['default']();
        app.get('/assets/:asset_id', async (req, res, next) => {
            res.locals.fetchUrl = `https://assets.badlion.net/client/launcher_cache/${req.params.asset_id}`;
            next();
        }, fileCacheMiddleware__default['default']({
            cacheDir: path__default['default'].join(appDataPath, '/Badlion Client/tmp'),
            maxSize: 128 * 1024 * 1024,
        }), (req, res) => {
            res.set({
                'Content-Type': res.locals.contentType,
                'Content-Length': res.locals.contentLength,
            });
            res.end(res.locals.buffer, 'binary');
        });
        app.listen(PORT + 1).on('error', err => {
            logger__default['default'].error('local express server failed to startup', err);
        });
        logger__default['default'].info('local express server setup');
    }
    catch (e) {
        logger__default['default'].error('local express server failed to startup', e);
    }
    // Shrink main screen if they have a puny monitor
    const mainScreen = electron__default['default'].screen.getPrimaryDisplay();
    const dimensions = mainScreen.size;
    if (dimensions.width < 1400 || dimensions.height < 800) {
        windowSettings['width'] = MAIN_WINDOW_MIN_WIDTH;
        windowSettings['height'] = MAIN_WINDOW_MIN_HEIGHT;
    }
    // create the updater window.
    updaterWindow = new electron.BrowserWindow(updaterWindowSettings);
    logger__default['default'].info('updaterWindow created');
    if (fs__default['default'].existsSync(path__default['default'].join(__dirname, 'updater.html'))) {
        logger__default['default'].info('updater file exists');
    }
    // load updater file.
    updaterWindow.loadFile(path__default['default'].join(__dirname, 'updater.html')).catch(e => {
        logger__default['default'].info('error loading url for updaterWindow', e);
    });
    // setup auto updater when window is loaded.
    updaterWindow.webContents.on('dom-ready', () => {
        logger__default['default'].info('updater dom is ready to show');
        if (!updaterWindowLoaded && updaterWindow) {
            updaterWindowLoaded = true;
            if (!opensMinimized) {
                updaterWindow.show();
            }
            logger__default['default'].info('init auto updater');
            initAutoUpdater();
        }
    });
    updaterWindow.webContents.on('did-fail-load', (event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId) => {
        logger__default['default'].error('did-fail-load', event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId);
    });
    updaterWindow.on('ready-to-show', () => {
        logger__default['default'].info('updater window is ready to show');
        if (!updaterWindowLoaded && updaterWindow) {
            updaterWindowLoaded = true;
            if (!opensMinimized) {
                updaterWindow.show();
            }
            logger__default['default'].info('init auto updater');
            initAutoUpdater();
        }
    });
    updaterWindow.on('closed', () => {
        // Close the main window too...shut down
        if (!mainWindowPrompted) {
            logger__default['default'].info('closing window since updater was prematurely killed');
            if (launchApp) {
                launchApp.suicide(() => {
                    logger__default['default'].info('done with C++ logic, quitting the application now');
                    // Force kill ourselves here
                    handleShutdown();
                });
            }
        }
    });
    logger__default['default'].info('updaterWindow listeners registered');
    // Create Main Window but just don't show it yet
    initMainWindow();
    // Clean up old cookies
    removeMicrosoftCookies();
    // This is needed to handle when closing via the start bar (and not hitting the X on the title bar)
    electron.app.on('before-quit', function (evt) {
        logger__default['default'].info('before-quit received');
        // Destroy tray if present
        if (tray) {
            tray.destroy();
        }
    });
    electron.app.on('will-finish-launching', function () {
        // Protocol handler for osx
        electron.app.on('open-url', function (event, url) {
            event.preventDefault();
        });
    });
    electron.app.on('will-quit', () => {
        logger__default['default'].verbose(`will-quit received, quitting. (mainWindowPrompted=${mainWindowPrompted ? 'true' : 'false'})`);
        if (tray) {
            tray.destroy();
        }
        // Sometimes if you close the client fast enough, will not fire off before-quit or window-all-closed
        if (!mainWindowPrompted) {
            // Force application to close
            logger__default['default'].verbose('will-quit forcing exit since main window never started.');
            electron.app.quit();
        }
    });
    electron.app.on('window-all-closed', () => {
        logger__default['default'].verbose('window-all-closed received, quitting.');
        electron.app.quit();
    });
});
// Image screenshot copy util
nativeEventHandler.on('copy-image', (data) => {
    logger__default['default'].silly('copy-image received', data);
    const json = JSON.parse(data);
    const { path } = json;
    if (!path) {
        logger__default['default'].error('received bad image data', data);
        return;
    }
    const img = electron__default['default'].nativeImage.createFromPath(path);
    if (!img.isEmpty()) {
        electron.clipboard.writeImage(img);
        if (launchApp) {
            launchApp.sendScreenshot(true, () => {
                logger__default['default'].info('successfully copied image', path);
            });
        }
    }
    else {
        logger__default['default'].error('Received invalid image', path);
        if (launchApp) {
            launchApp.sendScreenshot(false, () => {
                // Do nothing
            });
        }
    }
});
nativeEventHandler.on('open-microsoft-prompt', () => {
    logger__default['default'].silly('Creating Microsoft Window for Minecraft Login');
    createMicrosoftWindow(false);
});
nativeEventHandler.on('close-microsoft-prompt', () => {
    logger__default['default'].silly('Killing Microsoft Window for Minecraft Login');
    if (microsoftWindow) {
        microsoftWindow.close();
    }
});
const buildCookieUrl = (cookie) => {
    let url = '';
    // get prefix, like https://www.
    url += cookie.secure ? 'https://' : 'http://';
    url += cookie.domain && cookie.domain.charAt(0) === '.' ? 'www' : '';
    // append domain and path
    url += cookie.domain;
    url += cookie.path;
    return url;
};
const removeMicrosoftCookie = (cookie) => {
    if (cookie && cookie.domain && cookie.domain.indexOf('live.com') !== -1) {
        const url = buildCookieUrl(cookie);
        electron.session.defaultSession.cookies.remove(url, cookie.name);
    }
};
const removeMicrosoftCookies = () => {
    // On boot nuke any cookies from live.com
    electron.session.defaultSession.cookies
        .get({})
        .then((cookies) => {
        cookies.forEach((cookie) => {
            removeMicrosoftCookie(cookie);
        });
    })
        .catch(error => {
        logger__default['default'].info('Cookie error', error);
    });
    logger__default['default'].info('old microsoft cookies removed');
};
const handleResponseCode = (code, error) => {
    // error: access_denied (this is sent when they hit the back button to cancel)
    if (error === 'access_denied') {
        return sendMicrosoftOAuthFlowError(1);
    }
    else if (error === 'server_error' || error === 'temporarily_unavailable') {
        return sendMicrosoftOAuthFlowError(-22);
    }
    else if (error) {
        return sendMicrosoftOAuthFlowError(-23);
    }
    // Call C++
    if (launchApp && code) {
        launchApp.microsoftOAuth(code, (data) => {
            // forward to modal to end the oauth flow
            if (mainWindow) {
                mainWindow.webContents.send('microsoft-oauth-flow-end', data);
            }
        });
    }
};
const handleNewResponseCode = (code, error) => {
    // error: access_denied (this is sent when they hit the back button to cancel)
    if (error === 'access_denied') {
        return sendNewMicrosoftOAuthFlowError(1);
    }
    else if (error === 'server_error' || error === 'temporarily_unavailable') {
        return sendNewMicrosoftOAuthFlowError(-22);
    }
    else if (error) {
        return sendNewMicrosoftOAuthFlowError(-23);
    }
    if (launchApp && code) {
        if (mainWindow) {
            mainWindow.webContents.send('microsoft-new-oauth-flow-end', code);
        }
    }
};
const handleMSAccountInfo = (accountInfo) => {
    if (launchApp && accountInfo) {
        launchApp.newMicrosoftOAuth(accountInfo, (data) => {
            // forward to modal to end the oauth flow
            if (mainWindow) {
                // Need to get
                mainWindow.webContents.send('microsoft-new-oauth-flow-end-with-info', data);
            }
        });
    }
};
const sendMicrosoftOAuthFlowError = (errorCode) => {
    // Send to renderer that we killed it ourselves
    if (mainWindow) {
        const response = { err: errorCode };
        const data = JSON.stringify(response);
        mainWindow.webContents.send('microsoft-oauth-flow-end', data);
    }
};
const sendNewMicrosoftOAuthFlowError = (errorCode) => {
    // Send to renderer that we killed it ourselves
    if (mainWindow) {
        const response = { err: errorCode };
        const data = JSON.stringify(response);
        mainWindow.webContents.send('microsoft-new-oauth-flow-end', data);
    }
};
const createMicrosoftWindow = (setParentAsMainWindow, overridePosition, overrideSize) => {
    // Only one window at a time
    if (!microsoftWindow) {
        // No main window, how are we here?
        if (!mainWindow ||
            !microsoftWindowSettings['width'] ||
            !microsoftWindowSettings['height']) {
            return;
        }
        let currentPosition;
        let currentSize;
        // Get current window's information
        if (overridePosition && overrideSize) {
            currentPosition = overridePosition;
            currentSize = overrideSize;
        }
        else {
            currentPosition = mainWindow.getPosition();
            currentSize = mainWindow.getSize();
        }
        // Do the math on new position for window
        const windowX = Math.round(currentPosition[0] +
            (currentSize[0] - microsoftWindowSettings['width']) / 2);
        const windowY = Math.round(currentPosition[1] +
            (currentSize[1] - microsoftWindowSettings['height']) / 2);
        microsoftWindow = new electron.BrowserWindow(microsoftWindowSettings);
        microsoftWindow.setPosition(windowX, windowY);
        // Don't show the drop downs etc
        microsoftWindow.removeMenu();
        if (setParentAsMainWindow) {
            microsoftWindow.setParentWindow(mainWindow);
        }
        let closeDetected = false;
        // Security stuff
        //const allowedDomains = ['live.com', 'login.live.com', 'account.live.com', 'signup.live.com', 'microsoft.com',
        //  'login.microsoft.com', 'account.microsoft.com', 'signup.microsoft.com', 'github.com'];
        microsoftWindow.webContents.on('will-navigate', (event, newUrl) => {
            const url = new URL(newUrl);
            //if (!allowedDomains.includes(url.hostname)) {
            //  logger.error('blocking bad url', newUrl);
            //  event.preventDefault();
            //}
        });
        microsoftWindow.webContents.on('will-redirect', (event, newUrl) => {
            // Successful oAuth flow
            if ((newUrl.startsWith('https://login.live.com/oauth20_desktop.srf') &&
                newUrl.indexOf('code') !== -1) ||
                newUrl.indexOf('error') !== -1) {
                const url = new URL(newUrl);
                const code = url.searchParams.get('code');
                const error = url.searchParams.get('error');
                // Early return if nothing found, can happen if 'code' or 'error' is found in the url but isn't a parameter,
                // like in github auth for example: 'response_type%3Dcode'
                if (!code && !error) {
                    return;
                }
                logger__default['default'].info('microsoft redirect url', url);
                if (error) {
                    logger__default['default'].info('got microsoft oauth error', error);
                }
                // Don't actually redirect
                event.preventDefault();
                // We are going to close it ourselves, don't trigger something wrong
                closeDetected = true;
                // Kill the window we made
                if (microsoftWindow) {
                    microsoftWindow.destroy();
                }
                // Call C++ to do the rest (or show UI errors etc)
                if (code || error) {
                    handleResponseCode(code, error);
                }
            }
        });
        microsoftWindow.on('closed', () => {
            // Clean house
            removeMicrosoftCookies();
            microsoftWindow = null;
            if (!closeDetected) {
                closeDetected = true;
                // Notify C++ that they cancelled the login process
                if (launchApp) {
                    launchApp.cancelMicrosoftOAuth((data) => {
                        // Do nothing
                    });
                }
                sendMicrosoftOAuthFlowError(1);
            }
        });
        microsoftWindow.webContents.on('did-fail-load', (event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId) => {
            logger__default['default'].error('microsoftWindow did-fail-load', event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId);
        });
        microsoftWindow
            .loadURL('https://login.live.com/oauth20_authorize.srf?' +
            'client_id=00000000402b5328&response_type=code' +
            '&scope=service%3A%3Auser.auth.xboxlive.com%3A%3AMBI_SSL' +
            '&redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf', {
            // @ts-ignore
            reloadIgnoringCache: true, // https://github.com/electron/electron/issues/28208 try to ignore cache
        })
            .then(() => {
            // do nothing
        })
            .catch(error => {
            logger__default['default'].error('error loading microsoft url', error);
        });
        // MC in game try to force it to stay on top of the game
        if (!setParentAsMainWindow) {
            microsoftWindow.setAlwaysOnTop(true, 'pop-up-menu');
        }
        microsoftWindow.focus();
    }
    else {
        // Window exists, show it
        microsoftWindow.focus();
    }
};
const createNewMicrosoftWindow = (setParentAsMainWindow, overridePosition, overrideSize) => {
    // Only one window at a time
    if (!newMicrosoftWindow) {
        // No main window, how are we here?
        if (!mainWindow ||
            !newMicrosoftWindowSettings['width'] ||
            !newMicrosoftWindowSettings['height']) {
            return;
        }
        let currentPosition;
        let currentSize;
        // Get current window's information
        if (overridePosition && overrideSize) {
            currentPosition = overridePosition;
            currentSize = overrideSize;
        }
        else {
            currentPosition = mainWindow.getPosition();
            currentSize = mainWindow.getSize();
        }
        // Do the math on new position for window
        const windowX = Math.round(currentPosition[0] +
            (currentSize[0] - newMicrosoftWindowSettings['width']) / 2);
        const windowY = Math.round(currentPosition[1] +
            (currentSize[1] - newMicrosoftWindowSettings['height']) / 2);
        newMicrosoftWindow = new electron.BrowserWindow(newMicrosoftWindowSettings);
        newMicrosoftWindow.setPosition(windowX, windowY);
        // Don't show the drop downs etc
        newMicrosoftWindow.removeMenu();
        if (setParentAsMainWindow) {
            newMicrosoftWindow.setParentWindow(mainWindow);
        }
        let closeDetected = false;
        newMicrosoftWindow.webContents.on('will-redirect', (event, newUrl) => {
            // Successful oAuth flow
            if ((newUrl.startsWith('https://login.live.com/oauth20_desktop.srf') &&
                newUrl.indexOf('code') !== -1) ||
                newUrl.indexOf('error') !== -1) {
                const url = new URL(newUrl);
                const code = url.searchParams.get('code');
                const error = url.searchParams.get('error');
                // Early return if nothing found, can happen if 'code' or 'error' is found in the url but isn't a parameter,
                // like in github auth for example: 'response_type%3Dcode'
                if (!code && !error) {
                    return;
                }
                logger__default['default'].info('microsoft redirect url', url);
                if (error) {
                    logger__default['default'].info('got microsoft oauth error', error);
                }
                // Don't actually redirect
                event.preventDefault();
                // We are going to close it ourselves, don't trigger something wrong
                closeDetected = true;
                // Kill the window we made
                if (newMicrosoftWindow) {
                    newMicrosoftWindow.destroy();
                }
                // Call C++ to do the rest (or show UI errors etc)
                if (code || error) {
                    handleNewResponseCode(code, error);
                }
            }
        });
        newMicrosoftWindow.on('closed', () => {
            // Clean house
            removeMicrosoftCookies();
            newMicrosoftWindow = null;
            if (!closeDetected) {
                closeDetected = true;
                // Notify C++ that they cancelled the login process
                if (launchApp) {
                    launchApp.cancelMicrosoftOAuth((data) => {
                        // Do nothing
                    });
                }
                sendNewMicrosoftOAuthFlowError(1);
            }
        });
        newMicrosoftWindow.webContents.on('did-fail-load', (event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId) => {
            logger__default['default'].error('newMicrosoftWindow did-fail-load', event, errorCode, errorDescription, validatedURL, isMainFrame, frameProcessId, frameRoutingId);
        });
        // Prod App ID
        // 62d561ab-4581-41bc-8cb3-d66051edb4b9
        // Test App ID
        // d4d237e3-2518-496f-a4f4-10834e8eadbd (Also change source in react code to internaldevlauncher)
        newMicrosoftWindow
            .loadURL('https://login.live.com/oauth20_authorize.srf?' +
            'client_id=62d561ab-4581-41bc-8cb3-d66051edb4b9&response_type=code' +
            '&scope=XboxLive.signin+offline_access+openid+email' +
            '&redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf', {
            // @ts-ignore
            reloadIgnoringCache: true, // https://github.com/electron/electron/issues/28208 try to ignore cache
        })
            .then(() => {
            // do nothing
        })
            .catch(error => {
            logger__default['default'].error('error loading microsoft url', error);
        });
        // MC in game try to force it to stay on top of the game
        if (!setParentAsMainWindow) {
            newMicrosoftWindow.setAlwaysOnTop(true, 'pop-up-menu');
        }
        newMicrosoftWindow.focus();
    }
    else {
        // Window exists, show it
        newMicrosoftWindow.focus();
    }
};
electron.ipcMain.handle('microsoft-oauth-flow-start', event => {
    createMicrosoftWindow();
});
electron.ipcMain.handle('microsoft-oauth-cancel', event => {
    if (microsoftWindow) {
        microsoftWindow.close();
    }
});
electron.ipcMain.handle('microsoft-new-oauth-flow-start', event => {
    createNewMicrosoftWindow();
});
electron.ipcMain.handle('microsoft-new-oauth-flow-account-info', (event, data) => {
    handleMSAccountInfo(data);
});
electron.ipcMain.handle('microsoft-new-oauth-cancel', event => {
    if (newMicrosoftWindow) {
        newMicrosoftWindow.close();
    }
});
electron.ipcMain.handle('badlion-shutdown', event => {
    handleShutdown();
});

}());