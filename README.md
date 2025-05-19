# Test Mod for Minecraft 1.6.4

**Forge Version:** `forge-1.6.4-9.11.1.965-src`  
**Note:** manual setup is required, ensure both **client** and **server** jars are present in `mcp/jars`

> ⚠️ MD5/SHA1 verification checks are **skipped**

## 📁 Mod Structure before obf
```
helloworld.jar
└──META-INF/
   └── mcmod.info/
└── src/
    └── minecract/
		└── net/
			└── minecract/
				└── src/
					└── testmod/
						└── TestMod.java
```
		
**after all is done, compile the .jar**
```jar cf helloworld.jar -C reobf/minecraft . -C META-INF mcmod.info```
			
## 🛠️ Setup & Compilation

To install:
```bash
install.cmd
```

After writing the mod:
```
recompile.bat
the data is located within: mcp/src/minecraft/net...
reobfuscate.bat
the data is located within: mcp/reobf/minecraft/net...
```

![Created](https://img.shields.io/badge/Created-18_May_2025-blue)

## 📜 Version History

### v_idk im not in a mood rn
- Fixed the damn @SideOnly duplicated shit
- Moved some libs to mcp/lib
- Changed from com to net workout
- Added universal jar as runtime and renamed to fmlrelaunch-9.11.1.965
- Changed the mcp to match the correct game version
- some cleanup

## TODO: SCALAC