//package nova.committee.mcmodwiki.service.response;
//
//import nova.committee.mcmodwiki.core.model.WikiItem;
//import okhttp3.ResponseBody;
//import org.jetbrains.annotations.Nullable;
//import retrofit2.Converter;
//import retrofit2.Retrofit;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Type;
//
///**
// * Description:
// * Author: cnlimiter
// * Date: 2022/4/18 17:47
// * Version: 1.0
// */
//public class MainResponse extends Converter.Factory {
//    @Nullable
//    @Override
//    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
//        if (type.equals(WikiItem.class)) {
//            new ItemResponseHandler();
//        }
//
//
//        return super.responseBodyConverter(type, annotations, retrofit);
//    }
//
//}
