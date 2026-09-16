(function () {'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var electron = require('electron');
var logger = require('electron-log');
var md5 = require('blueimp-md5');
var nodeProcess = require('process');
var fs = require('fs');
var plist = require('plist');

function _interopDefaultLegacy (e) { return e && typeof e === 'object' && 'default' in e ? e : { 'default': e }; }

var logger__default = /*#__PURE__*/_interopDefaultLegacy(logger);
var md5__default = /*#__PURE__*/_interopDefaultLegacy(md5);
var fs__default = /*#__PURE__*/_interopDefaultLegacy(fs);
var plist__default = /*#__PURE__*/_interopDefaultLegacy(plist);

const config = {
    isDev: false,
    updaterEnabled: true,
    enableAutoupdaterLogger: true,
    // options: error, warn, info, verbose, debug, silly
    // whichever is set will include all options to the left as well.
    logLevel: 'silly',
};

function isJson(item) {
    let value = typeof item !== "string" ? JSON.stringify(item) : item;
    try {
        value = JSON.parse(value);
    }
    catch (e) {
        return false;
    }
    return typeof value === "object" && value !== null;
}

// load logger as early as possible for other potential errors
// log more information
logger__default['default'].transports.file.level = config.logLevel;
logger__default['default'].transports.file.format = '{y}/{m}/{d} {h}:{i}:{s}:{ms} {text}';
logger__default['default'].transports.file.sync = true;
logger__default['default'].catchErrors();
const API_BRIDGE_INVOKE_WHITELIST_CHANNELS = [
    'open-main-window',
    'main-window-show',
    'main-window-hide',
    'titlebar-minimize',
    'titlebar-close',
    'titlebar-resize',
    'kill-application',
    'badlion-shutdown',
    'check-for-updates',
    'json-storage-get-database',
    'json-storage-set-value',
    'microsoft-oauth-flow-start',
    'microsoft-oauth-cancel',
    'microsoft-new-oauth-flow-start',
    'microsoft-new-oauth-flow-account-info',
    'start-on-system-boot',
    'echo',
    'get-server-list-file',
    'get-single-player-list-file',
    'get-single-player-worlds-json',
    'set-single-player-worlds-json',
    'updater-mounted',
    'send-streams-request',
    'show-chat-window',
    'hide-chat-window',
    'minimize-chat-window',
    'get-main-window-open',
    'get-main-window-focused',
    'get-chat-window-open',
    'get-chat-window-focused',
    'dispatch-auth-change-to-windows',
    'settings-update',
    'chat-settings-update',
    'router-navigate',
    'backend-auth-state-complete',
];
const API_BRIDGE_RECEIVE_WHITELIST_CHANNELS = [
    'restart_machine',
    'window-focus',
    'json-storage-get-database',
    'json-storage-set-value',
    'minecraft_start',
    'minecraft_stop',
    'update-available',
    'download-progress',
    'update-downloaded',
    'update-not-available',
    'error',
    'sanity-error',
    'launcher-error',
    'check-auth',
    'microsoft-oauth-flow-end',
    'microsoft-new-oauth-flow-end',
    'microsoft-new-oauth-flow-end-with-info',
    'server-list-received',
    'server-list-error',
    'single-player-list-received',
    'single-player-list-error',
    'get-single-player-json-received',
    'set-single-player-json-received',
    'receive-streams-message',
    'main-window-ready',
    'receive-auth-change',
    'chat-window-set-view',
    'settings-update',
    'chat-settings-update',
    'router-navigate-received',
    'webview-mouseup-receive',
    'backend-auth-state-complete',
    'open-about-modal',
];
/**
 * Exposes an `ipcRenderer` bridge which only permits binding to whitelisted channels.
 */
const launcherApiBridge = {
    invoke: (channel, ...args) => {
        if (API_BRIDGE_INVOKE_WHITELIST_CHANNELS.includes(channel)) {
            return electron.ipcRenderer.invoke(channel, ...args);
        }
        else {
            logger__default['default'].warn(`launcherApiBridge.invoke: Attempt to bind to disallowed channel: ${channel}`);
        }
    },
    sendSync: (channel, ...args) => {
        if (API_BRIDGE_INVOKE_WHITELIST_CHANNELS.includes(channel)) {
            return electron.ipcRenderer.sendSync(channel, ...args);
        }
        else {
            logger__default['default'].warn(`launcherApiBridge.sendSync: Attempt to bind to disallowed channel: ${channel}`);
        }
    },
    receive: (channel, callback) => {
        if (API_BRIDGE_RECEIVE_WHITELIST_CHANNELS.includes(channel)) {
            const callbackToUnlisten = (event, ...args) => callback(...args);
            electron.ipcRenderer.on(channel, callbackToUnlisten);
            return callbackToUnlisten;
        }
        else {
            logger__default['default'].warn(`launcherApiBridge.receive: Attempt to bind to disallowed channel: ${channel}`);
            return false;
        }
    },
    removeListener: (channel, callback) => {
        if (API_BRIDGE_RECEIVE_WHITELIST_CHANNELS.includes(channel)) {
            electron.ipcRenderer.removeListener(channel, callback);
        }
        else {
            logger__default['default'].warn(`launcherApiBridge.removeListener: Attempt to bind to disallowed channel: ${channel}`);
        }
    },
    removeListeners: (channel) => {
        if (API_BRIDGE_RECEIVE_WHITELIST_CHANNELS.includes(channel)) {
            electron.ipcRenderer.removeAllListeners(channel);
        }
        else {
            logger__default['default'].warn(`launcherApiBridge.removeListeners: Attempt to bind to disallowed channel: ${channel}`);
        }
    },
};
/**
 * Maintains any `launchApp` callback arguments (for the current window) so that they can be invoked from the main thread.
 */
const launchAppCallbackHandlers = [];
/**
 * Handle `launchApp` callbacks received via IPC.
 */
electron.ipcRenderer.on('launch-app-invoke-callback-response', (event, hash, { index, callbackArgs, }) => {
    const handler = launchAppCallbackHandlers.find(({ invocationHash, argIndex }) => invocationHash === hash && argIndex === index);
    if (handler) {
        handler.callback(...callbackArgs);
    }
});
/**
 * Invokes a `launchApp` method via IPC.
 */
const invokeLaunchAppMethod = async (method, ...args) => {
    // Transform callback arguments into a token because callbacks cannot be serialized/passed over IPC.
    const argsParsed = args.map(arg => typeof arg === 'function' ? '__invokeLaunchAppMethod__callback__' : arg);
    // We need to generate a hash as a reference to the invocation in order to maintain references to callbacks.
    const invocationHash = md5__default['default'](`${new Date().getTime()}.${method}.${JSON.stringify(argsParsed)}`);
    // Look for callback arguments and maintain references in `launchAppCallbackHandlers`.
    args.forEach((arg, argIndex) => {
        if (typeof arg === 'function') {
            launchAppCallbackHandlers.push({
                invocationHash,
                argIndex,
                callback: arg,
            });
        }
    });
    // Invoke the method via IPC in the main thread.
    const invocationResponse = await electron.ipcRenderer.invoke('launch-app-invoke-method', method, invocationHash, ...argsParsed);
    return isJson(invocationResponse)
        ? JSON.parse(invocationResponse)
        : invocationResponse;
};
/**
 * Get the application version.
 */
const appVersion = async () => electron.ipcRenderer.invoke('get-app-version');
/**
 * Returns a boolean depending on whether or not the app loaded successfully.
 */
const appLoaded = async () => electron.ipcRenderer.invoke('get-app-loaded');
/**
 * Returns an error if the application failed to bootstrap.
 */
const appLoadError = async () => electron.ipcRenderer.invoke('get-app-load-error');
/**
 * Restart the Electron app.
 */
const restart = async () => {
    electron.ipcRenderer.invoke('restart-application');
};
/**
 * Shutdown the Electron app.
 */
const shutdown = async () => {
    if (!(await appLoaded())) {
        electron.ipcRenderer.invoke('badlion-shutdown');
        return;
    }
    invokeLaunchAppMethod('suicide', () => {
        electron.ipcRenderer.invoke('badlion-shutdown');
    });
};
/**
 * Opens an external link in the desktop's default manner.
 */
const openExternalLink = (href) => {
    logger__default['default'].info(`opening external link: ${href}`);
    logger__default['default'].debug('opening external link:', href);
    electron.shell.openExternal(href).catch((error) => {
        logger__default['default'].error('failed to open link', error);
    });
};
/**
 * Returns the MacOS version from the plist file.
 * Otherwise ''
 */
const getMacOsVersion = () => {
    if (process.platform !== 'darwin')
        return '';
    try {
        const plistPath = '/System/Library/CoreServices/SystemVersion.plist';
        if (fs__default['default'].existsSync(plistPath)) {
            const plistContent = fs__default['default'].readFileSync(plistPath, 'utf8');
            const plistData = plist__default['default'].parse(plistContent);
            return plistData.ProductVersion || '';
        }
    }
    catch (error) {
        logger__default['default'].error('failed to get macOS version using system_profiler', error);
    }
    return '';
};
/**
 * Streams service IPC-based interface.
 */
const streams = {
    async request(service, data) {
        return launcherApiBridge.invoke('send-streams-request', service, data);
    },
    async send(service, data) {
        return launcherApiBridge.invoke('send-streams-request', service, data, false);
    },
    listen(service, callback) {
        return launcherApiBridge.receive('receive-streams-message', (data) => {
            if (!data)
                return;
            try {
                const response = JSON.parse(data);
                if (response?.service === service) {
                    callback(response?.data);
                }
            }
            catch (err) {
                logger__default['default'].error('Streams service received an invalid JSON payload:', data);
            }
        });
    },
    unlisten(callback) {
        return launcherApiBridge.removeListener('receive-streams-message', callback);
    },
};
/**
 * Exposes global `launcherApp` API.
 */
const launcherApp = {
    versions: {
        system: () => process.platform === 'darwin'
            ? getMacOsVersion()
            : nodeProcess.getSystemVersion(),
        app: async () => await appVersion(),
        node: () => process.versions.node,
        chrome: () => process.versions.chrome,
        electron: () => process.versions.electron,
    },
    process: {
        platform: () => nodeProcess.platform,
        arch: () => nodeProcess.arch,
    },
    appLoaded,
    appLoadError,
    restart,
    shutdown,
    logger: logger__default['default'],
    openExternalLink,
    ipcBridge: launcherApiBridge,
    invokeLaunchAppMethod,
    setJWT: (jwt) => new Promise(resolve => {
        invokeLaunchAppMethod('setJWT', jwt, success => {
            launcherApp.ipcBridge.invoke('backend-auth-state-complete', success);
            resolve(success);
        });
    }),
    streams,
};
electron.contextBridge.exposeInMainWorld('launcherApp', launcherApp);

exports.invokeLaunchAppMethod = invokeLaunchAppMethod;
exports.launchAppCallbackHandlers = launchAppCallbackHandlers;
exports.launcherApiBridge = launcherApiBridge;
exports.launcherApp = launcherApp;

}());