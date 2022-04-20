//package nova.committee.mcmodwiki.util;
//
//import okhttp3.ResponseBody;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.safety.Safelist;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//
///**
// * Description:
// * Author: cnlimiter
// * Date: 2022/4/18 21:18
// * Version: 1.0
// */
//public class WikiUtil {
//
//    public static String labelReplace(Elements elements){
//        Safelist whitelist = new Safelist();
//        whitelist.addTags("p");
//        whitelist.addTags("br");
//        whitelist.addAttributes("img", "data-src");
//        var body = Jsoup.clean(elements.html(), whitelist);
//        body = body.replace("<p>", "");
//        body = body.replace("</p>", "");
//        body = body.replace("&nbsp;", " ");
//        body = body.replace("<br>", "\n");
//        return body;
//    }
//
//    public static Document parse(ResponseBody responseBody) throws IOException {
//      return  Jsoup.parse(responseBody.string());
//    }
//
//    public static String substringBetween(String body ,String startStr, String endStr){
//        int start = body.indexOf(startStr);
//        if (start != -1) {
//            int end = body.indexOf(endStr, start + startStr.length());
//            if (end != -1) {
//                return body.substring(start + startStr.length(), end);
//            }
//        }
//        return "";
//    }
//}
