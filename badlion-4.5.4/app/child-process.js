(function () {'use strict';

var logger = require('electron-log');
var process = require('process');

function _interopDefaultLegacy (e) { return e && typeof e === 'object' && 'default' in e ? e : { 'default': e }; }

var logger__default = /*#__PURE__*/_interopDefaultLegacy(logger);
var process__default = /*#__PURE__*/_interopDefaultLegacy(process);

let launchApp;
try {
    logger__default['default'].info('loading node');
    launchApp = require('../../../native-modules/launcher.node');
    logger__default['default'].info('node loaded');
    // Notify the main process that the native module loaded successfully
    process__default['default'].send?.({ type: 'node_child_process_load', status: 'loaded' });
}
catch (error) {
    logger__default['default'].error('couldn\'t load them pesky nodes', error);
    // Notify the main process that loading the native module failed
    process__default['default'].send?.({ type: 'node_child_process_load', status: 'error', error: error });
    process__default['default'].exit(1); // Exit the child process with an error code
}
process__default['default'].on('message', msg => {
    const { functionName, args, callbackId, functionsToSend } = msg;
    // logger.info('got request from main process', functionName, callbackId);
    try {
        // @ts-ignore
        const func = launchApp[functionName];
        if (func && typeof func === 'function') {
            // If the function expects a callback, wrap the callback to send data back via IPC
            for (const index of functionsToSend) {
                args[index] = function (...callbackArgs) {
                    process__default['default'].send?.({
                        type: 'node_child_process_callback',
                        callback_id: callbackId,
                        callback_index: index,
                        callback_args: callbackArgs
                    });
                };
            }
            // Call the native function with modified arguments
            const value = func(...args);
            process__default['default'].send?.({ type: 'node_child_process_return_value', callback_id: callbackId, value: value });
        }
        else {
            process__default['default'].send?.({ type: 'node_child_process_error', callback_id: callbackId, error: 'native function not found' });
        }
    }
    catch (error) {
        logger__default['default'].error('failed to invoke native function', error);
        process__default['default'].send?.({ type: 'node_child_process_error', callback_id: callbackId, error: error });
    }
});
// Make it alive forever
setInterval(() => { }, 1 << 30);

}());