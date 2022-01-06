# MinehutService

[![](https://jitpack.io/v/Echological/MinehutService.svg)](https://jitpack.io/#Echological/MinehutService)

## Maven Setup

#### Jitpack Repo
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

#### GitHub Depend
```xml
<dependency>
    <groupId>com.github.Echological</groupId>
    <artifactId>MinehutService</artifactId>
    <version>{VERSION}</version>
    <scope>compile</scope>
</dependency>
```

## Usage
#### MinehutServer

```java
MinehutServer.name(); // Gets the name of the server

MinehutServer.online(); // Gets the online state boolean

MinehutServer.server(); // Gets the JSON data of the server

MinehutServer.motd(); // Gets the MOTD of the server

MinehutServer.players(); // Gets a list of player uuids of those on the server

MinehutServer.installedContent(); // Gets a list of installed content by id 
        
MinehutServer.id(); // Gets the ID of the server
```

#### MarketProducts

```java
MarketProducts.products(); // Gets a list of all product objects

MarketProoducts.product(id); // Gets a market product by ID
```

#### MinehutService

```java
MinehutService.mainApi(); // Gets the base url for the Minehut API

MinehutService.mainApi(endpoint); // Gets the base url and an endpoint

MinehutService.productsApi(); // Gets the products api url
```