# MinehutService

[![](https://jitpack.io/v/Echological/MinehutService.svg)](https://jitpack.io/#Echological/MinehutService)

> Maven Setup
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```xml
<dependency>
    <groupId>com.github.Echological</groupId>
    <artifactId>MinehutService</artifactId>
    <version>1.0</version>
    <scope>compile</scope>
</dependency>
```

> Usage
```java
MinehutService.name((String name) -> {})
```

```java
MinehutService.online((Boolean online) -> {})
```

```java
MinehutService.server((JSONObject server) -> {})
```

```java
MinehutService.motd((String motd) -> {})
```

```java
MinehutService.players((JSONArray players) -> {})
```
*All methods can also return their datatype, rather than using a constructor*