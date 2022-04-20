//package nova.committee.mcmodwiki.service;
//
//import nova.committee.mcmodwiki.core.model.*;
//import okhttp3.ResponseBody;
//import retrofit2.http.GET;
//import retrofit2.http.Query;
//import retrofit2.http.Url;
//
//import java.util.List;
//
//public interface McModService {
//
//
//    @GET("s")
//    List<SearchResult> search(
//            @Query("key") String key,
//            @Query("filter") int filter,
//            @Query("page")int page
//    );
//
//
//    @GET
//    WikiItem getItem(@Url String url);
//
//    @GET
//    WikiModule getModule(@Url String url);
//
//    @GET
//    WikiCourse getCourse(@Url String url);
//
//    @GET
//    ResponseBody downloadFile(@Url String url);
//
//
//}
