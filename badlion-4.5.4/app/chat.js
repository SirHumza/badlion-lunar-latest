(function () {'use strict';

window.addEventListener('beforeunload', async (event) => {
    event.returnValue = false;
    if (typeof launcherApp !== 'undefined') {
        launcherApp.ipcBridge.invoke('hide-chat-window');
    }
    return false;
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