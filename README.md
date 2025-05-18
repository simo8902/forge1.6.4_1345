# Test Mod for Minecraft 1.6.4

**Forge Version:** `forge-1.6.4-9.11.1.965-src`  
**Note:** manual setup is required, ensure both **client** and **server** jars are present in `mcp/jars`

> ⚠️ MD5/SHA1 verification checks are **skipped**

**the mod structure should look like this:**
helloworld.jar
├── mcmod.info
└── com/
└── example/
└── helloworld/
└── HelloWorldMod.class
			
**after all is done, compile the .jar**
```jar cf helloworld.jar com mcmod.info```
			
## 🛠️ Setup & Compilation

To install:
```bash
install.cmd
```

After writing the mod:
```
recompile.bat
the data is located within: mcp/src/minecraft/com...
reobfuscate.bat
the data is located within: mcp/reobf/minecraft/com...
```