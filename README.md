# Pffloader
# Japanse

このライブラリーはFabricAPIのみで作成された複数のバージョンに対応したmodをビルドできるライブラリーです。<br />
現在は開発中であるため仕様が変わったり、不具合があるかもしれません。<br />
※Minecraftのアップデート等、様々なバージョンの対応等により大幅に仕様が変更される可能性もあります <br />

## MODローダー
[FabricMC](https://fabricmc.net/) <br />
[LegacyFabric(1.12.2 以前)](https://legacyfabric.net/)
### 前提mod
[FabricAPI](https://modrinth.com/mod/fabric-api) <br />
[LegacyFabricApi(1.12.2 以前)](https://modrinth.com/mod/legacy-fabric-api/)

### 使い方
`build.gradle`
```groovy
repositories {
    maven {
        url = "https://maven.ptk671.com/"
        // サーバー2 url = "https://ptkiuo.github.io/maven/"
    }
}

dependencies {
    modImplementation "com.ptk671:pffloader-MinecrftVersion:${rootProject.pffloader_version}
}
```
「MinecrftVersion」という所に対象のminecraft対象のマインクラフトのバージョンを入力してください <br />
https://maven.ptk671.com/com/ptk671/ <br />

`gradle.properties`
```properties
pffloader_version=x.x.x
```

Samplemod <br />
https://github.com/Ptkiuo/PffLoader-SampleCode

# English
This library is a library that can build mods for multiple versions created only with FabricAPI. <br />
Currently, it is under development, so there may be specification changes or bugs. <br />
The specifications may change drastically due to updates to Minecraft and other various version support, etc. <br />
<br />

## MOD Loader
[FabricMC](https://fabricmc.net/) <br />
[LegacyFabric(1.12.2 before)](https://legacyfabric.net/)

### Required mods
[FabricAPI](https://modrinth.com/mod/fabric-api) <br />
[LegacyFabricApi(1.12.2 before)](https://modrinth.com/mod/legacy-fabric-api/)

### How to use

```groovy
repositories {
    maven {
        url = "https://maven.ptk671.com/"
// Server2 url = "https://ptkiuo.github.io/maven/"
    }
}

dependencies {
    modImplementation "com.ptk671:pffloader-MinecrftVersion:${rootProject.pffloader_version}
}
```
Fill in the "MinecraftVersion" field with the target minecraft version. <br />
https://maven.ptk671.com/com/ptk671/ <br />

`gradle.properties`
```properties
pffloader_version=x.x.x
```

Samplemod <br />
https://github.com/Ptkiuo/PffLoader-SampleCode <br />
# Supported Versions
1.21.1 <br />
1.21 <br />
1.20x <br />
1.19x <br />
1.18x <br />
1.17x <br />
1.16.5 <br />
1.16.4 <br />
1.16.3 <br />
1.16.2 <br />
1.15x <br />
1.14.4 <br />
1.12x <br />
1.8x <br />