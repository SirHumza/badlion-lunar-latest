(function () {'use strict';

var electron = require('electron');

document.addEventListener('mouseup', event => {
    if (event.button === 3 || event.button === 4) {
        // Prevent default behaviour (parent page router handler) on back/forward mouse buttons
        event.preventDefault();
    }
    electron.ipcRenderer.invoke('webview-mouseup', event.button);
});

}());