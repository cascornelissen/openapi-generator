package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Client;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AnotherFakeApi {
  /**
   * To test special tags
   * To test special tags and operation ID starting with number
   * @param uuidTest to test uuid example value (required)
   * @param body client model (required)
   * @return Observable&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @HTTP(method = "PATCH", path = "another-fake/dummy", hasBody = true)
  Observable<Client> call123testSpecialTags(
    @retrofit2.http.Header("uuid_test") UUID uuidTest, @retrofit2.http.Body Client body
  );

}
