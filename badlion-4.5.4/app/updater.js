(function () {'use strict';

(async () => {
    const appLoaded = await launcherApp.appLoaded();
    // if we failed to launch, proceed to main window which will display a proper error for us.
    if (!appLoaded) {
        launcherApp.ipcBridge.invoke('open-main-window');
    }
})();

}());