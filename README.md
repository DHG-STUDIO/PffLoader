# Pffloader
<br />
<br />
このライブラリーはFabricAPIのみで作成された複数のバージョンに対応したmodをビルドできるライブラリーです。<br />
現在は開発中であるため仕様が変わったり、不具合があるかもしれません。<br />
※Minecraftのアップデート等、様々なバージョンの対応等により大幅に仕様が変更される可能性もあります <br />

## MODローダー
[FabricMC](https://fabricmc.net/)

### 前提mod
[FabricAPI](https://modrinth.com/mod/fabric-api)

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
    modImplementation "com.ptk671:pffloader-MinecrftVersion:${rootProject.pffloader_version}"
}
```
「MinecrftVersion」という所に対象のminecraftのバージョンを記入してください <br />
https://maven.ptk671.com/com/ptk671/ <br />

`gradle.properties`
```properties
pffloader_version=x.x.x
```

Samplemod <br />
https://github.com/Ptkiuo/PffLoader-SampleCode