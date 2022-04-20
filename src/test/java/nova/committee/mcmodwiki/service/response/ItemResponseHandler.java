//package nova.committee.mcmodwiki.service.response;
//
//import nova.committee.mcmodwiki.core.model.WikiItem;
//import nova.committee.mcmodwiki.util.WikiUtil;
//import okhttp3.ResponseBody;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//import retrofit2.Converter;
//
//import java.io.IOException;
//
///**
// * Description:
// * Author: cnlimiter
// * Date: 2022/4/18 17:03
// * Version: 1.0
// */
//public class ItemResponseHandler implements Converter<ResponseBody, WikiItem> {
//
//    @Nullable
//    @Override
//    public WikiItem convert(@NotNull ResponseBody value) throws IOException {
//        var document = WikiUtil.parse(value);
//        var iconUrl = document.select("td > img").attr("src");
//        if(iconUrl != null){
//            iconUrl = document.select("td > img").attr("src");
//        }
//        else {
//            iconUrl = document.select("td > a > img").attr("src");
//        }
//        var name = document.select(".name").text();
//        var introduction = WikiUtil.labelReplace(document.select("[class=item-content common-text font14]"));
//        var tabUrl = "https://www.mcmod.cn" + document.select("[class=common-icon-text item-table] > a").attr("href");
//
//        return new WikiItem(
//                iconUrl,
//                name,
//                introduction,
//                tabUrl
//        );
//    }
//}
