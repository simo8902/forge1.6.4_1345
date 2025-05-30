# Working Forge for Minecraft 1.6.4 MCP8.11
latest forge version: 1.6.4-9.11.1.1345
skipped hash checks;client and server jars are origin - no matter what;
the user mod classes must exist within ```mcp/src/minecraft/com..```
build of jar must happen after compilation and obfuscation
for testing purpose you can use the testclient.bat but first compile and obfuscate
eclipse workspace is as is within mcp/eclipse
changes:
- fixed the damn @SideOnly duplicated shit with custom logic
- reorganized some of the packages
- added argo package independently due do some problems:
```\forge1.6.4_1345\mcp\jars\libraries\net\sourceforge\argo\argo\2.25\argo-2.25.jar```
- libraries and mcp are skipped for now due to the legacy of the python2.7 and the ssl problem

warning: the testclient of the FML is adding only code to the jar from **mcp/reobf/..**, it **DOESNT ADD** resources like textures, lang and so on
