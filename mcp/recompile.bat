@echo off
set "backupDir=%USERPROFILE%\Desktop\BkpSRC"
if exist "%backupDir%" rd /s /q "%backupDir%"
mkdir "%backupDir%"
xcopy /Y /E /I src\minecraft\com "%backupDir%\com"
runtime\bin\python\python_mcp runtime\recompile.py %*
pause
