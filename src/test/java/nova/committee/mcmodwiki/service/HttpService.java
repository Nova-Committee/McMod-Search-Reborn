//package nova.committee.mcmodwiki.service;
//
//import nova.committee.mcmodwiki.service.response.MainResponse;
//import okhttp3.Interceptor;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.jetbrains.annotations.NotNull;
//import retrofit2.Retrofit;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
///**
// * Description:
// * Author: cnlimiter
// * Date: 2022/4/18 16:25
// * Version: 1.0
// */
//public class HttpService {
//
//
//
//    public static class UserAgentInterceptor implements Interceptor{
//
//        @NotNull
//        @Override
//        public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
//            Request request = chain.request()
//                    .newBuilder()
//                    // 拦截请求，移除默认 User-Agent
//                    .removeHeader("User-Agent")
//                    .addHeader(
//                            "User-Agent",
//                            "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1"
//                    )
//                    .build();
//            return chain.proceed(request);
//        }
//    }
//
//
//    public static OkHttpClient mainService(){
//        return new OkHttpClient.Builder()
//                .connectTimeout(15, TimeUnit.SECONDS)
//                .readTimeout(15, TimeUnit.SECONDS)
//                .writeTimeout(15, TimeUnit.SECONDS)
//                .addInterceptor(new UserAgentInterceptor())
//                .build();
//    }
//
//
//
//    public static McModService mcModService(){
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://search.mcmod.cn/")
//                .client(mainService())
//                .addConverterFactory(new MainResponse())
//                .build();
//        return retrofit.create(McModService.class);
//    }
//
//
//}
