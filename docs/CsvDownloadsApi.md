# CsvDownloadsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCsvDownload**](CsvDownloadsApi.md#createCsvDownload) | **POST** /phone_numbers/csv_downloads | Create a Csv download
[**listCsvDownloads**](CsvDownloadsApi.md#listCsvDownloads) | **GET** /phone_numbers/csv_downloads | List Csv downloads
[**retrieveCsvDownload**](CsvDownloadsApi.md#retrieveCsvDownload) | **GET** /phone_numbers/csv_downloads/{id} | Retrieve a Csv download

<a name="createCsvDownload"></a>
# **createCsvDownload**
> CsvDownloadResponse createCsvDownload()

Create a Csv download

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
try {
    CsvDownloadResponse result = apiInstance.createCsvDownload();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#createCsvDownload");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CsvDownloadResponse**](CsvDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCsvDownloads"></a>
# **listCsvDownloads**
> ListCsvDownloadsResponse listCsvDownloads(pageNumber, pageSize)

List Csv downloads

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListCsvDownloadsResponse result = apiInstance.listCsvDownloads(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#listCsvDownloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListCsvDownloadsResponse**](ListCsvDownloadsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCsvDownload"></a>
# **retrieveCsvDownload**
> CsvDownloadResponse retrieveCsvDownload(id)

Retrieve a Csv download

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
String id = "id_example"; // String | Identifies the CSV download.
try {
    CsvDownloadResponse result = apiInstance.retrieveCsvDownload(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#retrieveCsvDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the CSV download. |

### Return type

[**CsvDownloadResponse**](CsvDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
