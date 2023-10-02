# Client Core Netty HTTP plugin library for Java

Client Core Netty HTTP client is a plugin for the `client-core` HTTP client API.

## Getting started

### Prerequisites

- A [Java Development Kit (JDK)][jdk_link], version 8 or later.

### Include the package
#### Include the BOM file

Please include the client-sdk-bom to your project to take dependency on the General Availability (GA) version of the library. In the following snippet, replace the {bom_version_to_target} placeholder with the version number.
To learn more about the BOM, see the [AZURE SDK BOM README](https://github.com/Client/client-sdk-for-java/blob/main/sdk/boms/client-sdk-bom/README.md).

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.client</groupId>
            <artifactId>client-sdk-bom</artifactId>
            <version>{bom_version_to_target}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
and then include the direct dependency in the dependencies section without the version tag.

```xml
<dependencies>
  <dependency>
    <groupId>com.client</groupId>
    <artifactId>client-core-http-netty</artifactId>
  </dependency>
</dependencies>
```

#### Include direct dependency
If you want to take dependency on a particular version of the library that is not present in the BOM,
add the direct dependency to your project as follows.

[//]: # ({x-version-update-start;com.client:client-core-http-netty;current})
```xml
<dependency>
    <groupId>com.client</groupId>
    <artifactId>client-core-http-netty</artifactId>
    <version>1.13.7</version>
</dependency>
```
[//]: # ({x-version-update-end})

## Key concepts

## Examples

The following sections provide several code snippets covering some of the most common client configuration scenarios.

- [Create a Simple Client](#create-a-simple-client)
- [Create a Client with Proxy](#create-a-client-with-proxy)
- [Create a Client with HTTP/2 Support](#create-a-client-with-http2-support)
- [Create a Client with Custom Max Chunk Size](#create-a-client-with-custom-max-chunk-size)

### Create a Simple Client

Create a Netty HttpClient that uses port 80 and has no proxy.

```java readme-sample-createBasicClient
HttpClient client = new NettyAsyncHttpClientBuilder().build();
```

### Create a Client with Proxy

Create a Netty HttpClient that is using a proxy.

```java readme-sample-createProxyClient
HttpClient client = new NettyAsyncHttpClientBuilder()
    .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("<proxy-host>", 8888)))
    .build();
```

### Create a Client with HTTP/2 Support

Create a Netty HttpClient that supports both the HTTP/1.1 and HTTP/2 protocols, with HTTP/2 being the preferred
protocol.

```java readme-sample-useHttp2WithConfiguredNettyClient 
// Constructs an HttpClient that supports both HTTP/1.1 and HTTP/2 with HTTP/2 being the preferred protocol.
HttpClient client = new NettyAsyncHttpClientBuilder(reactor.netty.http.client.HttpClient.create()
    .protocol(HttpProtocol.HTTP11, HttpProtocol.H2))
    .build();
```

It is also possible to create a Netty HttpClient that only supports HTTP/2.

```java readme-sample-useHttp2OnlyWithConfiguredNettyClient
// Constructs an HttpClient that only supports HTTP/2.
HttpClient client = new NettyAsyncHttpClientBuilder(reactor.netty.http.client.HttpClient.create()
    .protocol(HttpProtocol.H2))
    .build();
```

### Create a Client with Custom Max Chunk Size

Create a Netty HttpClient that uses a custom max chunk size.

```java readme-sample-customMaxChunkSize
// Constructs an HttpClient with a modified max chunk size.
// Max chunk size modifies the maximum size of ByteBufs returned by Netty (later converted to ByteBuffer).
// Changing the chunk size can positively impact performance of APIs such as Storage's download to file methods
// provided in client-storage-blob, client-storage-file-datalake, and client-storage-file-shares (32KB - 64KB have
// shown the most consistent improvement).
HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactor.netty.http.client.HttpClient.create()
    .httpResponseDecoder(httpResponseDecoderSpec -> httpResponseDecoderSpec.maxChunkSize(64 * 1024)))
    .build();
```

## Next steps

Get started with Client libraries that are [built using Client Core](https://azure.github.io/client-sdk/releases/latest/#java).

## Troubleshooting

If you encounter any bugs, please file issues via [GitHub Issues](https://github.com/Client/client-sdk-for-java/issues/new/choose)
or checkout [StackOverflow for Client Java SDK](https://stackoverflow.com/questions/tagged/client-java-sdk).

### Enabling Logging

Client SDKs for Java provide a consistent logging story to help aid in troubleshooting application errors and expedite
their resolution. The logs produced will capture the flow of an application before reaching the terminal state to help
locate the root issue. View the [logging][logging] wiki for guidance about enabling logging.

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Client/client-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
1. Create your feature branch (`git checkout -b my-new-feature`)
1. Commit your changes (`git commit -am 'Add some feature'`)
1. Push to the branch (`git push origin my-new-feature`)
1. Create new Pull Request

<!-- Links -->
[logging]: https://github.com/Client/client-sdk-for-java/wiki/Logging-with-Client-SDK
[jdk_link]: https://docs.microsoft.com/java/azure/jdk/?view=client-java-stable

![Impressions](https://client-sdk-impressions.azurewebsites.net/api/impressions/client-sdk-for-java%2Fsdk%2Fcore%2Fclient-core-http-netty%2FREADME.png)