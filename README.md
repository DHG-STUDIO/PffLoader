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
      23w35a
      23w33a
      23w32a
      23w31a
      1.20.x
      1.20-rc1
      1.20-pre7
      1.20-pre6
      1.20-pre5
      1.20-pre4
      1.20-pre3
      1.20-pre2
      1.20-pre1
      23w18a
      22w24a
      1.19.2
      1.19.1
      1.19
      22w19a
      22w18a
      22w17a
      22w16a
      22w15a
      22w14a
      22w13oneblockatatime
      22w13a
      22w12a
      22w11a
      22w07a
      22w06a
      22w05a
      22w03a
      1.18.x
      21w44a
      21w43a
      21w42a
      21w41a
      21w40a
      21w39a
      21w38a
      21w37a
      1.17.x
      1.16.5
      1.16.5-rc1
      20w51a
      20w49a
      20w48a
      20w46a
      20w45a
      1.16.4
      1.16.4-rc1
      1.16.4-pre2
      1.16.4-pre1
      1.16.3
      1.16.3-rc1
      1.16_combat-6
      1.16_combat-5
      1.16_combat-4
      1.16_combat-3
      1.16_combat-2
      1.16_combat-1
      1.16.2
      1.15x
      19w46b
      19w46a
      19w45b
      19w45a
      1.14_combat-3
      19w44a
      19w43a
      19w42a
      19w41a
      19w40a
      19w39a
      19w38b
      19w37a
      19w36a
      19w35a
      19w34a
      1.14_combat-0
      1.14.4
※一部のスナップショットでは使用できない可能性もあります。