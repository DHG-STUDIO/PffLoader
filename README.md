# Pffloader
<br />
<br />
このライブラリーはFabricAPIのみで作成された複数のバージョンに対応したmodをビルドできるライブラリーです。<br />
現在は開発中であるため仕様が変わったり、不具合があるかもしれません。<br />
※Minecraftのアップデート等、様々なバージョンの対応等により大幅に仕様が変更される可能性もあります <br />

Item (完成) <br />
Block (一部開発中) <br />
BlockItem (完成) <br />
ItemGroup (完成) <br />

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
    modImplementation "com.ptk671:pffloader-MinecrftVersion:${rootProject.pffloader_version}
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

### 対応バージョン
      1.21
      23w31a ~ 23w35a
      1.20x
      1.20-rc1
      1.20-pre1 ~ pre7
      23w18a
      22w24a
      1.19x
      22w13oneblockatatime
      22w03a ~ 22w19a
      1.18.x
      21w37a ~ 21w44a
      1.17.x
      1.16.5
      1.16.5-rc1
      20w45a ~ 20w51a
      1.16.4
      1.16.4-rc1
      1.16.4-pre2
      1.16.4-pre1
      1.16.3
      1.16.3-rc1
      1.16_combat-1 ~ combat-6
      1.16.2
      1.15x
      19w45a ~ 19w46b
      1.14_combat-3
      19w34a ~ 19w44a
      1.14_combat-0
      1.14.4
※一部のスナップショットでは使用できない可能性もあります。