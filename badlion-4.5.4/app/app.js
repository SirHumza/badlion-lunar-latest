(function () {'use strict';

let shutdownInProgress = false;
let showConfirmShutdownPopup;
if (typeof launcherApp !== 'undefined') {
    launcherApp.logger.info('Platform debug', {
        arch: launcherApp.process.arch(),
        platform: launcherApp.process.platform(),
        system: launcherApp.versions.system(),
        app: launcherApp.versions.app(),
        chrome: launcherApp.versions.chrome(),
        electron: launcherApp.versions.electron(),
        node: launcherApp.versions.node(),
    });
}
window.setShowConfirmShutdownPopup = popup => {
    showConfirmShutdownPopup = popup;
};
// This is not elegant, but this catches if someone closes BLC from the Task Bar
window.addEventListener('beforeunload', async (event) => {
    const evtTarget = event.target;
    if (evtTarget?.activeElement?.nodeName === 'IFRAME') {
        // Do not capture beforeunload events triggered from within iframes.
        // Also do not allow iframes to redirect to a non-launcher page.
        event.returnValue = false;
        return false;
    }
    launcherApp.logger.debug('onbeforeunload received');
    event.returnValue = false;
    if (!shutdownInProgress) {
        shutdownInProgress = true;
        const confirmShutdownPopup = typeof showConfirmShutdownPopup === 'function'
            ? await showConfirmShutdownPopup()
            : true;
        if (!confirmShutdownPopup) {
            shutdownInProgress = false;
            return;
        }
        launcherApp.shutdown();
    }
});
// globally prevent users from shift clicking links while in
// electron mode.
window.onclick = (event) => {
    if (event.shiftKey)
        event.preventDefault();
    if (event.ctrlKey)
        event.preventDefault();
    if (event.altKey)
        event.preventDefault();
    if (event.which === 2)
        event.preventDefault();
    if (event.button === 1)
        event.preventDefault();
    // set the target to the current element.
    let target = event.target;
    // if the target isn't a link, check all its parents.
    while (target && target.parentNode && target.tagName !== 'A') {
        target = target.parentNode;
    }
    // global fix for external links.
    if (target && target.tagName === 'A') {
        const link = target;
        if (link.target === '_blank' || link.href.indexOf('http') !== -1) {
            event.preventDefault();
            launcherApp.openExternalLink(link.href);
        }
    }
};
// 2019-07-25 dedicated event now for the auxclick (middle click)
// https://stackoverflow.com/questions/49164924/electron-prevent-multiple-instance-with-middle-click
window.onauxclick = (event) => {
    if (event.button === 1)
        event.preventDefault();
};

}());