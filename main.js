const electron = require('electron');
const app = electron.app;

const url = require('url');
const path = require('path');
const {app, BrowserWindow} = electron;
//const BrowserWindow = electron.BrowserWindow;

var mainWindow;
app.on('ready', function()){
  mainWindow = new BrowserWindow({});
  mainWindow.loadURL(url.format({
    pathname: path.join(_dirname, 'index.html'),
    protocol: 'file:'.
    slashes: true
  }));
});
